import java.util.Scanner;

public class Exception02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("숫자를 입력하세요."); // 사용자에게 숫자 입력 요청
        int num = s.nextInt(); // 입력 받은 숫자 저장

        int arr[] = new int[5]; // 크기가 5인 배열 생성

        try {
            // 배열 인덱스에 num을 사용하고, 10을 num으로 나누기 시도
            arr[num] = 10 / num;
            System.out.println(arr[num]); // 결과 출력
        }
        catch (ArithmeticException e) {
            System.out.println("0이 아닌 값을 입력하세요."); // 0으로 나눌 때 발생하는 예외 처리
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("올바른 배열 인덱스를 입력하세요."); // 배열 인덱스 범위 벗어날 때 예외 처리
            System.out.println(e.getMessage());
        }
    }
}
