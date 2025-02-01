// Methods in String Class

public class StringsMethod {
    public static void main(String[] args) {
        String str = "Java Programming"; // It is in String Pool Memory

        // 1. int length() - It checks the length of the string
        int len = str.length();
        System.out.println("Length of the String: " + len);

        // 2. String toLowerCase() - Convert the String in lower case
        String lower = str.toLowerCase();
        System.out.println("String in lower order: " + lower);

        // 3. String toUpperCase() - Convert the String to Upper Case
        String Upper = str.toUpperCase();
        System.out.println("String in Upper Order: " + Upper);

        // 4. trim() - It is used to remove tailing and leading blank spaces
        String str2 = "  Java   ";
        str2 = str2.trim();
        System.out.println(str2);

        // 5. substring(int beginIndex, int endIndex) - It will give us a part of string
        String sub = str.substring(0,4);
        System.out.println("The subString is " + sub);

        // 6. replace(old char, new char) - It will replace old character with new character
        String replace = str.replace('a','o'); // Replacing 'a' with 'o'
        System.out.println(replace);

        // 7. boolean startsWith(String s) - It will check if the string begin with specific character or not.
        boolean start = str.startsWith("J");
        System.out.println(start);

        // 8. boolean endsWith(String s) - It will check if the string ends with specific character or not.
        boolean end = str.endsWith("J");
        System.out.println(end);

        // 9. char charAt(int index) - It will tell us the character at specific index
        char ch = str.charAt(7);
        System.out.println(ch);

        // 10. int indexOf("string or character", starting point) - It will specify the index of a character or string. It works from left to right
        int index = str.indexOf('v');
        System.out.println(index);

        // 11. int lastIndexOf("string or character", starting point) - It will specify the index of a character or string. It works from left to right
        int indexLast = str.lastIndexOf('g');
        System.out.println(index);

        String s1 = "JAVA";
        String s2 = "Java";
        String s3 = "Python";
        String s4 = "Python";

        // 12. boolean equals(String S) - It will check if the two strings are equal or not
        boolean res = s1.equals(s2);
        System.out.println("Two Strings are Equal or not: " + res);

        // 13. boolean equalsIgnoreCase(String S) - It will check if the two strings are equal or not
        boolean res1 = s1.equalsIgnoreCase(s2);
        System.out.println("Two Strings are Equal or not when we ignore cases: " + res1);

        /* 14. int compareTo(String S) - It is used to compare two values in the string. it returns three results:
                -1 - If the first string is smaller
                 0 - If both the strings are equal         Note: Uppercase Alphabet ASCII code are smaller than Lowercase Alphabet ASCII Code
                 1 - If the first string is bigger
        * */
        int compare = s1.compareTo(s2);
        System.out.println("Comparison of Two values: " + compare); // Uppercase value of JAVA is smaller than Lowercase java. Hence, It will return -ve value

        int compare2 = s1.compareToIgnoreCase(s2);
        System.out.println("Comparison of Two values Ignoring Cases: " +compare2); // It will return 0 as both the values are equal

        // 15. String valueOf(int i) - It is used to convert different datatype like int, char, double to string representation.
        String ch1 = s1.valueOf(2); // Here, integer value is convered to string
        System.out.println(ch1);







    }
}
