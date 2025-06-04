import java.io.File;
import java.io.FileReader;

public class FileHandling05 {
    public static void main(String[] args) {
        // 읽을 파일 객체 생성
        File file = new File("member.txt");

        try {
            // 파일이 존재하지 않으면 새로 생성
            if (!file.exists())
                file.createNewFile();

            // 문자 단위로 읽기 위한 FileReader 생성
            FileReader fis = new FileReader(file);
            int i = 0;

            // 파일 끝까지 한 문자씩 읽어서 출력
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            // FileReader 스트림 닫기
            fis.close();
            System.out.println("파일 읽기 성공");
        } catch (Exception e) {
            // 예외 발생 시 메시지 출력
            System.out.println(e);
        }
    }
}

