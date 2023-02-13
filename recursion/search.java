package com.dit.java.recursion;

public class search {
    static int searchLast(int arr[], int index, int target){
        if(index== arr.length){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }
        return searchLast(arr,index+1,target);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,1,7,8};
        int index = 0;
        int search = 7;
        System.out.println(searchLast(arr, index, search));
    }
}
