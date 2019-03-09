package edu.iastate.cs228.hw05;


/**
 * 
 * @author Vismay Gehlot
 * 
 * NOTE:
 * 0. Put your Firstname and Lastname after above author tag.
 * 			Make sure that in both cases the first letter is uppercase
 *    and all others are lowercase.
 * 1. In all of these methods implementations you are allowed
 *    to use the StringBuilder class. 
 * 2. You are allowed to create and use your own private helper methods.
 * 3. No data fields can be introduced.
 * 4. No custom classes of your own can be introduced or used.
 * 5. Import statements are not allowed.
 * 6. Fully qualified class names usage is not allowed.
 * 7. You are allowed to reuse any part of the source codes provided
 *    or shown under lecture notes.
 * 
 */


public class SortingExercises
{
	/**
	 * Recursive implementation of selection sort.
	 * 
	 * @param arr Array of ints to be sorted in nondecreasing order.
	 */
 public static void selectionSort_Rec(int[] arr)
 {
  if(arr == null) throw new NullPointerException();
  if(arr.length == 0) throw new IllegalArgumentException();
  if(arr.length == 1) return;
  
  selectionSort(arr, 0);}
 

 private static void selectionSort(int[] arr, int index)
 {
	if (index == arr.length - 1)
	{
		return;
	}
	else
	{
		int min = index;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[min] > arr[i])
			{
				min = i;
			}
		}
		int temp = arr[index];
		arr[index] = arr[min];
		arr[min] = temp;
		
		selectionSort(arr, index + 1);	
	}
 }
 
 /**
  * Recursive implementation of insertion sort.
  * 
  * @param arr Array of ints to be sorted in nondecreasing order.
  */
 public static void insertionSort_Rec(int[] arr)
 {
 	if(arr == null) throw new NullPointerException();
  if(arr.length == 0) throw new IllegalArgumentException();
  if(arr.length == 1) return;
  
  insertionSort(arr, 0);
 }
 
 private static void insertionSort(int[] arr, int index)
 {
	 if(index == arr.length)
	 {
		 return;
	 }
	 int i = 0;
	 int temp = arr[index];
	 for (int j = 0, k = 0; i < index; i++, j--)
	 {
		arr[j] = arr[j - 1];
		j--;
		i = k;
	 }
	 arr[i] = temp;
	 
	 insertionSort(arr, index + 1);
 }
 
 /**
	 * Iterative implementation of selection sort with modifications as follows.
	 * On each pass in this case the method finds both the largest and smallest
	 * values in the unsorted portion of the array, and places them in the correct
	 * locations.
	 * 
	 * @param arr Array of ints to be sorted in nondecreasing order.
	 */
 public static void selectionSort_Itr(int[] arr)
 {
	 if(arr == null) throw new NullPointerException();
	 if(arr.length == 0) throw new IllegalArgumentException();
	 if(arr.length == 1) return;
	 
	 
 }
 
 /**
  * A bubble sort can sort an array of n entries into ascending order by 
  * makeing n-1 passes through the array. On each pass, it compares adjacent
  * entries and swaps them if they are out or order. For example, on the 
  * first pass, it compares the first and second entries, then the second and
  * third entries, and so on. At the end of the first pass, the largest entry
  * is in its proper position at the end of the array. We say that it has bubbled
  * to its correct spot. Each subsequent pass ignores the entries at the end of
  * the array, since they are sorted and are larger than any of the remaining
  * entries. Thus, each pass makes one fewer comparison than the previous pass.
  * Check the figure under HW05 assignment on Canvas.
  * 
  * This method implements bubble sort iteratively.
  * 
  * @param arr Array of objects (with specific bounds) to be sorted in nondecreasing order.
  */
 public static <T extends Comparable<? super T>> void bubbleSort_Itr(T[] arr)
 {
	 if(arr == null) throw new NullPointerException();
	 if(arr.length == 0) throw new IllegalArgumentException();
	 if(arr.length == 1) return;
  
	 T obj = null;
	 for (int i = 0; i < arr.length - 1; i++)
	 {
		 for (int j = 0; j < arr.length - 1 - i; j++)
		 {
			 if(arr[j].compareTo(arr[j + 1]) > 0)
			 {
				 obj = arr[j];
				 arr[j] = arr[j + 1];
				 arr[j + 1] = obj;
			 }
		 }
	 }
 }
 
 /**
  * A bubble sort can sort an array of n entries into ascending order by 
  * makeing n-1 passes through the array. On each pass, it compares adjacent
  * entries and swaps them if they are out or order. For example, on the 
  * first pass, it compares the first and second entries, then the second and
  * third entries, and so on. At the end of the first pass, the largest entry
  * is in its proper position at the end of the array. We say that it has bubbled
  * to its correct spot. Each subsequent pass ignores the entries at the end of
  * the array, since they are sorted and are larger than any of the remaining
  * entries. Thus, each pass makes one fewer comparison than the previous pass.
  * Check the figure under HW05 assignment on Canvas.
  * 
  * This method implements bubble sort recursively.
  * 
  * @param arr Array of ints to be sorted in nondecreasing order.
  */
 public static void bubbleSort_Rec(int[] arr)
 {
 	if(arr == null) throw new NullPointerException();
 	if(arr.length == 0) throw new IllegalArgumentException();
 	if(arr.length == 1) return;
  
 	bubbleSort(arr, 0);
 } 
 
 private static void bubbleSort(int[] arr, int index)
 {
	 if(index == arr.length - 1)
	 {
		 return;
	 }
	 int temp = 0;
	 for (int i = 0; i < arr.length - index; i++)
	 {
		 if(arr[i] - arr[i + 1] > 0)
		 {
			 temp = arr[i];
			 arr[i] = arr[i + 1];
			 arr[i + 1] = temp;
		 }
	 }
	 bubbleSort(arr, index + 1);
 }
}
