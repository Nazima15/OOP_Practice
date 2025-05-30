public class Example03 {
    public static void main(String[] args) {
        int a[] = new int[2]; 
        
        try {
            System.out.println("잘못된 요소에 접근 : " + a[3]);
            // 배열 크기는 2인데 인덱스 3에 접근하려고 하여 예외 발생
        }
        catch(Exception e) {
            System.out.println("예외 발생 ArrayIndexOutOfBoundException " + e);
            // 예외 메시지 출력
        }
        finally {
            System.out.println("finally는 항상 실행됩니다.");
            // 예외 발생 여부와 관계없이 항상 실행됨
        }
    }
}

/*
실행 결과:

예외 발생 ArrayIndexOutOfBoundException java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
finally는 항상 실행됩니다.
*/
