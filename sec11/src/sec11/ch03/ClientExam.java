package sec11.ch03;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExam {

	public static void main(String[] args) {
		try {
			//소캣 생성과 동시에 localHost:8081 로 연결 요청
			Socket socket = new Socket("localhost", 8081);
			System.out.println("클라이언트가 8081로 요청에 성공하였습니다.");
			System.out.println("Nomcat에 연결되었습니다.");
			//socket 닫기
			socket.close();
			System.out.println("클라이언트가 연결을 끊었습니다.");
			
			
		}catch(UnknownHostException e) {
			
		}catch(IOException e) {
			
		}

	}

}
