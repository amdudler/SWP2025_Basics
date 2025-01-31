package at.amir.school.basics;

import java.util.Scanner;

public class Caesar_Verschluesselung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen Text ein: ");
        String s = scanner.nextLine().toLowerCase();

        int offset = 2;

        String encrypted = encrypt(s, offset);
        System.out.println(" " + encrypted);
    }

    public static String encrypt(String s, int offset) {
        String result = "";
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result += (char) (((c - 'a' + offset) % 26) + 'a');
            } else {
                result += c;
            }
        }
        return result;
    }
}