package java;
/*백준 1330문제*/
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 0;
		Scanner scan = new Scanner(System.in);
		
		a= scan.nextInt();
		b= scan.nextInt();
		
		if(a>b) {System.out.println(">");}
		else if(a==b) {System.out.println("==");}
		else {System.out.println("<");}
	}

}
