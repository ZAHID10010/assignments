package sorting;

import java.util.Arrays;

public class SortingMain {

	public static void main(String[] args) {
		int[] arr= {6,4,2,3,8,1};
		selectionSort(arr);
		//how to print array in a single line--> Arrays.toString(arr)
		System.out.println(Arrays.toString(arr));
		 

	}
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
