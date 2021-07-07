import java.util.Scanner;
public class check_if_num_is_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a nummber to find composite/prime: ");
		int num=obj.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count>=1)
		{
			System.out.println("It is a COMPOSITE NUMBER ");
			
		}
		else
		{
			System.out.println("It is a PRIME NUMBER ");
		}

	}

}
