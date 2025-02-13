public class Shadowing {
    static int x = 90;                          // This will be shadowed at line number 6
    public static void main(String[] args) {
        System.out.println(x);   // 90
        int x = 40;  // This is Local Scope which overshadowed the class variable at line 2
        System.out.println(x);  // 40        // This is printing Local Scope

        fun();

    }

    static void fun(){
        System.out.println(x);  // This will print class variable
    }
}
