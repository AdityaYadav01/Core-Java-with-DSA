                                                           // Strings in Java
// String is a collection of characters that are forming any names.
public class Strings {
    public static void main(String[] args) {

        // Simpliest Method to create String in Java
        String str = "Java Program";           // This will be created in String Pool only where str ref. variable is holding "Java program" String.
        System.out.println(str);

        // Character method to create a String
        char[] ch = {'a', 'b', 'c', 'd'};  // Array of characters
        String str1 = new String(ch);      // 'String(char)' is a constructor. It takes character
        System.out.println(str1);

        // Byte method to create a String
        byte[] b = {1, 2, 3, 4, 5};
        String str2 = new String(b); // 'String(byte)' is a constructor. Here, it takes byte
        System.out.println(str2);

        // Method 3
        String str3 = new String("Java Programming");
        System.out.println(str3);

        // In Method 3, Two String will be created one in Heap Memory with ref. variable and another one in String Constant Pool.
        // String Constant Pool(SCP) - It is a reserved area in a program's memory where strings literals are stored.

    }
}
