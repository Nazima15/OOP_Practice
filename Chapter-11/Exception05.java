// 사용자 정의 예외 클래스 InvalidException
class InvalidException extends Exception {
    public InvalidException(String s) {
        super(s);
    }
}

public class Exception05 {
    // weight가 100 미만이면 InvalidException 예외 발생
    void check(int weight) throws InvalidException {
        if (weight < 100) {
            throw new InvalidException("InvalidException 클래스 호출입니다.");
        }
    }

    public static void main(String[] args) {
        Exception05 obj = new Exception05();
        try {
            obj.check(60); // 60을 전달하여 예외 발생 유도
        } catch (InvalidException ex) {
            System.out.println("예외 처리입니다.");
            System.out.println(ex.getMessage());
        }
    }
}
