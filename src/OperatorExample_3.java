public class OperatorExample_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean flag = false;

        // 복합적인 수식
        int result = (++a * b - 15) > (b / 2) && !flag ? a + b : b - a;

        // ++a : a=11
        // (++a * b ) : 11 * 20 , 220
        // (b / 2) : 20/2 = 10
        // (++a * b - 15) : 220 - 15 = 205

        // (++a * b - 15) > ( b/2) : 205 > 15 = true
        // !flag = true 느낌표는 반대
        // true && true = true

        // true ? a + b : b - a;
        // 11 + 20 = 31

        System.out.println("Result: " + result);
    }
}