import java.util.Scanner;

public class 문제4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("가로 길이 입력: ");
        int width = scanner.nextInt();
        
        System.out.print("세로 길이 입력: ");
        int height = scanner.nextInt();
        scanner.nextLine();

        System.out.print("출력할 문자 입력: ");
        String ch = scanner.nextLine();
        5
        //scanner.nextLine();
        
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}