package chapter14;

public class AutoCloseObjTest {
	public static void main(String[] args) {
		try(AutoCloseable obj = new AutoCloseObj()){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외부분입니다.");
		}
	}
}
