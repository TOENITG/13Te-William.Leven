/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortandsearch;

import java.util.Arrays;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.0.0
 */
public class SortAndSearch {
    
    private static int[] randomArray(int size){
        
        // Written by tobias and modified by william.
        
        int[] theArray = new int[size];
        for (int i=0;i<size;i++){
            theArray[i] = (int)(Math.random()*size) + 1;
        }
        return theArray;
    }
    
    private static void printArray(int[] array){
        
        // Written by tobias and modified by william.
        
        System.out.println();
        for(int i=0;i<array.length;i++){
            if (i % 10 == 0) System.out.println();
            System.out.format("%4d ",array[i]);
        }
    }
    
    private static int[] myBubleSort(int[] us) {
        boolean swaped = true;
        while (swaped) {
            swaped = false;
            for (int i = 0; i < us.length - 1; i++){
                if (us[i] > us[i+1]){
                    int temp = us[i];
                    us[i] = us[i+1];
                    us[i+1] = temp;
                    swaped = true;
                }
            }
        }
        return us;
    }

    public static void main(String[] args) {
        
        int[] myArray = randomArray(100);
        
        printArray(myArray);
        
        myArray = myBubleSort(myArray);
        
        printArray(myArray);
        
    }

}
