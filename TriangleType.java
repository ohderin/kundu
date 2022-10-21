//Derin Ergul
//CSC-1350, Kundu

import java.util.Random;
public class TriangleType
{ int length, length2, length3;
  String triangleType;

  public TriangleType(int minLength, int maxLength, int randomSeed) 
  { Random rand = new Random(randomSeed);
    int numValsForLength = maxLength - minLength + 1;
    length = minLength + rand.nextInt(numValsForLength);
    length2 = minLength + rand.nextInt(numValsForLength);
    int minLength3 = Math.abs(length - length2) + 1, 
        maxLength3 = length + length2 - 1;
    if (minLength3 < minLength) minLength3 = minLength;
    if (maxLength3 > maxLength) maxLength3 = maxLength;
    length3 = minLength3 + rand.nextInt(maxLength3 - minLength3 + 1);
    System.out.println("\nInitially: " + minLength + " <= length = " + length +
                       ", length2 = " + length2 + " <= " + maxLength + " and " +
                       minLength3 + " <= length3 = " + length3 + " <= " + maxLength3);
    sortLengths();
    triangleType();
  }

  private void sortLengths()
  { int max, middle, min;
    if (length <= length2)
       if (length <= length3)
       {  min = length;
          if (length2 <= length3) { max = length3; middle = length2; }
          else { max = length2; middle = length3; }
       }
       else { max = length2; middle = length; min = length3; }
    else if (length2 <=length3)
         {  min = length2; 
            if (length <= length3) { max = length3; middle = length; }
            else max = length; middle = length3;
         }
         else { max = length; middle = length2; min = length3; }
    length = min; length2 = middle; length3 = max;
    System.out.println("After sorting: length = " + length + ", length2 = " + 
                       length2 + ", length3 = " + length3);
  }

  public void triangleType()
  { if (length == length2)
       if (length == length3) triangleType = "equilateral";
       else triangleType = "isosceles"; 
    else if (length2 == length3) triangleType = "isosceles";
         else triangleType = "scelene";
    System.out.println("The triangle (" + length + ", " + length2 + 
                       ", " + length3 + ") is " + triangleType  + ".");
  }

  public static void main(String[] args)
  { for (int i = 0; i < 5; i++)
        new TriangleType(4, 20, i);
    new TriangleType(4, 4, 1);
  }
}