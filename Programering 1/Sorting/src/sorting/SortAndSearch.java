package sorting;

import java.util.*; 
/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 2.2.5
 */
public class SortAndSearch {
    
    // Generates random array.
    private static int[] randomArray(int length, int variation){
        
        // Written by tobias and modified by william.
        
        int[] theArray = new int[length];
        for (int i=0;i<length;i++){
            theArray[i] = (int)(Math.random()*variation) + 1;
        }
        return theArray;
    }
    
    // Prints array.
    private static void printArray(int[] array){
        
        // Written by tobias and modified by william.
        
        System.out.println();
        for(int i=0;i<array.length;i++){
            if (i % 10 == 0) System.out.println();
            System.out.format("%4d ",array[i]);
        }
    }
    
    // Main.
    public static void main(String[] args) {
        
        
        // -*-*-uncomment the one you want to use-*-*-
//        BogoSort sorting = new BogoSort();                            // Scrambles untill correct.
//        BubleSort sorting = new BubleSort();                          // Moves highest to the right untill corect.
//        SelectionSort sorting = new SelectionSort();                  // Searches for lowest number and places at correct spot.
//        ImprovedSelectionSort sorting = new ImprovedSelectionSort();  // Searches for lowest and highest number and places at correct spot.
        MergeSort sorting = new MergeSort();                            // Merges two correct subarrays to one correct array.(multiple times)
        
        // arg1 = lenght, arg2 = variation 
        // ------WARNING max length values: (setting higher will result in very long process time)
        //BogoSort:                 ~14
        //BubleSort:                50000 - 100000
        //SelectionSort             100000 - 200000
        //ImprovedSelectionSort:    200000 - 500000
        //MergeSort:                500000 - 20000000
        //JavaDefault:              10000000 - 500000000
        int[] myArray = randomArray(100000 , 100000); 
        
        // -*-*-uncomment if you want to print the unsorted array-*-*-
//        printArray(myArray);
        
        // Grabing time and saves in time11
        Calendar clock11 = Calendar.getInstance();  
        long time11 = clock11.getTimeInMillis();
        
        // Grabing time and saves in offset
        Calendar coffset = Calendar.getInstance();  
        long offset = coffset.getTimeInMillis();
        
        // -*-*-uncomment the one you want to use-*-*-
//        myArray = sorting.BogoSort(myArray);              // Scrambles untill correct.
//        myArray = sorting.BubleSort(myArray);             // Moves highest to the right untill corect.
//        myArray = sorting.SelectionSort(myArray);         // Searches for lowest number and places at correct spot.
//        myArray = sorting.ImprovedSelectionSort(myArray); // Searches for lowest and highest number and places at correct spot.
        myArray = sorting.MergeSort(myArray);               // Merges two correct subarrays to one correct array.(multiple times)
//        Arrays.sort(myArray);                             // Java default sorting
        
        
        Calendar clock12 = Calendar.getInstance();  
        long time12 = clock12.getTimeInMillis();
        
        // -*-*-uncomment if you want to print the sorted array-*-*-
//        printArray(myArray);
        
        System.out.println("");
        
        // Printing out how long time it took minus the the offset
        System.out.println("time: " + (time12-time11-(offset-time11)) + "ms"); 
        
    }

}
