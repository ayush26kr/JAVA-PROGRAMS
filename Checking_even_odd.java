import java.util.Scanner;
public class Checking_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number to check: ");
	num=obj.nextInt();
	if(num%2==0) {
		System.out.println("It is a even number ");
	}
	else {
		System.out.println("It is a odd number ");
	}

	}

}
