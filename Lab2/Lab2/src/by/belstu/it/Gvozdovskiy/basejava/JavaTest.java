package by.belstu.it.Gvozdovskiy.basejava;

public class JavaTest {
    static int sint;

    public static void main(String[] args) {
        char charVariable = 'K';
        int integerVariable = 100;
        short shortIntegerValue = 50;
        byte byteIntegerVariable = 25;
        long longIntegerVariable = 200L;
        boolean logicalVariable = false;
        String stringVariable = "Some string variable";
        double doubleVariable = 20.0004332;

        System.out.println("String + int: " + (stringVariable + integerVariable));
        System.out.println("String + char: " + (stringVariable + charVariable));
        System.out.println("String + double: " + (stringVariable + doubleVariable));
        byteIntegerVariable = (byte) (byteIntegerVariable + integerVariable);
        System.out.println("Byte = byte + int: " + byteIntegerVariable);
        integerVariable = (int) (doubleVariable + longIntegerVariable);
        System.out.println("int = double + long: " + integerVariable);
        longIntegerVariable = (long) integerVariable + 2147483647;
        System.out.println("long = int + 2147483647 = " + longIntegerVariable);
        System.out.println("Static int без инициализации: " + sint);
        logicalVariable = logicalVariable && logicalVariable;
        logicalVariable = logicalVariable ^ logicalVariable;
        //System.out.println("Boolean + boolean = " + (logicalVariable + logicalVariable));
        //Нельзя boolean + boolean
        long veryLongVariable = 9223372036854775807L;
        long theBiggestIntegerValue = 0x7ff_ffff_ffffL;


    }
}
