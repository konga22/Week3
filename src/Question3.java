import java.awt.*;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세용: ");
        int suuuu = sc.nextInt();

        if (suuuu >=90){
            System.out.print("A");
        }
        else if (suuuu >=80){
            System.out.print("B");
        }
        else if (suuuu >=70){
            System.out.print("C");
        }
        else if (suuuu >=60){
            System.out.print("D");
        }
        else if (suuuu >=50){
            System.out.print("F");
        }
    }
}
