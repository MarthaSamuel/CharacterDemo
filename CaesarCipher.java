
/**
 * CaesarCipher encrypts messages using the Roman Julius Caesar's method.this is how you get
 * encrypted version of your original sentence
 * 
 *  N11b
 * Dimgba Martha Otisi 
 * 2020,January
 * @martha_samuel_
 *
 */
import edu.duke.*;
public class CaesarCipher {
public String encrypt(String input,int key){
    //make a StringBuilder with message (encrypted)
    StringBuilder encrypted= new StringBuilder (input);
    //write down the alphabets
    String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //here i defined the lower case
    String alphabet2=alphabet.toLowerCase();
      
    //compute the shifted alphabet
    String shiftedalphabet=alphabet.substring(key)+alphabet.substring(0,key);
    //count from 0 to <length of encrypted.(call it i)
    for(int i=0;i<encrypted.length();i++){
     //look at the ith character of encrypted(call it currChar)
     char currChar=encrypted.charAt(i);
     //find the index of currChar in the alphabet(call it idx);
     int idx=alphabet.indexOf(currChar);
     //if currChar is in the alphabet
     if(idx !=-1){
         //get the idxth character of thhe shifted alphabet(newChar)
         char newChar=shiftedalphabet.charAt(idx);
         //replace the ith character of the encrypted with new char
         encrypted.setCharAt(i,newChar);
        }
        idx=alphabet2.indexOf(currChar);
        if(idx!=-1){
            String shiftedalphabet2=shiftedalphabet.toLowerCase();
            char newChar=shiftedalphabet2.charAt(idx);
            encrypted.setCharAt(i,newChar);
        }
      //otherwise do nothing
    }
    //your answer is the string inside of the encrypted
    return encrypted.toString();
}
public void testCaesar(){
    int key=17;
    int y=15;
    String g="FIRST LEGION ATTACK EAST FLANK!";
    int t=23;
    String h="First Legion";
    String z="At noon be in the conference room with your hat on for a surprise party.YELL LOUD!";
    FileResource fr=new FileResource();
    String message=fr.asString();
    String encrypted=encrypt(message,key);
    System.out.println(encrypted);
    String decrypted=encrypt(encrypted,26-key);
    System.out.println(decrypted);
    System.out.println(encrypt(g,t));
    System.out.println(encrypt(h,t));
    System.out.println(encrypt(h,key));
    System.out.println(encrypt(z,y));
}
public String encryptTwoKeys(String input,int key1,int key2){
 
        /**
        *Input:
        *   String - input: string to encrypt 
        *   int - key1
        *   int - key2
        *Output:
        *   String: encrypted message, with
        *       key1 is used to encrypt every other character with 
        *           the Caesar Cipher algorithm, starting with the first character (index 0)
        *       key2 is used to encrypt every other character, 
        *           starting with the second character (index 1)
        */

        // make a StringBuilder with the input
        StringBuilder sbInput = new StringBuilder(input);
        // create alphabet for both upper and lower cases 
        String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
        // create shifted alphabet for both upper and lower cases with key1 and key2
        String shiftedAlphabetUpper1 = alphabetUpper.substring(key1) +
        alphabetUpper.substring(0, key1);
        String shiftedAlphabetLower1 = alphabetLower.substring(key1) + 
        alphabetLower.substring(0, key1);

        String shiftedAlphabetUpper2 = alphabetUpper.substring(key2) +
        alphabetUpper.substring(0, key2);
        String shiftedAlphabetLower2 = alphabetLower.substring(key2) + 
        alphabetLower.substring(0, key2);
        // for every char in the input
        for (int i = 0; i < sbInput.length(); i++) {
            char currChar = sbInput.charAt(i);
            int idx = alphabetLower.indexOf(Character.toLowerCase(currChar));
            // check i
            // if the i is even, use key1
            if (i % 2 == 0) {
                if (Character.isLowerCase(currChar) && idx != -1) {
                    //Get the idxth character of shiftedAlphabet (newChar)
                    char newChar = shiftedAlphabetLower1.charAt(idx);
                    //Replace the ith character of encrypted with newChar
                    sbInput.setCharAt(i, newChar);
                } 
                else if (Character.isUpperCase(currChar) && idx != -1) {
                    //Get the idxth character of shiftedAlphabet (newChar)
                    char newChar = shiftedAlphabetUpper1.charAt(idx);
                    //Replace the ith character of encrypted with newChar
                    sbInput.setCharAt(i, newChar);
                } 
            }
            // if the i is odd, use key2
            else {
                if (Character.isLowerCase(currChar) && idx != -1) {
                    //Get the idxth character of shiftedAlphabet (newChar)
                    char newChar = shiftedAlphabetLower2.charAt(idx);
                    //Replace the ith character of encrypted with newChar
                    sbInput.setCharAt(i, newChar);
                } 
                else if (Character.isUpperCase(currChar) && idx != -1) {
                    //Get the idxth character of shiftedAlphabet (newChar)
                    char newChar = shiftedAlphabetUpper2.charAt(idx);
                    //Replace the ith character of encrypted with newChar
                    sbInput.setCharAt(i, newChar);
                } 
            }
        }
        return sbInput.toString();
    }

    
    public void testEncryptTwoKeys () {
        int key1 = 2;
        int a=23;
        int b=17;
        int n=8;
        int o=21;
        int key2 = 20;
        String d="First Legion";
        String m="At noon be in the conference room with your hat on for a surprise party.YELL LOUD!";
        FileResource fr = new FileResource();
        String message = fr.asString();
        //String encrypted = encryptTwoKeys(message, key1, key2);
        //System.out.println(encrypted);
        String decrypted = encryptTwoKeys(message, 26-key1, 26-key2);
        System.out.println(decrypted);
        System.out.println(encryptTwoKeys(d,a,b));
        System.out.println(encryptTwoKeys(m,n,o));
    }
}
   

     

