package Cipher;

import java.util.HashMap;
import java.util.Map;

public class VigenereCipher {
    private static final String hiddenWord="LEVIATHAN";
    public boolean isValidKey(String key) {
        if (key.length() < 6) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : key.toCharArray()) {
            if (map.containsKey(c)) {
                return false;
            }
            map.put(c, 1);
        }
        return true;
    }
    public String encode(String plainText,String Key){
        StringBuilder sb=new StringBuilder();
        String mappedString= new String();
        int j=0;
        for(int i=0;i<plainText.length();i++){
            if(j==hiddenWord.length()){
                j=0;
            }
            mappedString+=hiddenWord.charAt(j++);
        }
        VigenereTable vt=new VigenereTable();
        char[][] table=vt.vigenerTable(Key);
        for(int i=0;i<plainText.length();i++){
            int hiddenTextIndex=0;
            int plainTextIndex=0;
            while(table[hiddenTextIndex][0]!=mappedString.charAt(i)){
                hiddenTextIndex++;
            }
            while (table[0][plainTextIndex]!=plainText.charAt(i)){
                plainTextIndex++;
            }
            sb.append(table[hiddenTextIndex][plainTextIndex]);
        }
        return sb.toString();
    }
    public String decode(String cipherText,String key){
        StringBuilder sb=new StringBuilder();
        String mappedString= new String();
        int j=0;
        for(int i=0;i<cipherText.length();i++){
            if(j==hiddenWord.length()){
                j=0;
            }
            mappedString+=hiddenWord.charAt(j++);
        }
        VigenereTable vt= new VigenereTable();
        char[][] table=vt.vigenerTable(key);
        for(int i=0;i<cipherText.length();i++){
            int hiddenTextIndex=0;
            int cipherTextIndex=0;
            while (table[hiddenTextIndex][0]!=mappedString.charAt(i)){
                hiddenTextIndex++;
            }
            while (table[hiddenTextIndex][cipherTextIndex]!=cipherText.charAt(i)){
                cipherTextIndex++;
            }
            sb.append(table[0][cipherTextIndex]);
        }
        return sb.toString();
    }
}
