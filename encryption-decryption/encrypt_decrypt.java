
import java.util.Scanner;

class Encryption {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String msg = sc.nextLine();

        int key = 3;

        String enc = "";
        String dec = "";

        // Encryption
        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);
            enc = enc + (char)(ch + key);
        }

        // Decryption
        for (int i = 0; i < enc.length(); i++) {
            char ch = enc.charAt(i);
            dec = dec + (char)(ch - key);
        }

        System.out.println("Encrypted Data: " + enc);
        System.out.println("Decrypted Data: " + dec);

        sc.close();
    }
}

