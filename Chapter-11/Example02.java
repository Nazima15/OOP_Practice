// Example02.java - 숫자 변환 예외 처리 예제
public class Example02 {
    public static void main(String[] args) {
        try { 
            Integer in = new Integer("abc"); // 문자열 "abc"를 Integer로 변환 시도
            in.intValue(); // int 값으로 변환
        } 
        catch(ArithmeticException e) { 
            System.out.println("예외 발생 ArithmeticException " + e); 
        } 
        catch(NumberFormatException e) { 
            System.out.println("예외 발생 NumberFormatException " + e); 
        } 
        System.out.println("try~catch문의 외부 문장입니다."); 
    } 
}
