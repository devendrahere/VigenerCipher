# Modified Vigenère Cipher

A Java implementation of a **Modified Vigenère Cipher**, designed as a terminal-based encoder/decoder.  
Unlike the classical cipher, this version introduces a **hidden word twist (`LEVIATHAN`)** that influences the key mapping.  
You can change this hidden word in the source code to customize the behavior.

---

## ✨ Features
- Encode and decode messages using a modified Vigenère table.
- Key validation:
  - Minimum length of **6 characters**.
  - All characters must be **unique**.
- Interactive terminal menu (Encode, Decode, Exit).
- Fully customizable: replace the hidden word `LEVIATHAN` in `VigenereCipher.java` with your own.

---

## 📂 Project Structure
```bash
VigenereCipherProject/
│
├── src/
└── main/
└── java/
├── Cipher/
│ ├── VigenereCipher.java # Core logic (encode/decode, validation)
│ └── VigenereTable.java # Builds the Vigenère table
│
└── Main.java # Entry point with terminal menu
```

---

## ▶️ How to Run
  1. Clone the repository or download the source files.  
  2. Compile the project:
   ```bash
     javac Main.java Cipher/*.java
   ```
  3. Run the program:
     
  ```bash
      java Main
   ```
---

## 🧑‍💻 Usage
When you run the program, you’ll see a menu:
```bash
Welcome to Modified Vigener Encoder /Decoder
Choose your Option
1.Encode
2.Decode
3.Exit
1->Encode        2->Decode        3->Exit
```

---

## Example Run
```bash
1
To Encode provide us the key you plan to use .

Key must contain unique alphabets and length of Key must be 6 or more

AMIGOS
Provide us the Plain text that us plan to cipher [All caps no space].

LOREMIPSUM
Your Encoded Text is 

IKKHMVMSEN

2
To decode the cipher Text First we would need the key.

Key must contain unique alphabets and length of Key must be 6 or more

AMIGOS
Provide us the cipher text that used the key to encode [All caps no space].

IKKHMVMSEN
Your Decoded text is 

LOREMIPSUM

3
Exiting the Encode / Decode session
```
---

## 🔧 Customization

By default, the cipher uses the hidden word: 
  ```bash
  private static final String hiddenWord = "LEVIATHAN";
  ```
Change this value in VigenereCipher.java to any word you like to create your own variation of the cipher.

---
