
public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  a= {2,9,8,6,7,3,0};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
					{
				         if(a[j]<a[j-1])
				         {
				        	 int temp=a[j];
				        	 a[j]=a[j-1];
				        	 a[j-1]=temp;
				         }
					}
		}
		for (int elem:a) 
			
		{
			System.out.print(elem+ " ");
		}
		

	}

}
