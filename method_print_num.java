//Printing all even numbers
import java.util.Scanner;
public class method_print_num {
	
	static void printnum(int num) {
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj=new Scanner(System.in);	
		int num;
		
		System.out.println("Enter a number: ");
		num=myobj.nextInt();
		printnum(num);

	}

}
