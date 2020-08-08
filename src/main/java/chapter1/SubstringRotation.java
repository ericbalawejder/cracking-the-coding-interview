package chapter1;

// 1.8 Assume you have a method isSubstring which checks if one word is a
// substring of another. Given two strings,s1 and s2,write code to check if
// s2 is a rotation of s1 using only one call to isSubstring.
// (i e , “waterbottle” is a rotation of “erbottlewat”)

public class SubstringRotation {

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }

    // how to handle empty string?
    static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s1s1 = s1 + s1;
        return s1s1.toLowerCase().contains(s2.toLowerCase());
    }
}
