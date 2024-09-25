import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자: ");
    int one = sc.nextInt();

    System.out.print("두 번째 숫자: ");
    int two = sc.nextInt();

    System.out.print("연산자(+, -, *, /): ");
    /*char a = sc.next().charAt(0);
    double result = 0;
    switch (a) {
        case '+':
            result = one + two;
            break;
        case '-':
            result = one - two;
            break;
        case '*':
            result = one * two;
            break;
        case '/':
            result = one / two;
            break;
            System.out.println("결과: "+result); // 이 이후 잘 모르겠어요
    }
    */
    String a = sc.next();

    System.out.println("결과: " + one +" "+a+" "+ two );


    }
}
