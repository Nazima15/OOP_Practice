import java.io.File;
import java.io.FileInputStream;

public class FileHandling04 {
    public static void main(String[] args) {
        // 읽을 파일 객체 생성
        File file = new File("gugudan.txt");
        try {
            // 파일이 없으면 새로 생성
            if (!file.exists())
                file.createNewFile();

            // 파일을 바이트 단위로 읽기 위한 FileInputStream 생성
            FileInputStream fis = new FileInputStream(file);
            int i = 0;

            // 파일 끝(-1)까지 한 바이트씩 읽으며 출력
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            // 스트림 닫기
            fis.close();
            System.out.println("파일 읽기 성공");
        } catch(Exception e) {
            // 예외 발생 시 메시지 출력
            System.out.println(e);
        }
    }
}

