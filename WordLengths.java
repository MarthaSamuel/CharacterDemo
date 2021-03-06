
/**
 *  WordLengths,see second assignment in README.TXT.
 *  this program counts each word and figures out the most common word length of words from a file
 * N11f
 *  Dimgba Martha Otisi 
 * @2020,January
 * @martha_samuel_
 */
import edu.duke.*;

public class WordLengths {
    public void countWordLengths(FileResource resource, int[] counts){
        for (String s: resource.words()){
            int index = s.length();
            if (Character.isLetter(s.charAt(0)) == false){
                index -= 1;
            }
            if (Character.isLetter(s.charAt(s.length() - 1)) == false){
                index -= 1;
            }
            if (index < 0){
                continue;
            }
            counts[index] ++;
        }
    }
    
    public void testCountWordLengths(){
        FileResource a = new FileResource();
        int[] counts = new int[50];
        countWordLengths(a, counts);
        for (int i = 0; i < 31; i ++){
            if (counts[i] != 0){
                System.out.println(counts[i] + " words of length " + i);
            }
        }
        System.out.println(indexOfMax(counts));
    }
    
    public int indexOfMax(int[] values){
        int max = 0;
        for (int i = 0; i < values.length; i ++){
            if (values[i] > max){
                max = i;
            }
        }
        return max;
    }
}