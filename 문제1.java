import java.util.Scanner;

public class 문제1 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("변환할 방향 선택 (1: 섭씨→화씨, 2: 화씨→섭씨):");
            int choice = scanner.nextInt();

            if(choice!=1&&choice!=2){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            System.out.println("온도를 입력하세요: ");
            double temperature = scanner.nextDouble();
            double result;

            if(choice==1){
                result=(temperature*9/5)+32;
                System.out.printf("%.2f°C = %.2f°F%n", temperature, result);
            }else{
                result =(temperature-32)*5/9;
                System.out.printf("%.2f°F = %.2f°C%n", temperature, result);
            }

            break;
        }
    }
  }