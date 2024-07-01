package ch09.interfaceExam.extended;

public class BirdExam {

	public static void main(String[] args) {
		// 다중 상속 인터페이스 테스트

		Flamingos flamingos = new Flamingos();
		flamingos.eat();
		flamingos.flying();
		flamingos.sound();

		System.out.println("==================================");
		Fly fly = flamingos; // 업캐스팅 (자동타입변환)
		fly.flying();
		fly.land();
		fly.takeOff();
		// fly.eat(); 부모가 달라서 안됨

		Animal animal = flamingos;
		animal.eat();
		animal.breath();
		animal.dispose();
		// animal.land(); 부모가 달라서 안됨

		Pterosaur pterosaur = new Pterosaur();
		// 마찬가지

	}

}
