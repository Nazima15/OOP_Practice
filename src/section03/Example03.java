package section03;
import com.javamaster.mypackage.*;
public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat01=new Cat();
		Cat cat02=new Cat();
		System.out.println(cat01.toString());
		System.out.println(cat02.toString());
		System.out.println(cat01.equals(cat02));
		cat01=cat02;
		System.out.println(cat01.equals(cat02));
		System.out.println(cat01.toString());
		

	}

}
