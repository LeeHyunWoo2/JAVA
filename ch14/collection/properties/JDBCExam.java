package ch14.collection.properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class JDBCExam {

	public static void main(String[] args) throws Exception {
		// properties는 텍스트 문서를 java 코드의 k, v 형태로 불러온다.
		
		Properties properties = new Properties(); // 빈 객체 생성
		String path = JDBCExam.class.getResource("jdbc.properties").getPath();
		// 파일의 위치 정보를 path 변수에 넣음
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8");
		// 영어, 숫자가 아닐수도 있으니 UTF-8 로 변환 (메모장 저장 과정에서 인코딩 못했을까봐 입력함)
		
		properties.load(new FileReader(path));
		// 프로퍼티스로 불러옴.
		
		String driver = properties.getProperty("driver");
		System.out.println("오라클 드라이버 : " + driver);
		String url = properties.getProperty("url");
		System.out.println("URL : " + url);
		String username = properties.getProperty("username");
		System.out.println("유저네임 : " + username);
		String password = properties.getProperty("password");
		System.out.println("패스워드 : " + password);
		
	}

}