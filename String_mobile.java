//given the string "MOBILE PHONE IS DEAD" ,re-print the same string without any vowel letters in it.

public class String_mobile {
        public static void main(String[] args) {
            String str = "MOBILE PHONE IS DEAD";

            // Remove all vowels from the string
            str = str.replaceAll("[AEIOUaeiou]", "");

            System.out.println(str);
        }
    }
