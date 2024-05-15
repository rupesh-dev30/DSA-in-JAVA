/*
    Search in Rotated Sorted Array

    input: sorted, rotated array with distinct numbers (in ascending order). It is rotated at a pivot point. Find the index of given element.

    eg:  4 5 6 7 0 1 2   : Target = 0
    output : 4

    Approach: Linear Search (time complexity O(n))

    Better Approach: Divide and Conqure
*/

public class SearchInRotatedSortedArray{
    public static int search(int[] arr, int target, int startIndex, int endIndex){
        if(startIndex > endIndex){
            return -1;
        }
        
        int mid = startIndex + (endIndex - startIndex)/2;

        if(arr[mid] == target){
            return mid;
        }

        //Present on Line 1 
        if(arr[startIndex] <= arr[mid]){
            if(arr[startIndex] <= target && target <= arr[mid]){
                return search(arr, target, startIndex, mid-1);
            } else {
                return search(arr, target, mid+1, endIndex);
            }
        }

        //Present on Line 2
        else {
            if(arr[mid] <= target && target <= arr[endIndex]){
                return search(arr, target, mid+1, endIndex);
            } else {
                return search(arr, target, startIndex, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 4,5,6,7,0,1,2 };
        int target = 0;

        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}