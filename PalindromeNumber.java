package Guvi2;
import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int a;
		int r=0;
		System.out.println("Enter a number");
		a=s.nextInt();
		int b=a;
		while(b!=0)
		{
			r=r*10; 
			r=r+b%10;
			b=b/10;
		}
		if(r==a)
		{
			System.out.println("The entered number is a Palindrome");
		}
		else
		{
			System.out.println("The entered number is not a Palindrome");
		}

	}

}
