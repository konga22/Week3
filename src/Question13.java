import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1번째 숫자: ");
        int n1 = sc.nextInt();
        System.out.println("다음에 들어갈 연산자( + - * / ) : ");
        char u1 = sc.next().charAt(0);
        System.out.println("2번째 숫자: ");
        int n2 = sc.nextInt();
        System.out.println("다음에 들어갈 연산자( + - * / ) : ");
        char u2 = sc.next().charAt(0);
        System.out.println("3번째 숫자: ");
        int n3 = sc.nextInt();
        sc.close();
        double end = 0;//u1 최종
        double end2 = 0;//u1 중간값
        double endd = 0;
        double end22 =0;
        double end4 =0;

        switch (u1){
            case '*':
                    end2 = n1*n2;
                    break;
            case '/':
                end2 = n1/n2;
                break;
            case '+':end = end2 + n3;
                break;
            case '-':end = end2 - n3;
                break;
            default:
                System.out.println("잘못한 계산");//end 가 u1최종 결과값
        }
        switch (u2){
            case '*':
                end22 = n2*n3;
                break;
            case '/':
                end22 = n2/n3;
                break;
            case '+':endd = end22 + n1;
                break;
            case '-':endd = end22 - n1;
                break;
            default:
                System.out.println("잘못한 계산");//end 가 u1최종 결과값
        }

        end4 = endd + end;
        System.out.println("계산결과: "+end4);


    }
}
