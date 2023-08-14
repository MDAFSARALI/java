/*
 BITWISE OPERATIONS CONCEPT:
 a & b   ------> 1 if both bits are 1
 a | b   ------>1 if either ofthe bits is 1
 a ^ b   ------->1 if both bits are different
 ~a      -------->Complement the bits
a<<b     -------->Shift the bits left by b positions.Zero bits are added from the LSB side .Bits are discarded from the MSB side.
a>>b     -------->Shift the bits right by b positions.Sign bits are copied from the MSb side .Bits discarded from the LSB side.
a>>>b    -------->Shift the bits right by b positions.Zero bits are added from the MSB side.Bits are discarded from the LSB side.
 */

import java.util.Scanner;

public class Book_ch_02_ex_3_4 {
    public static void main(String[] args) {
        System.out.println("Enter the value of X and Y: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("BITWISE AND: " + x + "&" + y + "=" + (x & y));
        System.out.println("BITWISE OR: " + x + "|" + y + "=" + (x | y));
        System.out.println("BITWISE XOR: " + x + "^" + y + "=" + (x ^ y));
        System.out.println("BITWISE NOT: ~ " + x +"=" +(~x));
        sc.close();
    }
}
