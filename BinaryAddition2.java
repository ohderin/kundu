//Derin Ergul
//CSC-1350, Kundu

import java.util.Arrays;
public class BinaryAddition2
{ final int[] binaryNum, binaryNum2, powerOf2Factors;

  public BinaryAddition2(int num, int num2, int numBits)
  { powerOf2Factors = new int[numBits];
    powerOf2Factors[numBits - 1] = 1;
    for (int i = numBits - 2; i >= 0; i--)
        powerOf2Factors[i] = 2 * powerOf2Factors[i + 1];
    int minInt = -powerOf2Factors[0];
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

  public int[] addBinaryNums()
  { int binarySum[] = new int[binaryNum.length], bitSum, carry = 0;
    for (int i = binaryNum.length - 1; i >= 1; i--)
    {   bitSum = binaryNum[i] + binaryNum2[i] + carry;
        carry = bitSum / 2;
        binarySum[i] = bitSum % 2;
    }
    binarySum[0] = (binaryNum[0] + binaryNum2[0] + carry) % 2;
    return (binarySum);
  }

  public int binaryToDecimal(int[] binaryNum)
  { int decNumber = binaryNum[binaryNum.length - 1];
    for (int i = binaryNum.length - 2; i > 0; i--)  
        if (1 == binaryNum[i]) decNumber += powerOf2Factors[i];
        if (1 == binaryNum[0]) decNumber -= powerOf2Factors[0];
    return decNumber;
  }

  public static void testAddition2()
  { int binarySum[], integerPairs[][] = {{-15, -20}, {0, 16}, {-32, 17}, {-17, 31}, {-13, -19}}, 
        num, num2, numBits = 6, sum;
    BinaryAddition2 ba2;
    for (int i = 0; i < integerPairs.length; i++)
    {   num = integerPairs[i][0]; num2 = integerPairs[i][1];
        ba2 = new BinaryAddition2(num, num2, numBits);
        binarySum = ba2.addBinaryNums();
        sum = ba2.binaryToDecimal(binarySum);
        if (-32 <= num + num2 && num + num2 <= 32)
           System.out.println("binary sum-array : " + Arrays.toString(binarySum) + 
                              "; its decimal form " + sum + " = num + num2");
        else 
           System.out.println("binary sum-array : " + Arrays.toString(binarySum) + 
                              "; its decimal form " + sum + " != num + num2");
    }
  }

  public static void main(String[] args) 
  { testAddition2();
  }
}