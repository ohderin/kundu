//Derin Ergul
//CSC-1350, Kundu

import java.util.Scanner;
public class Binary4BitAdd
{ static int b13, b12, b11, b10, //First 4-bit binary integer
             b23, b22, b21, b20; //Second 4-bit binary integer

  public static void readInput()
  { System.out.print("\nEnter the bits of two 4-bit binary integers separated by" +
                     " \" + \" \n      and a space between the bits: ");
  Scanner scan = new Scanner(System.in);
  b13 = scan.nextInt();
  b12 = scan.nextInt();
  b11 = scan.nextInt();
  b10 = scan.nextInt();
  scan.next();
  b23 = scan.nextInt();
  b22 = scan.nextInt();
  b21 = scan.nextInt();
  b20 = scan.nextInt();
  }

  public static int binaryToDecimal(int b3, int b2, int b1, int b0)
  { return (-8*b3 + 4*b2 + 2*b1 + b0);
  }

  public static void addAndPrint()
  { int b0, b1, b2, b3, carry;
  b0 = b10 + b20;
  carry = b0/2;
  b0 = b0%2;
  b1 = b11 + b21 + carry;
  carry = b1/2;
  b1 = b1%2;
  b2 = b12 + b22 + carry;
  carry = b2/2;
  b2 = b2%2;
  b3 = (b13 + b23 + carry) % 2;
  System.out.println("Binary sum: " + b3 + " " + b2 + " " + b1 +
                     " " + b0 + " = " + binaryToDecimal(b3, b2, b1, b0));            
  }
  
  public static void main(String[] args)
  { for (int i = 0; i < 5; i++)
    {   readInput();
        int first = binaryToDecimal(b13, b12, b11, b10),
            second = binaryToDecimal(b23, b22, b21, b20);
        System.out.println("1st 4-bit binary input integer: " + b13 + " " + 
                           b12 + " " + b11 + " " + b10 + " = " + first);
        System.out.println("2nd 4-bit binary input integer: " + b23 + " " +
                           b22 + " " + b21 + " " + b20 + " = " + second);
        addAndPrint();
    }
  }
}