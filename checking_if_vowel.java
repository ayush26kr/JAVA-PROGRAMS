import java.util.Scanner;
public class checking_if_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch=obj.next().charAt(0);
		int i=0;
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':i++;
		}
		if(i==1)
			System.out.println("Entered character "+ch+" is a Vowel ");
		else if((ch>='a'&&ch<='z')||(ch>='A' && ch<='Z'))
			System.out.println("Entered character "+ch+" is a Consonent ");
		else
			System.out.println("Not an Alphabet ");
		
		

	}

}
