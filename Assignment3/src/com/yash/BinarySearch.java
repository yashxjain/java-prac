package com.yash;


public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // target not found
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 9, 11};
        int target = 6;
        
        int index = binarySearch(arr, target);
        if (index == -1) {
            System.out.println("Target value not found in array.");
        } else {
            System.out.println("Target value found at index " + index + ".");
        }
    }
}
