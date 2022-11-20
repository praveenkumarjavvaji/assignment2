
public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {2,30,4,5,6,7,2,1,1,4,5,6,90,60,40};
		System.out.println("the duplicate elements in the array");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[j]+ " ");
				}
			}
		}
			
	
		
 
	}

}
