package incrementDecrementOperator;

public class incrementDecrementOperator {
    public static void main(String[] args) {
        //Increment Operator (++) and Pre-increment -++ Operand. Value is incremented first and then stored in the result.
        //pre-increment -> ++operand.
        //value is incremented first and then stored in the result.
        //value is increased by 1
        int a = 10;
        int b = ++a; //10+1 ->b->11
        System.out.println(b);
        System.out.println(a);
        // exp and result table
        //Line no |a | Result B
        int c = 10;
        int result = c++;
        System.out.println(result);
        int d = 10;
        System.out.println(--d + d++ + d--);
        System.out.println(d);

    }
}
