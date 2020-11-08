import java.util.Scanner;
class address {
  public static void main(String[] args)
  {
  Scanner scan = new Scanner(System.in);  // Create a Scanner object
  System.out.println("Please Enter Your Name");
  String word1 = scan.nextLine();  // Read user input (name)
  System.out.println("Please Enter Address Line 1 and 2: ");
  String word2 = scan.nextLine(); // Read user input (Address)
  System.out.println ("Please Enter Your City:");
  String word3 = scan.nextLine(); // Read user input (City)
  System.out.println ("Please Enter Country of Residence:");
  String word4 = scan.nextLine(); //Read user input (Country)
  System.out.println ("Please Enter Your Postcode: ");
  String word5 = scan.nextLine();  // Read user input (Postcode)
  System.out.println ("Please Enter Your Email: ");
  String word6 = scan.nextLine(); // Read user input (Email Address)
  String output = "  \n " + word1 + " \n \n " + word2 + " \n " + word3 + " \n " + word4 + " \n   \n " + word5 + " \n  \n " + word6;
  System.out.println ( "\n You have Entered:"); 
  System.out.println(output + "\n");  // Output user input (Name, Address & Email)
  System.out.println ("Are your details correct: Yes or No?"); 
  String user = scan.nextLine(); // Read user input if yes operation complete
  
  scan.close();
 
  
  // need to learn how to get user to re input data if answer is no
 
  }
}
