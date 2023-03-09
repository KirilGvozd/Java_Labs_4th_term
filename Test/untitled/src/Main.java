public class Main {
    public static void main(String[] args) {
        int i = 128;
        Integer a = i;
        Integer b = i;
        System.out.println("a==b " + (a == b));
        Object arObj = new float[5];
        int [] mas1 = new int[24];
        Integer mas2 [] = new Integer[24];
        //char[] mas3 = new Character[] {'a', 'b', 'c'};
        double [] mas5 = {5, 10, 15, 20};
        int[] mas6 [] = new int[4] [5];
        int mas7 [] [] = new int [4][];
    }
}

class Point {
    public final void method () {}
}

class Location extends Point{
    public void method(){}
}
