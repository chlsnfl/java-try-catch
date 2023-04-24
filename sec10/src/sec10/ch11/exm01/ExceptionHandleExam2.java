package sec10.ch11.exm01;

public class ExceptionHandleExam2 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
			System.out.println("com.lang.String 이 존재합니다.");
		}catch (ClassNotFoundException e){
			e.printStackTrace();

			}
		}
		

	}

