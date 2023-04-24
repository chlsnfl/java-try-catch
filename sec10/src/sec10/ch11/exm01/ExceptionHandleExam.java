package sec10.ch11.exm01;

public class ExceptionHandleExam {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		printLength("안녕하세용");

		printLength(null);
		System.out.println("프로그램 종료");
	}
	
	public static void printLength(String data) {
		try {
		int result = data.length();
		System.out.println("문자의 수는 "+result);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			//e.toString();
			//e.printStackTrace(null);
		}finally {
			System.out.println("얘는 무조건 실행");
		}
	}

}
