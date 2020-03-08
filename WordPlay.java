
/**
 * WordPlay transforms words from a file into another form.see README.TXT
 * 
 *  N11c
 * @author Dimgba Martha Otisi 
 * @2020,January
 * @martha_samuel_
 * 
 */
public class WordPlay {
public boolean isVowel(char ch){
 
    
char vs=Character.toLowerCase(ch);
String vowels="aeiou";
if(vowels.indexOf(vs)!=-1){
    return true;
}
else{
    return false;
}
}
public void isVoweltest(){
    char y='F';
    char z='a';
    char x='E';
    System.out.println(isVowel( y));
    System.out.println(isVowel(z));
    System.out.println(isVowel(x));
}
public String replaceableVowels(String phrase,char ch){
    StringBuilder sbPhrase=new StringBuilder(phrase);

    for(int i=0;i<phrase.length();i++){
        if(isVowel(sbPhrase.charAt(i))==true){
          sbPhrase.setCharAt(i,ch); 
        }
    }
        return sbPhrase.toString() ;
    }
    public void replaceableVowelstest(){
      String s="Hello World";
     char y='*';
     System.out.println(replaceableVowels(s,y));
    }
    public String emphasize(String phrase,char ch){
        StringBuilder sbPhrase=new StringBuilder(phrase);
        char chl=Character.toLowerCase(ch);
        for(int k=0;k<sbPhrase.length();k++){
            char currchar=Character.toLowerCase(sbPhrase.charAt(k));
            if(currchar==chl){
                if(k%2==0){
                    sbPhrase.setCharAt(k,'*');
                }
                else{
                    sbPhrase.setCharAt(k,'+');
                }
            }
        }
        return sbPhrase.toString();
    }
    public void emphasizetest(){
        String u="dna ctgaaactga";
        char v='a';
        String e="Mary Bella Abracadabra";
        System.out.println(emphasize(u,v));
        System.out.println(emphasize(e,v));
    }
}
             




