public class MyMath {
    public static double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return x / y;
    }

}
