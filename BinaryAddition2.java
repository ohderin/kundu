//Derin Ergul
//CSC-1350, Kundu

import java.util.Arrays;
import java.util.Scanner;
public class BinaryAddition2 
{ final int[] binaryNum, binaryNum2, powerOf2Factors;

public BinaryAddition2(int num, int num2, int numBits)
{ powerOf2Factors = new int[numBits];
  powerOf2Factors[numBits - 1] = 1;
  for (int i = 1; i < numBits; i++)
      powerOf2Factors[i] = 2 * powerOf2Factors[i+1];
  int minInt = -powerOf2Factors[0];
  Scanner scan = new Scanner(System.in);
  num = scan.nextInt(); num2 = scan.nextInt();
  binaryNum = decimalToBinary(num, numBits, minInt);
  binaryNum2 = decimalToBinary(num2, numBits, minInt);
  System.out.println("binary array-form: " + Arrays.toString(binaryNum) + 
                     " of inputInt = " + num);
  System.out.println("binary array-form: " + Arrays.toString(binaryNum2) + 
                     " of inputInt2 = " + num2);
}

public int[] addBinaryNums()
{ int carry, bitsum, binarySum[];
  return binarySum[];
}

public int binaryToDecimal(int[] binaryNum)
{ powerOf2Factors = new int[binaryNum];
  return
}

public static void testAddition2()
{ int num, num2, sum, numBits = 6, binarySum[], 
      integerPairs[][] = {{-15, -20}, {0, 16}, {-32, 17}, {-17, 31}, {-13, -19}}, 
      BinaryAddition2 ba2
}

public static void main(String[] args) 
{ Scanner scan = new Scanner(System.in);
  System.out.print("\nEnter number of bits (>= 1 and <= 10): ");
  int numBits = scan.nextInt();
  for (int i = 0; i < 5; i++)
      new BinaryAddition(numBits);
}
}