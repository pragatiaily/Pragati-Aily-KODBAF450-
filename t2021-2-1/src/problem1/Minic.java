package problem1;
import java.util.Scanner;
public class Minic {
public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		Calculator m =new Calculator();
		System.out.println("Please Enter the First Number  := ");
		        m.a=s.nextDouble();
		        System.out.println("Please Enter the Second Number := ");
		        m.b=s.nextDouble();
		        
		  
		        System.out.println("Please Enter the mode of oppration you want to run :- ( +, -, *, / )");
		        char z=s.next().charAt(0);
		        switch (z)
		    	{
		    	case '+' : m.add();
		    					break;
		    	case '-' : m.sub();
		    	                break;
		    	case '*' : m.mul();
		    	                 break;
		    	case '/' : m.div();
		    	                break;
		    	default: System.out.println("Wrong Input");
	    		
	    		 }

	        s.close();
	
}

}
