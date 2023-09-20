package md.tekwillacademy.operationsandciclicfunctions;

public class ByteCalculator {

    public static void main(String[] args) {

        int num1 = 5; //  0101 in binary
        int num2 = 3; //  0011 in binary

        // Bitwise AND 1 * 1 = 1, 1 * 0 = 0, 0 * 0 = 0
        // 128  64  32  16  8   4   2   1
        int andResult = num1 & num2; // the result is 0001 (decimal 1) multiplication(num1, num2) in binary

        // Bitwise OR will perform logical OR on each bit, returning 1 if there is a 1 in either input for each bit position, returning 0 otherwise.
        int orResult = num1 | num2;  // 0111 (decimal 7)

        // Bitwise XOR  will perform a logical XOR on each bit, returning 1 if one and only one input contains a 1 in a position, returning 0 otherwise.
        int xorResult = num1 ^ num2; // 0110 (decimal 6)

        // Bitwise NOT - negation
        int notResult1 = ~num1;      //   1111 0110 decimal -6
        int notResult2 = ~num2;      //   1111 0100 decimal -4

        // Left Shift
        int leftShiftResult = num1 << 2; // 0001 0100 (20 in decimal)

        // Right Shift
        int rightShiftResult = num2 >> 1; // 0000 0001 (1 in decimal)

        System.out.println("Bitwise AND: " + andResult);
        System.out.println("Bitwise OR: " + orResult);
        System.out.println("Bitwise XOR: " + xorResult);
        System.out.println("Bitwise NOT (num1): " + notResult1);
        System.out.println("Bitwise NOT (num2): " + notResult2);
        System.out.println("Left Shift: " + leftShiftResult);
        System.out.println("Right Shift: " + rightShiftResult);
    }
}
