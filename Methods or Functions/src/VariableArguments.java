// Variable Arguments - It is also known as variadic arguments allows a function to accept variable number of arguments

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        var(12,23,34,56,7,34,78,98,100);  // We can pass any number of arguments in this function
        multipleArgument(23,78,"Aditya","Yadav");

    }

    static void var(int ...a){          // Internally, It is taking array of integers
        System.out.println(Arrays.toString(a));

    }

    static void multipleArgument(int a, int b, String ...name){   // The variable argument should always come at last

    }
}
