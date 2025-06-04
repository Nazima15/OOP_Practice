public class Example04 {
   static void check() throws ArithmeticException { 
       System.out.println("내부 메서드");
       int div = 5 / 0;  // 0으로 나누기 예외 발생
   }

   public static void main(String[] args) {
       try {
           check();
       }
       catch(ArithmeticException e) {
           System.out.println("예외 발생 " + e);
       }
   } 
}

/*
결과 예시:
내부 메서드
예외 발생 java.lang.ArithmeticException: / by zero
*/
