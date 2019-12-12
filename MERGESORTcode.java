import java.util.Scanner;
class MergeSort 
{  
 //coded by sravan yeruva
	void merge(int array[], int l, int m, int r) 
	{ 
		int n1 = m - l + 1; 
		int n2 = r - m; 
     //coded by sravan yeruva
		int L[] = new int [n1]; 
		int R[] = new int [n2]; 
		for (int i=0; i<n1; ++i) 
     //coded by sravan yeruva
			L[i] = array[l + i]; 
		for (int j=0; j<n2; ++j) 
			R[j] = array[m + 1+ j]; 
		int i = 0, j = 0; 
     //coded by sravan yeruva
		int k = l; 
		while (i < n1 && j < n2) 
		{ 
			if (L[i] <= R[j]) 
       //coded by sravan yeruva
			{ 
				array[k] = L[i]; 
				i++; 
			} 
			else
       //coded by sravan yeruva
			{ 
				array[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 
     //coded by sravan yeruva
		while (i < n1) 
		{ 
			array[k] = L[i]; 
			i++; 
			k++; 
		} 
		while (j < n2) 
     //coded by sravan yeruva
		{ 
			array[k] = R[j]; 
			j++; 
			k++; 
		} 
     //coded by sravan yeruva
	} 
	void sort(int array[], int l, int r) 
	{ 
		if (l < r) 
		{ 
			int m = (l+r)/2; 
       //coded by sravan yeruva
			sort(array, l, m); 
			sort(array , m+1, r); 
			merge(array, l, m, r); 
		} 
	} 
   //coded by sravan yeruva
public static void main(String args[]) 
{ 
int k;
 //coded by sravan yeruva
System.out.println("Please enter the size of the array:");
Scanner inputobject = new Scanner(System.in);
int Size = inputobject.nextInt();
 //coded by sravan yeruva
int array[] =new int[Size] ;
System.out.println("Please enter "+Size+ " no.of elements:" );
		for( k = 0; k < Size;k++)
{   //coded by sravan yeruva
int w = inputobject.nextInt();
array[k] = w;
}   //coded by sravan yeruva
	MergeSort ob = new MergeSort(); 
		ob.sort(array, 0, array.length-1);
	 //This code created by Sravan Yeruva
System.out.println("Array after performing Merge Sort:");
		for (int i = 0; i < Size; i++) 
			System.out.print(array[i] + " ");   //coded by sravan yeruva
	} 
} 

