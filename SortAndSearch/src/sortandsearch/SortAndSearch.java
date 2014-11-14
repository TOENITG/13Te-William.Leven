// doesent work because it can merge arrays with one element or subarray method is wrong

package sortandsearch;

import java.util.*; 
/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.0.0
 */
public class SortAndSearch {
    
    private static int[] randomArray(int length, int variation){
        
        // Written by tobias and modified by william.
        
        int[] theArray = new int[length];
        for (int i=0;i<length;i++){
            theArray[i] = (int)(Math.random()*variation) + 1;
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
    
    static int[] merge(int a[], int b[]){
        int m = a.length;
        int n = b.length;
        int aCount=0, bCount=0;
        int i=0;
        int c[] = new int[m+n];
        
        while(aCount<m && bCount<n){
            if(a[aCount] < b[bCount]){
                c[i] = a[aCount];
                aCount++;
            }
            else{
                c[i] = b[bCount];
                bCount++;
            }
            i++;
        }
        
        if(aCount==m){
           for(int j=bCount; j<n; j++)
               c[i++] = b[j];
        }
        else{
           for(int j=aCount; j<m; j++)
            c[i++] = a[j];
        }
        return c;
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
    
    private static int[] myMergeSort(int[] us){
        //i = size of  first and following arrays to to merge
        for(int i = 1; i*2 < us.length; i = i*2){
            // current subarray
            for(int n = 1 ; (n-1)*i*2 < us.length; n++){
                System.out.println(2*i*(n-1));
                System.out.println(i*(2*n-1));
                System.out.println(i*(2*n-1));
                System.out.println(i*n*2);
                System.out.println("");
                
            
                merge(Arrays.copyOfRange(us, 2*i*(n-1), i*(2*n-1)), Arrays.copyOfRange(us, i*(2*n-1), i*n*2));
            }
        }
        return us;
    }
    
    private static int[] myMerge(int[] s1, int[] s2){
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
    
    private static int[] myBogoSort(int[] us){
        boolean correct = false;
        while (!correct){
            //shuffle
            int r1 = (int)(Math.random()*us.length);
            int r2 = (int)(Math.random()*us.length);
            int temp = us[r1];
            us[r1] = us[r2];
            us[r2] = temp;
            
            //check
            correct = true;
            for (int i = 0; i < us.length - 1; i++){
                if (us[i] < us[i+1]){
                    correct = false;
                }
            }
        }
        return us;
    }
    
    public static void main(String[] args) {
        
        int[] myArray = randomArray(16 , 10); 
//        printArray(myArray);
        
        Calendar clock11 = Calendar.getInstance();  
        long time11 = clock11.getTimeInMillis();
        
   
//        myArray = myBogoSort(myArray);
//        myArray = myBubleSort(myArray);
//        myArray = mySelectionSort(myArray);
//        myArray = myImprovedSort(myArray);
        myArray = myMergeSort(myArray);
//        Arrays.sort(myArray);
        
        
        Calendar clock12 = Calendar.getInstance();  
        long time12 = clock12.getTimeInMillis();
        
        printArray(myArray);
        
        System.out.println("");
        System.out.println("time: " + (time12-time11) + "ms"); 
        
    }

}
