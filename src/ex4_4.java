import java.util.Scanner;

/**
 * Created by 노승화 on 2017-06-16.
 */
public class ex4_4 {
    /*
    다음 4개의 조건에 맞는 “숫자 맞추기 퀴즈" 프로그램을 작성 하시오.
    1. 3개짜리 int형 배열 numbers를 준비하시오.
        이 때 초기화는 각각 “3”, “4”, “9” 로 합니다.
    2. 화면에 “1자리의 숫자를 입력 해 주세요" 라고 표시합니다
    3. 다음 코드를 사용해 키보드로부터 숫자를 입력 받아,
       변수 input 에 대입합니다
        int input = new java.util.Scanner(System.in).nextInt();
    4. 배열을 루프로 돌리면서, 어떤 요소와 같은지 조사합니다.
       만약 같다면 “정답!” 이라고 표시합니다.
    */
    public static void main(String[] args) {
        int[] number = {3, 4, 9};
        System.out.println("1자리의 숫자를 입력 해 주세요");
        int input = new Scanner(System.in).nextInt();
        for (int element : number) {
            if (element == input) {
                System.out.println("정답!");
                break;
            }
        }
    }
}
