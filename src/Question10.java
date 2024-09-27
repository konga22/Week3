import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세용: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("3의 배수이면서 5의 배수입니다");//3의배수와 5의 배수는 최소공배수로 하였을때 15의 배수였슴당
        } else if (n % 3 == 0 && n % 5 != 0) {
            System.out.println("3의 배수입니다 하지만 5의 배수가 아닙니다");
        } else if (n % 3 != 0 && n % 5 == 0) {
            System.out.println("3의 배수가 아닙니다 하지만 5의 배수입니다");
        } else if (n % 3 != 0 && n % 5 != 0) {
            System.out.println("둘 다 아닙니다 껄껄");
        }
    }
}
