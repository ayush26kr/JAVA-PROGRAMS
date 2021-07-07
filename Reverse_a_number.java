import java.util.Scanner;
public class Reverse_a_number {

	static int reverse(int num) {
		int reverse=0;
		while(num>0)
		{
			int pop=num%10;
			num=num/10;
			reverse=reverse*10+pop;
		}
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num;
		num=obj.nextInt();
		System.out.println("Reverse of the Number is : ");
		System.out.println(reverse(num));

	}

}
