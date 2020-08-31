package Problems.BinarySearch;

import java.util.Arrays;

public class BinarySearchAnArray{

    public static void main(String[] args) {
        int[] arr1 = {2};
        int n1 = 4;

        int[] arr2 = {2,5,7,9,12};
        int n2 = 8;

        int[] arr3 = {2,5,7,9,12};
        int n3 = 12;

        int[] arr4 = {};
        int n4 = 4;

        System.out.println(binarySearch(arr1,n1));
        System.out.println(binarySearch(arr2,n2));
        System.out.println(binarySearch(arr3,n3));
        System.out.println(binarySearch(arr4,n4));


    }

    public static Boolean binarySearch(int[] arr, int n){

        if(arr.length == 0){
            return false;
        }

        int mid = arr[arr.length / 2];
        boolean set = false;


        if(arr.length != 1 && mid > n){
            int[] split = Arrays.copyOfRange(arr, 0, arr.length/2);
            return binarySearch(split, n);
        }
        else if(arr.length != 1 && mid < n){
            int[] split = Arrays.copyOfRange(arr, arr.length/2, arr.length);
            return binarySearch(split, n);
        }
        else if(mid == n){
            set = true;
        }

        return set;

    }



}
