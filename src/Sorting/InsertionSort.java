package Sorting;

public class InsertionSort {

	
	static void insertSort(int[] a,int n )
	{
		for(int i =1;i<n;i++)
		{
			int p = a[i];
			insert(a,i,p);
		}
	}	
	
	static void insert(int[] a, int n, int x) {
		
		int i;
		for(i=n-1;i>=0&&x<a[i];i--)
		{
			a[i+1] = a[i];
		}
		a[i+1]= x;
		
	}

	public static void main(String[] args) {
		int[] a = new int[]{4,5,6,8,2,9,1,3,7};
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		insertSort(a,a.length);
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
