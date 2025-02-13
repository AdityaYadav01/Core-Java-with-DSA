// Method Overloading - It is used to define multiple methods with same name but different parameters within the same class.

public class MethodOverloading {
    public static void main(String[] args) {
        int ans = sum(12,23,4,5,7);
        System.out.println("Sum: " + ans);
    }

    // Same name with different parameters
    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a,int b, int c){
        return a+b+c;
    }

    static int sum(int a,int b, int c, int d){
        return a+b+c+d;
    }
    static int sum(int a,int b, int c, int d, int e){
        return a+b+c+d+e;
    }
}
