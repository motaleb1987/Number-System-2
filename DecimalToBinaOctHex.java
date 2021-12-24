package value_conversion;

import java.util.Scanner;

public class DecimalToBinaOctHex {
    public static void main(String[] args) {
        System.out.println("Enter a Decimal number ");
        Scanner input=new Scanner(System.in);

        int dec=input.nextInt();

        System.out.println("Decimal to Binary");
        String binary=Integer.toBinaryString(dec);
        System.out.println(" Decimal: "+dec+" \n Binary :"+binary);

        System.out.println("Decimal to Octal");
        String octal=Integer.toOctalString(dec);
        System.out.println(" Decimal: "+dec+" \n Octal :"+octal);

        System.out.println("Decimal to Hexadecimal");
        String Hex=Integer.toHexString(dec);
        System.out.println(" Decimal: "+dec+" \n Hexadecimal :"+Hex);
    }
}
