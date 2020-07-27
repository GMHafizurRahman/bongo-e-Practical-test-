package anagramex;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramEx {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            System.out.println("input1_1: ");
            String input1_1 = input.next();

            System.out.println("input1_2: ");
            String input1_2 = input.next();

            isAnagram(input1_1, input1_2);
        }
    }

    static void isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

}
