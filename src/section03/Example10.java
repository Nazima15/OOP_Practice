package section03;
import java.util.Calendar;
public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		System.out.print("현재 날짜: ");
		System.out.print(calendar.get(Calendar.YEAR)+ "년");
		System.out.print((calendar.get(Calendar.MONTH) + 1) + "월");
		System.out.print(calendar.get(Calendar.DATE)+ "일");

	}

}
