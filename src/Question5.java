import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력하세용: ");
        int n = sc.nextInt();

        if (n>18){
            System.out.println("성인입니다");
        }
        else {
            System.out.println("미성년자 입니다");
        }
    }
}
