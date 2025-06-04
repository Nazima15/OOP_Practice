public class Example05 {
    // 메서드에서 ArithmeticException 예외를 던진다
    static void check() throws ArithmeticException {
        System.out.println("내부 메서드 시작");
        int div = 5 / 0;  // 0으로 나누기 예외 발생
    }

    public static void main(String[] args) {
        try {
            check();  // 예외를 던지는 메서드 호출
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e);
        }
    }
}
