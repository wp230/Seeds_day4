import java.util.*;


//리스트선언->랜덤추출..length값저장-> 입력값과 비교(반복문으로) 이 반복문에서 
//입력값[i] == 랜덤값[i]인 경우 매치 변수 카운트++ 매치변수카운트-length로 
//틀림값 변수에 할당
//틀린답일경우 1매치2틀림 같은 값만 출력하고 다시 답맞추는 행위 반복
//답을 맞출때까지 무한루프 
import java.util.*;

public class mission_week1 {
    public static void main(String[] args) {
        // 단어 리스트 선언
        String[] wordList = {"red", "green", "blue", "yellow"};
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;
        
        while (!isCorrect) {
            // 랜덤으로 단어 선택
            Random random = new Random();
            String targetWord = wordList[random.nextInt(wordList.length)];
            int wordLength = targetWord.length()
            
            boolean wordFound = false;
            System.out.println("단어 맞추기 게임을 시작합니다.");
            
            // 한 게임의 루프
            while (!wordFound) {
                System.out.print("입력:단어를 입력해주세요: ");
                String userInput = scanner.nextLine();
                
                // 입력값과 목표 단어의 길이 중 작은 값을 기준으로 비교
                int compareLength = Math.min(userInput.length(), wordLength);
                int matches = 0;  // 일치하는 문자 수
                
                // 문자 비교
                for (int i = 0; i < compareLength; i++) {
                    if (userInput.charAt(i) == targetWord.charAt(i)) {
                        matches++;
                    }
                }
                
                // 틀린 문자 수 계산 ...  yellow가 정답일때 yel을 입력한경우, 3매치 3틀림인데.. 이거 맞나?
                int incorrect = wordLength - matches;
                
                // 결과 출력
                if (matches == wordLength && userInput.length() == wordLength) {
                    System.out.println("정답입니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    
                    String choice = scanner.nextLine();
                    
                    if (choice.equals("1")) {
                        wordFound = true;
                    } else if (choice.equals("2")) {
                        wordFound = true;
                        isCorrect = true;
                    }
                    
                } else {
                    System.out.println(matches + "매치 " + incorrect + "틀림");
                }
            }
        }
        
        scanner.close();
    }
}