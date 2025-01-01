public class TypeConversion {
    public static void main(String[] args) {


        /* Type Conversion

        a. When One type of data is assigned to another type of data an automatic type conversion take place under some condition.

        Condition - 1. Two Types should be compatible.
                    2. The Destination Type Should be greater than source type.

        b. It is called widening(upcasting) process. It happens Implicity.
        * */

        /*  Type Casting

        a. When we convert one type of data to another type is known as type casting.
        b. It is called Narrowing(downcasting) process.

        * */

        int num = (int) (64.57f);    // Here, We have performed type casting
        System.out.println(num);

    }
}
