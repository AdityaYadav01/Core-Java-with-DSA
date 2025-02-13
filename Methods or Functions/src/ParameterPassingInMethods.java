public class ParameterPassingInMethods {
    public static void main(String[] args) {
        int ans = sum(20,30);   // Here, the sum method asked for two values. so, we have provided 20 and 30 as two values in the method
        System.out.println("Sum of two numbers: " + ans);

        String greeting = message("Aditya");  //Here, we are passing the name as a parameter in message method.
        System.out.println(greeting);

    }

    // Passing the value in the method
    static int sum(int a, int b){
        int res = a+b;
        return res;
    }

    // Passing the String value in the method/function
    static String message(String name){
        String greet = "Hello " + name;
        return greet;
    }
}
