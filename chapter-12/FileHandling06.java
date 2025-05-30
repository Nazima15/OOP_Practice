import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileHandling06 {
    public static void main(String[] args) {

        // member.txt 파일 객체 생성
        File file = new File("member.txt");
        try {
            // 파일이 존재하지 않으면 새로 생성
            if (!file.exists())
                file.createNewFile();

            // 문자 단위 읽기를 위한 FileReader 생성
            FileReader fis = new FileReader(file);
            // 성능 향상을 위해 BufferedReader로 감싸기
            BufferedReader br = new BufferedReader(fis);

            String str;

            // 한 줄씩 읽어서 출력, 더 이상 읽을 라인이 없으면 종료
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

            // FileReader 스트림 닫기
            fis.close();
            System.out.println("파일 읽기 성공");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

