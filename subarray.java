
public class subarray {


		   static boolean isSubset(int arr1[], int arr2[], int p, int q)
		    {
		        int i = 0;
		        int j = 0;
		        for (i = 0; i < q; i++) {
		            for (j = 0; j < p; j++) {
		                if (arr2[i] == arr1[j])
		                    break;
		            }
		 
		            if (j == p)
		            return false;
		        }
		 
		        return true;
		    }
		 
		    public static void main(String args[])
		    {
		        int arr1[] = { 11, 10, 13, 21, 30, 70 };
		        int arr2[] = { 11, 30, 70, 10 };
		    
		        int p = arr1.length;
		        int q = arr2.length;
		 
		        if (isSubset(arr1, arr2, p, q))
		            System.out.print("arr2[] is subset of arr1[] ");
		        else
		            System.out.print("arr2[] is not subset of arr1[] ");
		 
		    }
		}


