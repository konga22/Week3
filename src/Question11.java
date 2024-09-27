import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("3가지 숫자를 입력하세용: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b ) {//만약 a가 b보다 크다?
            if (a > c) {//a가 c보다 크다면 큰숫자는 a
                System.out.println("가장 큰 숫자는 "+a+" 입니당");
            }else {//근데 a보다 c가 더 크다? 큰숫자는 c
                System.out.println("가장 큰 숫자는 "+c+" 입니당");
            }
        }else {//근데 a가 작다?
            if (b > c) {//만약 b가 c보다 크다? 큰숫자는 b
                System.out.println("가장 큰 숫자는" + b + " 입니당");
            } else {//아니다?
                System.out.println("가장 큰 숫자는" + c + "입니당");
            }
        }
    }
}

