//Derin Ergul
//CSC-1350, Kundu
import java.util.Scanner;
public class ParkingTime
{ public static void main(String[] args)
  { int numDimesObtained, numMaxParkingMinutes, numNickelsObtained,
      numPenniesGiven, numPenniesRemaining, numPenniesUsed,
      numQuartersObtained;
  Scanner scan = new Scanner(System.in);
  //process 1st numPenniesGiven
  System.out.print("\nEnter number of pennies given (>= 0): ");
  numPenniesGiven = scan.nextInt();
  scan.nextLine();
  numQuartersObtained = numPenniesGiven / 25;
  numPenniesRemaining = numPenniesGiven % 25;
  numDimesObtained = numPenniesRemaining / 10;
  numPenniesRemaining %= 10;
  numNickelsObtained = numPenniesRemaining / 5;
  numPenniesRemaining %= 5;
  numPenniesUsed = (numPenniesGiven - numPenniesRemaining);
  numMaxParkingMinutes = ((numQuartersObtained * 30) + (numDimesObtained * 11) +
                          (numNickelsObtained * 5));
  System.out.println("#(pennies used) = " + numQuartersObtained + "x25 + " + numDimesObtained + 
                     "x10 + " + numNickelsObtained + "x5 = " + numPenniesUsed);
  System.out.println("Max. #(parking minutes) = " + numQuartersObtained + "x30 + " +
                    numDimesObtained + "x11 + " + numNickelsObtained + "x5 = " + 
                    numMaxParkingMinutes + " (using " + numPenniesUsed + " pennies out of " +
                    numPenniesGiven + ")");

  //process 2nd numPenniesGiven
  System.out.print("\nEnter number of pennies given (>= 0): ");
  numPenniesGiven = scan.nextInt();
  scan.nextLine();
  numQuartersObtained = numPenniesGiven / 25;
  numPenniesRemaining = numPenniesGiven % 25;
  numDimesObtained = numPenniesRemaining / 10;
  numPenniesRemaining %= 10;
  numNickelsObtained = numPenniesRemaining / 5;
  numPenniesRemaining %= 5;
  numPenniesUsed = (numPenniesGiven - numPenniesRemaining);
  numMaxParkingMinutes = ((numQuartersObtained * 30) + (numDimesObtained * 11) +
                          (numNickelsObtained * 5));
  System.out.println("#(pennies used) = " + numQuartersObtained + "x25 + " + numDimesObtained + 
                     "x10 + " + numNickelsObtained + "x5 = " + numPenniesUsed);
  System.out.println("Max. #(parking minutes) = " + numQuartersObtained + "x30 + " +
                    numDimesObtained + "x11 + " + numNickelsObtained + "x5 = " + 
                    numMaxParkingMinutes + " (using " + numPenniesUsed + " pennies out of " +
                    numPenniesGiven + ")");

  //process 3rd numPenniesGiven
  System.out.print("\nEnter number of pennies given (>= 0): ");
  numPenniesGiven = scan.nextInt();
  scan.nextLine();
  numQuartersObtained = numPenniesGiven / 25;
  numPenniesRemaining = numPenniesGiven % 25;
  numDimesObtained = numPenniesRemaining / 10;
  numPenniesRemaining %= 10;
  numNickelsObtained = numPenniesRemaining / 5;
  numPenniesRemaining %= 5;
  numPenniesUsed = (numPenniesGiven - numPenniesRemaining);
  numMaxParkingMinutes = ((numQuartersObtained * 30) + (numDimesObtained * 11) +
                          (numNickelsObtained * 5));
  System.out.println("#(pennies used) = " + numQuartersObtained + "x25 + " + numDimesObtained + 
                     "x10 + " + numNickelsObtained + "x5 = " + numPenniesUsed);
  System.out.println("Max. #(parking minutes) = " + numQuartersObtained + "x30 + " +
                    numDimesObtained + "x11 + " + numNickelsObtained + "x5 = " + 
                    numMaxParkingMinutes + " (using " + numPenniesUsed + " pennies out of " +
                    numPenniesGiven + ")");
  }
}