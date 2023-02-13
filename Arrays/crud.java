package com.dit.java.Arrays;

import java.util.Scanner;

public class crud {
    int[] create(){
        System.out.println("enter number of elements");
        Scanner sc= new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        sc.close();
        System.out.println("enter elements");
        for(int i=0; i<len; i++){
            arr[i]= sc.nextInt();
        }
        return arr;
        
    }

    void read(int arr[]){
        for(int element : arr){
        System.out.println(element);
        }
    }

    void find(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target){
                System.out.println("Found at "+i);
                break;
            }
         }
        System.out.println("Not found");      
    }

    void update(int arr[]){

    }
    public static void main(String[] args) {
        System.out.println("1. Create 2. read 3. update 4. delete 5. insert AT SPECIFIC POS ");
        crud obj =new crud();
        int[] myArr= obj.create();
        obj.read(myArr);
        obj.find(myArr, 5);

    }
}
