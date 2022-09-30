//Derin Ergul
//CSC-1350, Kundu

import java.util.Scanner;
public class Binary4BitInt
{ int b3, b2, b1, b0;

public Binary4BitInt(int b3, int b2, int b1, int b0)
{ this.b3 = b3;
  this.b2 = b2;
  this.b1 = b1;
  this.b0 = b0;
}

public String toString()
{ return (b3 + " " + b2 + " " + b1 + " " + b0);
}

public int binaryToDecimal()
{ return (-8 * b3 + 4 * b2 + 2 * b1 + b0);
}

public Binary4BitInt add(int b3, int b2, int b1, int b0)
{ int carry;
  b0 += this.b0;
  carry = b0 / 2;
  b0 %= 2;
  b1 += carry + this.b1;
  carry = b1 / 2;
  b1 %= 2;
  b2 += carry + this.b2;
  carry = b2 / 2;
  b2 %= 2;
  b3 = (carry + b3 + this.b3) % 2;
  return (new Binary4BitInt(b3, b2, b1, b0));
}

public static void main(String[] args) 
{ Binary4BitInt first, second, sum;
  Scanner scan = new Scanner(System.in);
  int b3, b2, b1, b0;
  for (int i = 0; i < 5; i++)
      { System.out.print("\nEnter 1st 4-bit binary integer " + 
                         "(with a space between the bits): ");
      b3 = scan.nextInt();
      b2 = scan.nextInt();
      b1 = scan.nextInt();
      b0 = scan.nextInt();
      first = new Binary4BitInt(b3, b2, b1, b0);
      System.out.println("1st 4-bit binary integer: " + first.toString() + 
                         " = " + first.binaryToDecimal());
      System.out.print("\nEnter 2nd 4-bit binary integer " +
                       "(with a space between the bits): ");
      b3 = scan.nextInt();
      b2 = scan.nextInt();
      b1 = scan.nextInt();
      b0 = scan.nextInt();
      second = new Binary4BitInt(b3, b2, b1, b0);
      System.out.println("2nd 4-bit binary integer: " + second.toString() + 
                         " = " + second.binaryToDecimal());
      sum = first.add(second.b3, second.b2, second.b1, second.b0);
      System.out.println("Binary sum: " + sum + " = " + sum.binaryToDecimal());
      }
 }
}