package problem3;

import java.util.Scanner();
public class Int {
public static void main(String[] args)
{
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Number");
     int a=sc.nextInt();
     
     for(int i=1; i<=(a+(a-1)); i++)
     {
    	 if(i%2==0)
    	 {
    		 continue;
    	 }
    	 if(a%2==0)
    	 {
    		 for(int j=1; j<=(a+(a-3)); j++)	 
    		 {
    			 if(j%2==0)
    	    	 {
    	    		 continue;
    	    	 }
    	 System.out.print(j+","+" ");
    		 }
    		 break;
    	 }
    	 else {
    		 {
    			 System.out.print(i+","+" "); 
    		 }
		}
     



