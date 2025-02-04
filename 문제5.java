import java.util.Scanner;

public class 문제5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("주문한 메뉴 개수 입력: ");
        int menuCount = scanner.nextInt();
        int total=0;
        int price=0;

        for(int i =0; i<menuCount; i++){
            System.out.print("메뉴 가격 입력: ");
            price =scanner.nextInt();
            
            if(price<0){
                System.out.println("잘못된 입력입니다.");
                return; // break라고 적었었음 return은 main메소드 전체종료
            }
            total+=price;
        } 
        double tax=total*0.1;
        double finalMoney=total+tax; //final은 키워드입니다 변수명 x
        System.out.printf("총 합계: %.2f\n",(double)total);
        System.out.printf("부가세(10%%): %.2f원\n", tax);//%를 하고싶으면 %%?
        System.out.printf("최종 금액: %.2f원\n", finalMoney);
        scanner.close();
    }
}