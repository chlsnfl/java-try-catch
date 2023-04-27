package sec11.ch01;

public class ExException01 {

	//실행메소드에서도 예외를 떠넘기면 jvm이 최종적으로 예외처리를 한다.
	public static void main(String[] args) throws ClassNotFoundException{
//		try {			//findClass();쓰면 에러가 나니 try-catch문으로 사용해야함
//			findClass();		//호출하는 곳에서 예외처리를 한다
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} 
		
		findClass();
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.Lnag.String");
	}

	//모든 예외는 exception의 상속을 받음
}
