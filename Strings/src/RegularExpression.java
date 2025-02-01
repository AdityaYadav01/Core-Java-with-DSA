                                                                                          // Regular Expression

// Regular Expression - A regular expression(regex) is a sequence of characters that define a search pattern.

                                                                                          /* Matching Symbols
                                                                                          *  1.  . - Any Character
                                                                                          *  2.  [abc] - Exactly Given Letters - For Single Symbol
                                                                                          *  3.  [abc][vj] - Either First or Second Set - For Multiple Symbol
                                                                                          *  4.  [^abc] - Except abc
                                                                                          *  5.  [a-z1-9] - a-z or 1-9
                                                                                          *  6.  A|B - A or B
                                                                                          *  7.  XZ - Exactly XZ        * */

public class RegularExpression {
    public static void main(String[] args){
        String str = "a";
        System.out.println(str.matches("[abc]"));   // String must contain only a, b, c as alphabet
        System.out.println(str.matches("a|b"));   // Either a or b

        String str1 = "abc";
        System.out.println(str1.matches("[abc][bc][cd]"));

        String str2 = "W";
        System.out.println(str2.matches("[^abc]"));  // Any Alphabet apart from abc
        System.out.println(str2.matches("[a-z0-9]"));  // It will allow anything from a to z & 0-9

        String str3 = "a7";
        System.out.println(str3.matches("[a-z][0-7]"));  // To check multiple Symbols


        /* Meta Characters
        *
        * 1. \d - for digits
        * 2. \D - Not Digits
        * 3. \s - Space
        * 4. \S - Not Space
        * 5. \w - Alphabets or Digits
        * 6. \W - Neither Alphabets or Digit
        * */

        String str4 = "5";
        System.out.println(str4.matches("\\d")); // If String matches a digit
        System.out.println(str4.matches("\\w"));  // Either Alphabets or Digit

        String str5 = " ";
        System.out.println(str5.matches("\\s"));  // For Checking Space


        /* Quantifier
         *
         * 1. * - 0 or more times
         * 2. + - One or More Time
         * 3. ? - 0 or 1 time
         * 4. {X} - X number of time only
         * 5. {X,Y} - Between X and Y time
         * */

        String str6 = "abcdef";
        System.out.println(str6.matches(".*"));  // '.' means Anything is allowed & '*' means any number of time is allowed

        String str7 = "abba";
        System.out.println(str7.matches("[ab]{4}"));  // Here, 4 represent number of characters in a string.

        String str8 = "aditya@gmail.com";
        System.out.println(str8.matches(".*gmail.*"));




    }
}
