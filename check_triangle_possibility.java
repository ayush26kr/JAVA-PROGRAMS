import java.util.Scanner;
public class check_triangle_possibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side 1 of the triangle: ");
		int side1=sc.nextInt();
		System.out.println("Enter side 2 of the triangle: ");
		int side2=sc.nextInt();
		System.out.println("Enter side 3 of the triangle: ");
		int side3=sc.nextInt();
		if((side1+side2)>side3&&(side2+side3)>side1&&(side3+side1)>side2)
			System.out.println("Triangle is possible");
		else
			System.out.println("Triangle is not possible");

	}

}
