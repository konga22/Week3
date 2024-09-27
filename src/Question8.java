import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(ex:170 -> 1.70)\n 키를 적어주세용: ");
        double height = sc.nextDouble();
        System.out.print("몸무게를 적어주세용: ");
        double weight = sc.nextDouble();
        double bmi;
        bmi = weight / (height * height);
        System.out.println("당신의 bmi: " + bmi);
        if (bmi < 18.5) {
            System.out.println("저체중");

        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("정상");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("과체중");
        }
        else {
            System.out.println("비만");
        }

    }
}
