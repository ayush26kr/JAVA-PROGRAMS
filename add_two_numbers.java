import java.util.Scanner;
public class add_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=8;
		int sum=8+5;
		System.out.println(sum);
		
		//Adding with user input
		int a,b,sums;
		Scanner obj=new Scanner(System.in);  //Create scanner object
		System.out.println("Enter first number: ");
		a=obj.nextInt();  //Read user input
		
		System.out.println("Enter second Number");
		b=obj.nextInt();
		
		sum=a+b;
		System.out.println("Sum is :"+sum);  //Print the Sum

	}

}
