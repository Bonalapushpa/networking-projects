
# Encryption and Decryption Using Java

## Overview

This project demonstrates a simple encryption and decryption technique using Java.

It uses a fixed key value of 3 to encrypt the input message by shifting each character forward by 3 positions in the character set. The original message is recovered by shifting each encrypted character backward by the same key.

## Objective

- To understand the basic concept of encryption and decryption.
- To implement character shifting using Java.
- To understand how a key is used in a simple encryption technique.


## Algorithm

1. Start the program.
2. Read a message from the user.
3. Initialize the encryption key as 3.
4. Initialize empty strings for encrypted and decrypted data.
5. Traverse each character in the original message.
6. Add the key value to each character to generate encrypted data.
7. Traverse each character in the encrypted message.
8. Subtract the key value to recover the original message.
9. Display the encrypted and decrypted messages.
10. Stop the program.

## Sample Input

```text
Enter message: hello
```

## Sample Output

```text
Encrypted Data: khoor
Decrypted Data: hello
```

## How to Run

1. Install Java JDK.
2. Open the terminal in this project folder.
3. Compile the program:

```bash
javac Encryption.java
```

4. Execute the program:

```bash
java Encryption
```

5. Enter a message when prompted.

## Key Concept

This program demonstrates a basic character-shift technique.

- Encryption: Character + Key
- Decryption: Character - Key
- Key: 3

## Learning Outcomes

- Understood the basic idea of encryption and decryption.
- Practised Java strings and character manipulation.
- Used loops to process individual characters.
- Learned how a fixed key can transform and recover a message.

## Note

This is a basic educational demonstration of character shifting, not secure encryption for real-world communication.
