//Palindrome Numbers between 1 and 1000
public class palindrome_between {
	
	static int check(int num)
	{
		int reverse=0;
		while(num!=0)
		{
			int pop=num%10;
			num=num/10;
			reverse=reverse*10+pop;
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Palindrome numbers between 1 and 1000 are - ");
		for(int i=1;i<=1000;i++)
		{
			int rev=check(i);
			if(i==rev)
			{
				System.out.println(i);
			}
		}

	}

}
