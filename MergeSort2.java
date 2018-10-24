package com.laioffer.classone;

import java.util.Arrays;

public class MergeSort {
	public int[] mergeSort(int[] array) {
	    if (array == null || array.length == 0){
	      return array;
	    }
	    for (int i = 0; i < array.length; i++){
	      int minimum = array[i];
	      int minimumidx = i;
	      for (int j = i; j < array.length; j++){     
	        if (array[j] < minimum){
	            minimum = array[j];   
	            minimumidx = j;
	        }
	      }
	      swap(array, i , minimumidx);
	    }  
	    return array;
	  }
	  
	  private void swap(int[] array, int i , int j){
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	  }  
	  
public static void main(String[] args) {
	MergeSort solution = new MergeSort();
	
	int[]array = null;
	array = solution.mergeSort(array);
	System.out.println(Arrays.toString(array));
	
	array = new int[] {1,6,8,4};
	array = solution.mergeSort(array);
	System.out.println(Arrays.toString(array));
	array = new int[] {4,8,2,1};
	array = solution.mergeSort(array);
	System.out.println(Arrays.toString(array));
	
	array = new int[] {2,4,1,8,3};
	array = solution.mergeSort(array);
	System.out.println(Arrays.toString(array));
	}
}