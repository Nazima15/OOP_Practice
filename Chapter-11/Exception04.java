import java.util.Scanner;

public class Exception04 {

    // 음수일 경우 NumberFormatException을 강제로 발생시키는 메서드
    static void check(int num) throws NumberFormatException {
        if (num < 0)
            throw new NumberFormatException("0보다 작습니다.");  // 예외 발생
        else
            System.out.println(num);  // 정상 출력
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = s.nextInt();

        try {
            if (num < 0)
                throw new NumberFormatException("0보다 작습니다.");  // 직접 예외 발생
            else
                System.out.println(num);  // 정상 출력

            check(num);  // 메서드 호출하여 예외 검사
        } catch (NumberFormatException e) {
            System.out.println("예외 발생 " + e);  // 예외 메시지 출력
        }
    }
}
