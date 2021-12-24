package value_conversion;

public class BinaryOctHexa {
    public static void main(String[] args) {
        System.out.println("Convert Binary to Decimal");
        String binary="101011";
        Integer dec=Integer.parseInt(binary,2); // Binary Base=2
        System.out.println(" Binary: "+binary+" \n Decimal :"+dec);


        System.out.println("Convert Octal to Decimal");
        String octal="675"; // 01234567
        Integer dec2=Integer.parseInt(octal,8); // Octal Base=8
        System.out.println(" Octal: "+octal+" \n Decimal :"+dec2);

        System.out.println("Convert Hexadecimal to Decimal");
        String hex="F"; // Start from A to Z
        Integer dec3=Integer.parseInt(hex,16); // Octal Base=8
        System.out.println(" Hexadecimal: "+hex+" \n Decimal :"+dec3);
    }
}

