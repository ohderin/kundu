//Derin Ergul
//CSC-1350, Kundu

import java.util.Arrays;
import java.util.Scanner;
public class BinaryAddition2
{ final int[] binaryNum, binaryNum2, powerOf2Factors;

public BinaryAddition2(int num, int num2, int numBits)
{ powerOf2Factors = new int[numBits];
  powerOf2Factors[numBits - 1] = 1;
  for (int i = 1; i < numBits - 2; i++)
      powerOf2Factors[i] = 2 * powerOf2Factors[i+1];
  int minInt = -powerOf2Factors[0];
  Scanner scan = new Scanner(System.in);
  num = scan.nextInt(); num2 = scan.nextInt();
  binaryNum = decimalToBinary(num, numBits, minInt);
  binaryNum2 = decimalToBinary(num2, numBits, minInt);
  System.out.println("binary array-form: " + Arrays.toString(binaryNum) + 
                     " of num = " + num);
  System.out.println("binary array-form: " + Arrays.toString(binaryNum2) + 
                     " of num2 = " + num2);
}

private static int[] decimalToBinary(int decNumber, int numBits, int minValue) 
{ int[] bits = new int[numBits]; 
  if (decNumber < 0) { bits[0] = 1; decNumber -= minValue; }
     for (int i = numBits - 1; decNumber > 0; decNumber /= 2, i--) 
         bits[i] = decNumber % 2;
  return bits;
}

public int[] addBinaryNums(int carry, int bitSum, int[] binarySum)
{ carry = binaryNum.length < binaryNum2.length ? binaryNum.length : binaryNum2.length;
  for (int i = 0; i < binaryNum.length; i++)
      binarySum[i] = binaryNum[i] + binaryNum2[i];
  return binarySum;
}

public int binaryToDecimal(int[] binaryNum)
{ int num = binaryNum[binaryNum.length - 1];
  for (int i = binaryNum.length - 2; i > 0; i--)  
  {   powerOf2Factors *= 2;
      num += powerOf2Factors * binaryNum[i];
  }
  if (1 == binaryNum[0]) num -= 2 * powerOf2Factors;
  powerOf2Factors = new int[binaryNum];
  return
}

public static void testAddition2()
{ int num, num2, sum, numBits = 6, binarySum[], 
      integerPairs[][] = {{-15, -20}, {0, 16}, {-32, 17}, {-17, 31}, {-13, -19}};
}

public static void main(String[] args) 
{ Scanner scan = new Scanner(System.in);
  System.out.print("\nEnter number of bits (>= 1 and <= 10): ");
  int numBits = scan.nextInt();
  for (int i = 0; i < 5; i++)
      new BinaryAddition(numBits);
}
}