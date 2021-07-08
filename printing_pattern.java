import java.util.Scanner;
public class printing_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter size of the pattern: ");
		int size=obj.nextInt();
		System.out.println();
		for(int i=0;i<=size;i++)
		{
			for(int j=0;j<=size/2;j++)
			{
				if((i==j)||((i+j)==i)||(i+j==size))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
