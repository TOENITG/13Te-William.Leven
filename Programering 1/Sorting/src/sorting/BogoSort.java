package sorting;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.1.5
 */
public class BogoSort {
    
    public int[] myBogoSort(int[] us){
        boolean correct = false;
        // Shuffles untill whole array is correct.
        while (!correct){
            // Shuffle.
            int r1 = (int)(Math.random()*us.length);
            int r2 = (int)(Math.random()*us.length);
            int temp = us[r1];
            us[r1] = us[r2];
            us[r2] = temp;
            
            // Checks if the array is correct.
            correct = true;
            for (int i = 0; i < us.length - 1; i++){
                if (us[i] < us[i+1]){
                    correct = false;
                }
            }
        }
        return us;
    }
    

}
