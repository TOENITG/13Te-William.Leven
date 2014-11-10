/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortandsearch;

import java.util.*; 
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

    private static int[] mySelectionSort(int[] us) {
        // i - solving
        // n - current
        // li - index of lowest
        int li = 0;
        for (int i = 0; i < us.length -1; i++){
            for (int n = i; n < us.length; n++){
                    if( n == 0 || us[n] < us[li]){
                        li = n;
                }
            }
            int temp = us[i];
            us[i] = us[li];
            us[li] = temp;
        }
        return us;
    }
    
    private static int[] myImprovedSort(int[] us) {
        // i - solving
        // n - current
        // li - index of lowest
        // hi - index of highest
        int li = 0;
        int hi = 0;
        for (int i = 0; i < us.length - 1; i++){
            for (int n = i; n < us.length - i; n++){
                    if( n == 0 || us[n] < us[li]){
                        li = n;
                    if( n == 0 || us[n] > us[hi]){
                        hi = n;
                    }
                }
            }
            int temp = us[i];
            us[i] = us[li];
            us[li] = temp;
            
            temp = us[us.length-1-i];
            us[us.length-1-i] = us[hi];
            us[hi] = temp;
        }
        return us;
    }
    
    
    public static void main(String[] args) {
        
        int[] myArray = randomArray(100);
        
        printArray(myArray);
        
        Calendar clock11 = Calendar.getInstance();  
        long time11 = clock11.getTimeInMillis();
        
        myArray = mySelectionSort(myArray);
        //myArray = myBubleSort(myArray);
        //myArray = myImprovedSort(myArray);
        
        Calendar clock12 = Calendar.getInstance();  
        long time12 = clock12.getTimeInMillis();
        
        printArray(myArray);
        
        System.out.println("");
        System.out.println("time1 " + (time12-time11) + "ms"); 
        
    }

}
