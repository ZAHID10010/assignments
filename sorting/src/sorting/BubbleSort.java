package sorting;

import java.util.Arrays;

public class BubbleSort {
	

	public static void main(String[] args) {
		int[] arr= {9,2,6,4,7,1};
		//bubbleSort(arr);
		moreImpbubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

	private static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}		
		
		
	
private static void moreImpbubbleSort(int[] arr) {
boolean swapFlag=false;
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapFlag = true;
			}
		}
		if(!swapFlag) {
			break;
		}
	}
	
	
	
}


}

	