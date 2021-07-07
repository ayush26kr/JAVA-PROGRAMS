import java.util.Scanner;
public class printing_using_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("Enter number: ");
		num=obj.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
		

	}

}
