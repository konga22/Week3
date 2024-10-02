import java.util.Scanner;

public class Question9 {
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
                if (two !=0){ //2번째 숫자가 0이 아닐때
                    System.out.println(one / two);
                    end = one / two; //계산
                }else {//0일때
                    System.out.print("0으로 나누지 못해용");
                }

        }
        System.out.println("결과: " + end);
    }
}
