import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling03 {
    public static void main(String[] args) {
        File file = new File("member.txt");  // member.txt 파일 객체 생성

        try {
            // 파일이 존재하지 않으면 새로 생성
            if (!file.exists())
                file.createNewFile();

            FileWriter fw = new FileWriter(file);  // 파일에 문자 쓰기 위한 FileWriter 생성
            Scanner input = new Scanner(System.in);  // 사용자 입력 받기 위한 Scanner 생성

            boolean quit = false;  // 반복 종료 조건 변수
            while (!quit) {
                System.out.print("아이디 : ");
                String userID = input.next();  // 아이디 입력 받기
                fw.write("아이디 : " + userID + " ");  // 파일에 아이디 쓰기

                System.out.print("이름 : ");
                String userName = input.next();  // 이름 입력 받기
                fw.write("이름 : " + userName + "\n");  // 파일에 이름 쓰기 및 줄바꿈

                System.out.println("계속 진행? Y | N ");
                input = new Scanner(System.in);  // 새로운 Scanner 생성 (입력 버퍼 초기화)
                String str = input.nextLine();  // 계속 진행 여부 입력 받기

                // 입력한 문자열을 대문자로 바꾸고 "N"이면 반복 종료
                if (str.toUpperCase().equals("N"))
                    quit = true;
            }
            fw.close();  // FileWriter 닫기 (파일 저장 완료)
            System.out.println("파일 쓰기 성공");

        } catch(Exception e) {
            e.getMessage();  // 예외 발생 시 메시지 출력 (필요시 e.printStackTrace()로 상세 출력 가능)
        }
    }
}

