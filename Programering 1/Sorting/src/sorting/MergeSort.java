package sorting;
import java.util.*; 

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.3.32
 */
public class MergeSort {
    
    public int[] MergeSort(int[] us){
        
        // Predefined variables with default value
        int temp = 0; 
        
        //i = size of  first and following arrays to to merge
        for(int i = 1; i*2 <= us.length; i = i*2){
            // n = current subarray to merge
            for(int n = 1 ; n*i*2 <= us.length; n++){
                
                // Merge two subarrays and inserts them as one in the place of the two sub arrays.
                us = Insert(us, Merge(Arrays.copyOfRange(us, 2*i*(n-1), i*(2*n-1)), Arrays.copyOfRange(us, i*(2*n-1), i*n*2)), 2*i*(n-1));
                
                // Saves how much of the array thats sorted
                temp = i*n*2; 
            }
        }
        // Takes care of all none base-2 numbers by merging 
        // the last part with the sorted part of the array.
        if(temp == us.length-1){
            
            us = Merge(Arrays.copyOfRange(us, 0, temp), Arrays.copyOfRange(us, temp, us.length));
        }
        else if(temp < us.length){
            
            us = Merge(Arrays.copyOfRange(us, 0, temp), MergeSort(Arrays.copyOfRange(us, temp, us.length)));
        }
        return us;
    }
        
    private int[] Merge(int[] s1, int[] s2){
        int s[] = new int[s1.length+s2.length]; // creating new array with correct size
        int n1 = 0; //current index of s1
        int n2 = 0; //corrent index of s2
        for (int i = 0; i < s.length; i++){ // loops trough every position in the new array
            if (n1 < s1.length && n2 < s2.length){ //checking if n1 & n2 is within index range
                if (s1[n1] < s2[n2]){  // choses lowest value, inserts in the s array and moving on to next index.
                    s[i] = s1[n1];
                    n1++;
                }
                else { // choses lowest value, inserts in the s array and moving on to next index.
                    s[i] = s2[n2];
                    n2++;
                }
            }
            else if (n1 < s1.length){ // checking if n1 ia with in index range an adds index to s array.
                s[i] = s1[n1];
                n1++;
            }
            else{ // if you come here n2 is within index and is added to the s array.
                s[i] = s2[n2];
                n2++;
            }
            
        }
        return s;
    }
    
    private static int[] Insert(int full[], int source[], int start_pos){
        /*
        Replaces the array positions of (full[]) 
        with the values of (source[]) 
        starting at (start_pos).
        */

        for(int i = 0; i < source.length; i++){
            full[start_pos + i] = source[i];
        }
        return full;
    }
    
}
