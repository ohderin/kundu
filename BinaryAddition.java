//Derin Ergul
//CSC-1350, Kundu

import java.util.Arrays;
import java.util.Scanner;
public class BinaryAddition
{ final int[] binaryNum, binaryNum2;

public BinaryAddition(int numBits)
{ int powerOf2 = 1;
  for (int i = 1; i < numBits; i++)
      powerOf2 *= 2;
  int maxInt = powerOf2 - 1, minInt = -powerOf2;
  System.out.print("\nEnter two integers (>= " + minInt + " and <= " + maxInt +
                   ") separated by a blank: ");
  Scanner scan = new Scanner(System.in);
  int inputInt = scan.nextInt(), inputInt2 = scan.nextInt();
  binaryNum = decimalToBinary(inputInt, numBits, minInt);
  binaryNum2 = decimalToBinary(inputInt2, numBits, minInt);
  System.out.println("binary array-form: " + Arrays.toString(binaryNum) + 
                     " of inputInt = " + inputInt);
  System.out.println("binary array-form: " + Arrays.toString(binaryNum2) + 
                     " of inputInt2 = " + inputInt2);
}

private static int[] decimalToBinary(int decNumber, int numBits, int minValue) 
{ int[] bits = new int[numBits]; 
  if (decNumber < 0) { bits[0] = 1; decNumber -= minValue; }
  for (int i = numBits - 1; decNumber > 0; decNumber /= 2, i--) 
      bits[i] = decNumber % 2;
  return bits;
}

public static void main(String[] args) 
{ Scanner scan = new Scanner(System.in);
  System.out.print("\nEnter number of bits (>= 1 and <= 10): ");
  int numBits = scan.nextInt();
  for (int i = 0; i < 5; i++)
      new BinaryAddition(numBits);
}
}