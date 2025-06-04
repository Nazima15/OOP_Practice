public class Exception03 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {
            // 배열 인덱스 0부터 3까지 접근 시도 (3은 존재하지 않는 인덱스)
            for(int i = 0; i <= 3; i++) {
                System.out.println("arr[" + i + "] : " + arr[i] );
            }
        }
        catch(Exception ex) {
            System.out.println("예외 처리입니다....");
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("예외 발생 여부와 상관없이 실행됩니다."); 
        }
    }
}

/*
결과 예시:
arr[0] : 10
arr[1] : 20
arr[2] : 30
예외 처리입니다....
3
예외 발생 여부와 상관없이 실행됩니다.
*/
