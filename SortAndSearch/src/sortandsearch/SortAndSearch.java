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
        // i & length-1-i - solving
        // n - current
        // li - index of lowest
        // hi - index of highest
        int li;
        int hi;
        for (int i = 0; i < (us.length)/2+1; i++){
            hi = i;
            li = i;
            for (int n = i; n < us.length-i; n++){
                if(us[n] < us[li]){
                    li = n;
                }
                if(us[n] > us[hi]){
                    hi = n;
                }
                
            }
            if ( hi != li){
                
                int temp = us[i];
                us[i] = us[li];
                us[li] = temp;
                if (hi == i){
                    hi = li;
                }
                temp = us[us.length-1-i];
                us[us.length-1-i] = us[hi];
                us[hi] = temp;
            }
            
        }
        return us;
    }
    
    private static int[] splitSortS(int[] us){
        int sum = 0;
        for (int i = 0; i < us.length; i++){
            sum = sum + us[i];
        }
        sum = sum/2;
        //int[] us1 = dynamic array somehow
        //int[] us1 = dynamic array somehow
        for (int i=0; i < us.length; i++){
            if (us[i] < sum){
                //add us[i] to us1
            }
            else{
                // add us[i] to us2
            }
        }
                
        return us;
    }// not working atm
    
    private static int[] merge(int[] s1, int[] s2){
        int s[] = new int[s1.length + s2.length];
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < s.length; i++){
            if (n1 <= s1.length && n2 <= s2.length){
                if (s1[n1] < s2[n2]){
                    s[i] = s1[n1];
                    n1++;
                }
                else {
                    s[i] = s2[n2];
                    n2++;
                }
            }
            else if (n1 <= s1.length){
                s[i] = s1[n1];
                n1++;
            }
            else{
                s[i] = s2[n2];
                n2++;
            }
            
        }
        return s;
    }
    
    public static void main(String[] args) {
        
        int[] myArray = randomArray(100000);
        printArray(myArray);
        
        Calendar clock11 = Calendar.getInstance();  
        long time11 = clock11.getTimeInMillis();
        
//        myArray = mySelectionSort(myArray);
//        myArray = myBubleSort(myArray);
        myArray = myImprovedSort(myArray);
//        myArray = splitSortS(myArray);
//        Arrays.sort(myArray);
        
        Calendar clock12 = Calendar.getInstance();  
        long time12 = clock12.getTimeInMillis();
        
        printArray(myArray);
        
        System.out.println("");
        System.out.println("time1 " + (time12-time11) + "ms"); 
        
    }

}
