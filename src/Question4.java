import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세용: ");
        double one = sc.nextDouble();

        System.out.println("두 번째 숫자를 입력하세용:");
        double two = sc.nextDouble();

        System.out.print("연산자(+, -, *, /)를 정하세용: ");
        char a = sc.next().charAt(0);
        double end = 0;
        switch (a) {
            case '+':
                end = one + two;
                break;
            case '-':
                end = one - two;
                break;
            case '*':
                end = one * two;
                break;
            case '/':
                end = one / two;
                break;
        }
        System.out.println("결과: " + end);
    }
}
