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

        /* Type Promotion

        While evaluating expressions the intermediate value may exceed the range of the operands
        hence the expression value will be promoted.

        a. Java automatically promotes each bytes, short, or char operands to int while evaluating an expression
        b. If one operand is a long, float, or double the whole expression is promoted to long, float, or double.
        * */

        byte a = 4;
        byte b = 15;

        int sum = a+b; //Automatic Type Promotion happens here. byte value is converted to int value
        System.out.println(sum);

    }
}
