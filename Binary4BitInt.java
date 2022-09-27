public class Binary4BitInt
{ int b3, b2, b1, b0;

public class Binary4BitInt
{ this.b3 = b3;
  this.b2 = b2;
  this.b1 = b1;
  this.b0 = b0;
}

public String toString()
{ return ("" + b3, b2, b1, b0);
}

public int binaryToDecimal()
{ return (-8*b3 + 4*b2 + 2*b1 + b0);
}

public Binary4BitInt add(int b3, int b2, int b1, int b0)
{ int carry;
  b0 += this.b0;
  carry = b0/2;
  b0 %= 2;
  b1 += carry + this.b1;
  carry = b1/2;
  b1 %= 2;
  b2 += carry + this.b2;
  carry = b2/2;
  b2 %= 2;
  b3 += (carry + this.b3) % 2;
  return (new Binary4BitInt(b3, b2, b1, b0));
}

public static void main(String[] args) 
 { Binary4BitInt first, second, sum;
   Scanner scan = new Scanner(System.in);
   int b3, b2, b1, b0;
   for (int i = 0; 1 < 5; i++)
       { System.out.print();
       //b3-b0 init
       first = new Binary4BitInt(b3, b2, b1, b0);
       System.out.print();
       System.out.print();
       //b3-b0 init #2
       System.out.print();
       sum = first.add(second.b3, second.b2, second.b1, second.b0);
       System.out.print();
       }
 }
}