public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,key;
		int arr[]= {1,2,3,4,5,6,7,8,9};
		key=10;
		for(i=0;i<9;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Element is present at position "+i);
				break;
			}
		}
		if(i==arr.length)
		{
			System.out.println("Element not present in the array ");
		}

	}

}
