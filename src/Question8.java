import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키를 적어주세용: ");
        double k = sc.nextDouble();
        System.out.print("몸무게를 적어주세용: ");
        double m = sc.nextDouble();
        double bmi = sc.nextDouble();
        bmi = k /m * m;
        if (bmi < 18.5) {
            System.out.print("저체중");

        }
        else if (bmi < 25) {
            System.out.print("정상");
        }
    }
}
