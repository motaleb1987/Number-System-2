package value_conversion;

public class IntToStrConversion {
    public static void main(String[] args) {

        // Double to String
        double d=100;
        String str=Double.toString(d);
        System.out.println("Double Convert to String: "+str);

        // Double to String
        String string="14930";
        int i=Integer.parseInt(string);
        System.out.println("String Convert to Integer: "+i);

        String str2="50";
        int i2=Integer.valueOf(str2);
        System.out.println("String Convert to Integer: "+i2);

    }
}
