import Cipher.VigenereCipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String key;
        String plainText;
        String cipherText;
        VigenereCipher vc=new VigenereCipher();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Welcome to Modified Vigener Encoder /Decoder");
            System.out.println("Choose your Option");
            System.out.println("1.Encode");
            System.out.println("2.Decode");
            System.out.println("3.Exit");
            System.out.println("1->Encode\t\t2->Decode\t\t3->Exit");
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("To Encode provide us the key you plan to use .\n");
                    System.out.println("Key must contain unique alphabets and length of Key must be 6 or more\n");
                    key= sc.next().toUpperCase();
                    sc.nextLine();
                    if(vc.isValidKey(key)){
                        System.out.println("Provide us the Plain text that us plan to cipher [All caps no space].\n");
                        plainText=sc.nextLine().toUpperCase();
                        System.out.println("Your Encoded Text is \n");
                        System.out.println(vc.encode(plainText,key));
                    }else {
                        System.out.println("Key does not match the requirement!");
                    }
                    break;
                case 2:
                    System.out.println("To decode the cipher Text First we would need the key.\n");
                    System.out.println("Key must contain unique alphabets and length of Key must be 6 or more\n");
                    key = sc.next().toUpperCase();
                    sc.nextLine();
                    if(vc.isValidKey(key)){
                        System.out.println("Provide us the cipher text that used the key to encode [All caps no space].\n");
                        cipherText=sc.nextLine().toUpperCase();
                        System.out.println("Your Decoded text is \n");
                        System.out.println(vc.decode(cipherText,key));
                    }
                    break;
                case 3:
                    System.out.println("Exiting the Encode / Decode session");
                    return;
                default:
                    System.out.println("Invalid Input.");
            }
        }
    }
}
