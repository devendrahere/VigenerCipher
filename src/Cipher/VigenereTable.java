package Cipher;

import java.util.Stack;

public class VigenereTable {
    public char[][] vigenerTable(String key){
        boolean[] isAdded=new boolean[26];
        char[][] table=new char[26][26];
        int index=0;
        for(int i=0;i<key.length();i++){
            table[0][i]=key.charAt(i);
            isAdded[key.charAt(i)-'A']=true;
            index++;
        }
        for(char c='A';c<='Z';c++){
            if(!isAdded[c-'A']){
                table[0][index++]=c;
            }
        }
        for(int i=1;i<26;i++){
            table[i][25]=table[i-1][0];
            for(int j=0;j<25;j++){
                table[i][j]=table[i-1][j+1];
            }
        }
        return table;
    }
}
