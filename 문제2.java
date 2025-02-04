import java.util.Scanner;
public class 문제2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("문자열 입력: ");
            String input = scanner.nextLine();
            String lowercaseInput = input.toLowerCase();
    
            boolean isPalindrome =true;
            int length = lowercaseInput.length();
    
            for(int i=0; i<length/2; i++){
                if(lowercaseInput.charAt(i) !=lowercaseInput.charAt(length -1 -i)){
                    isPalindrome=false;
                    break;
                } 
            }
    
            if(isPalindrome){
                System.out.println("입력한 문자열은 펠린드롬입니다.");
            }else{
                System.out.println("입력한 문자열은 펠린드롬이 아닙니다.");
            }
    
            break;
        }
        scanner.close();
    }
}
