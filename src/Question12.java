import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("4개 과목 점수를 넣으세용: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt(); //과목 점수
        sc.close();
        double p; //평균
        p = (a + b + c + d) / 4.0;
        System.out.println("당신의 과목 평균 값: "+p);
                if (p >= 60){
                    System.out.println("합격 ! ");
                }else {
                    System.out.println("불합격 ! ");
                }
    }
}
