package ch08.extended.people;

public class Student extends People{
	//생성자가 없어서 빨간줄나왔음
	//필
	public int studentNo;
	
	
	//생
	//생성자는 클래스랑 같은 이름으로 만들고, 리턴 없음
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);
		//this.name = name; <<< 부모클래스에서 똑같은걸 만들어놔서 빨간줄뜸.
		//this.ssn = ssn; 대신 슈퍼를 통해서 가져옴
		this.studentNo = studentNo;
		
	}// 커스텀 생성자 Student student = new Student("아무개, 주민번호",2406);
	
	
	
	//메
	
	
	
}//클래스