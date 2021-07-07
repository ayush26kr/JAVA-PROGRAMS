import java.util.Scanner;
public class check_palindrome {
	static int cal_reverse(int num)
	{
		int reverse=0;
		while(num>0)
		{
			int pop=num%10;
			num/=10;
			reverse=reverse*10+pop;
		}
		return reverse;
	}
	static void check_plaindrome(int num)
	{
		int rev=cal_reverse(num);
		if(rev==num) {
			System.out.println("It is a Palindrome ");
		}
		else
		{
			System.out.println("It is not a Palindrome ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=obj.nextInt();
		check_plaindrome(num);
	}

}
