import java.util.Scanner;

public class 문제3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        while(true){

            System.out.print("이름 입력: ");
            String name = scanner.nextLine();
            if(name.contains(" ")||name.isEmpty()){
                System.out.println("유효하지 않은 입력입니다.");
                continue;
            }

            System.out.print("나이 입력: ");
            String ageStr=scanner.nextLine();
            int age=0;//선언
            if(ageStr.matches("\\d+")){
                age = Integer.parseInt(ageStr);//할당
                if(age < 0){
                    System.out.println("유효하지 않은 입력입니다.");
                    continue;
                }
            }else{
                System.out.println("유효하지 않은 입력입니다.");
                continue;
            }

            System.out.print("이메일 입력: ");
            String email = scanner.nextLine();
            if (!email.contains("@")) {
                System.out.println("유효하지 않은 입력입니다.");
                continue;
            }

            System.out.print("비밀번호 입력: ");
            String password = scanner.nextLine();
            if (password.length() < 8) {
                System.out.println("유효하지 않은 입력입니다.");
                continue;
            }

            System.out.println("\n[회원 정보]");
            System.out.println("이름: " + name);
            System.out.println("나이: " + age); //age변수는 if블록밖에선언해야함
            System.out.println("이메일: " + email);
            System.out.println("비밀번호: " + "*".repeat(password.length()));
            break;
        }

        scanner.close();
    }
}
