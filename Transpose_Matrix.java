import java.util.Scanner;
public class Transpose_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows : ");
	int rows=sc.nextInt();
	System.out.println("Enter number of columns: ");
	int cols=sc.nextInt();
	int n,i,j,temp;
	if(rows>=cols)
		n=rows;
	else
		n=cols;
	int mat[][]=new int[n][n];
	
	//Input matrix elements from the user
	System.out.println("Enter elements of the matrix : ");
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			mat[i][j]=sc.nextInt();
		}
	}
	
	//showing the original matrix
	System.out.println("Original Matrix is - ");
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			System.out.print(mat[i][j]+" ");
			
		}
		System.out.println();
	}
	
	//Transposing
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			temp=mat[i][j];
			mat[i][j]=mat[j][i];
			mat[j][i]=temp;
		}
	}
	
	System.out.println("Transpose of the matrix: ");
	for(i=0;i<cols;i++)
	{
		for(j=0;j<rows;j++)
		{
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
	

	}

}
