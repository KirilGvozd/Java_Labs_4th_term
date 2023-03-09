package by.belstu.it.Gvozdovskiy.basejava;
import static java.lang.Math.*;
/**
 * @author Kirill
 * @version 1.1
 * */
public class JavaTest {
    static int sint;
    public final int secondFinalVariable = 1;
    public static int thirdFinalVariable = 2;
    /**
     * @param args - аргументы
     * */
    public static void main(String[] args) {
        final int firstFinalVariable = 0;
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
        long veryBigLongVariable = 0x7ff_ffff_ffffL;
        char firstCharVariable = 'a';
        char secondCharVariable = '\u0061';
        char thirdCharVariable = 97;
        System.out.println("Sum of char variables: " + firstCharVariable + " " + secondCharVariable + " " + thirdCharVariable);

        System.out.println(3.45 % 2.4);
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println("Log(-345)" + Math.log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));

        System.out.println("Math.PI: " + PI);
        System.out.println("Math.E: " + E);
        System.out.println("Округление: " + Math.round(PI) + " " + Math.round(E));
        System.out.println("Нахождение минимального: " + Math.min(PI, E));
        System.out.println("Случайное число от 0 до 1: " + Math.random());

        Boolean booleanObject = true;
        Character charObject = 'A';
        Integer integerObject = 12;
        Byte byteObject = (byte) 1;
        Short shortObject = (short) -2;
        Long longObject = 200L;
        Double doubleObject = 1.222;

        System.out.println("Побитовый сдвиг вправо объекта типа Character: " + (charObject >> 1));
        System.out.println("Умножение Character на Integer: " + (charObject * integerObject));
        System.out.println("Логическая операция & над Integer и Character: " + (integerObject & integerObject));
        System.out.println("MIN_VALUE и MAX_VALUE для long: " + Long.MIN_VALUE + ", " + Long.MAX_VALUE);
        System.out.println("MIN_VALUE и MAX_VALUE для double: " + Double.MIN_VALUE + ", " + Double.MAX_VALUE);

        Integer boxedIntegerVariable = 10;
        int unboxedIntegerVariable = boxedIntegerVariable;

        Byte boxedByteVariable = 5;
        byte unboxedByteVariable = boxedByteVariable;

        System.out.println("parseInt: " + Integer.parseInt("170"));
        System.out.println("toHexString (200): " + Integer.toHexString(200));
        System.out.println("compare (1, 2): " + Integer.compare(1, 2));
        System.out.println("toString (201): " + Integer.toString(201));
        System.out.println("bitCount (102): " + Integer.bitCount(102));
        System.out.println("isNaN (sqrt(-1)): " + Double.isNaN(Math.sqrt(-1)));

        String s34 = "2345";
        //Integer s34Integer = new Integer(s34);
        System.out.println("valueOf: " + Integer.valueOf(s34));
        System.out.println("parse: " + Integer.parseInt(s34));

        byte[] byteArray = s34.getBytes();
        System.out.println("Массив из байтов: " + byteArray);
        String s34FromByteArray = new String(byteArray);
        System.out.println("s34 из массива байтов: " + s34FromByteArray);

        System.out.println("Первый способ преобразования в Boolean: " + Boolean.valueOf(s34));
        System.out.println("Второй способ преобразования в Boolean: " + Boolean.getBoolean(s34));
        System.out.println("Третий способ преобразования в Boolean: " + Boolean.parseBoolean(s34));

        String firstString = "Hello";
        String secondString = "Hello";
        System.out.println("firstString == secondString: " + (firstString == secondString));
        System.out.println("firstString.equals(secondString): " + firstString.equals(secondString));
        System.out.println("firstString.compareTo(secondString): " + firstString.compareTo(secondString));

        firstString = null;
        System.out.println("secondString == firstString: " + (firstString == secondString));
        System.out.println("secondString.equals(firstString): " + secondString.equals(firstString));
        //System.out.println("secondString.compareTo(firstString): " + secondString.compareTo(firstString));

        String stringForMethods = "Even flow, thoughts arrive like butterflies";
        String[] arrayOfStrings = stringForMethods.split(", ");
        System.out.println("Первая подстрока: " + arrayOfStrings[0]);
        System.out.println("Вторая подстрока: " + arrayOfStrings[1]);
        System.out.println("contains: " + stringForMethods.contains("Even flow"));
        System.out.println("hashCode: " + stringForMethods.hashCode());
        System.out.println("indexOf: " + stringForMethods.indexOf("arrive"));
        System.out.println("length: " + stringForMethods.length());
        System.out.println("replace: " + stringForMethods.replace("Even flow", "Pearl Jam"));

        char[] [] c1;
        char[] c2 [];
        char c3[][];

        int emptyArray[] = new int[0];
        //System.out.println(emptyArray[2]); Exception

        c1 = new char[3][];
        c1[0] = new char[1];
        c1[1] = new char[2];
        c1[2] = new char[3];
        System.out.println("c1.length: " + c1.length);
        System.out.println("c1[0].length: " + c1[0].length);
        System.out.println("c1[1].length: " + c1[1].length);
        System.out.println("c1[2].length: " + c1[2].length);

        c2 = new char[][] {{'1','2','3'}, {'4','5','6'}, {'7','8','9'}};
        c3 = new char[][] {{'1','2','3'}, {'4','5','6'}, {'7','8','9'}};
        boolean result = c2 == c3;
        System.out.println("Результат с2 == с3: " + result);

        for (char[] inner_arr: c2) {
            for (char cell: inner_arr) {
                System.out.println(cell);
            }
        }

        String stringForWrapper = "Hello, world!";
        WrapperString wrapperString = new WrapperString(stringForWrapper);
        wrapperString.replace('H', 'G');
        var secondWrapperString = new WrapperString(stringForWrapper) {
            @Override
            public void replace(char oldChar, char newChar) {
                System.out.println(stringForWrapper.replace(oldChar, newChar));
            }
            public void delete(String newChar) {
                System.out.println(stringForWrapper.replace(newChar, ""));
            }
        };

        secondWrapperString.replace('H', 'G');
        secondWrapperString.delete(", world!");
    }
}
