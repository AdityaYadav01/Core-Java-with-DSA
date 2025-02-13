public class MethodScope {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=20;

        swap(a,b);

        System.out.println("In Main Method: " + a + " " + b);
    }

    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // The changes will only be going to shown in this method scope only
        System.out.println("Numbers Swapped in Method Scope: " + num1 + " " + num2);

    }
}
