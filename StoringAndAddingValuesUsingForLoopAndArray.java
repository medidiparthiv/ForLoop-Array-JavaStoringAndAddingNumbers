import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner x = new Scanner(System.in);
	    int b = 0;
	    int[] y = new int[5];
	    
	    for(int i = 1; i<6; i++){
	        System.out.print("Enter Number Here : ");
	        y[i-1] = x.nextInt();
	    }
	    System.out.println();
	    System.out.println("The Sum of the Entered Values is : ");
	    for (int c = 1; c<6; c++){
	        b = y[c-1] + b;
	    }
	    System.out.println(b);
	}
}
