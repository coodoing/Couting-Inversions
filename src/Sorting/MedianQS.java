package Sorting;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MedianQS  {
	static int coutingMiddle = 0;
	
	static int middlePartition(int[] arr,int l, int r)
	{
		int middle = chooseMiddle(arr,l,r);	
		int median = med3(arr,l,middle,r);
		swap(arr,l,median);		
		int pivot = arr[l];
		int i = l+1;
		int j = l+1;
		for(;j<=r;j++)
		{
			if(arr[j]<pivot)
			{
				swap(arr,i,j);
				i++;
			}
			coutingMiddle++;
		}
		swap(arr,l,i-1);
		return i-1;
	}
	
	static int chooseMiddle(int[] arr,int low,int high)
	{
		return low+(high-low)/2;
	}	
	
	static int median(int a, int b, int c) {
		return a>b?(a<c?a:(b>c?b:c)):(b<c?b:(a>c?a:c));
	}
	
	static int med3(int x[], int a, int b, int c) {
	    return x[a] < x[b] ? (x[b] < x[c] ? b : x[a] < x[c] ? c : a)
	            : x[b] > x[c] ? b : x[a] > x[c] ? c : a;
	}
	
	static void swap(int[] arr,int i,int j)
	{
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}	

	static void quickSort3(int[] arr,int low, int high)
	{
		int index;
		if(low<high)
		{
			index = middlePartition(arr,low,high);
			quickSort3(arr,low,index-1);
			quickSort3(arr,index+1,high);
		}
	}

	public static void main(String[] args) {		
		ArrayList<String> list = new ArrayList<String>();
		try {
		
			File file = new File("E:/PRO/Java/Data/QuickSort.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			br.close();
			fr.close();
		} catch (Exception ex) {
		}
		
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = Integer.parseInt(list.get(i));
		}			
		quickSort3(array,0,array.length-1);
		System.out.println("\nmiddle"+coutingMiddle);

	}
}