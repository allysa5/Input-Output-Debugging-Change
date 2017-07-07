import java.util.Scanner;

public class AskingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
	    double num1, num2, num3;

	    System.out.print( "First integer? " );
	    num1 = keyboard.nextDouble();

	    System.out.print( "Second integer? " );
	    num2 = keyboard.nextInt();

	    System.out.print( "Third integer? " );
	    num3 = keyboard.nextDouble();
	    keyboard.close();
	    
	    System.out.println(num1);
	    System.out.println(num2);
	    System.out.println(num3);
	}
    
	    //Input Output Change Assignment
	    
	{  
		Scanner keyboard = new Scanner(System.in);
	    int num1, num2, num3;

	    System.out.print( "First temperature? " );
	    num1 = keyboard.nextInt();

	    System.out.print( "Second temperature? " );
	    num2 = keyboard.nextInt();

	    System.out.println("the average value is"+ (num1+num2)/2);
	    keyboard.close();
	    
	    System.out.println("Thanks");
	}

}
