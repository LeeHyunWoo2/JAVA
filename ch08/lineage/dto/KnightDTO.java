package ch08.lineage.dto;

public class KnightDTO extends HumanDTO {
	//                 상속한다.   객체를

	// 필드
	private String sword; // 검
	private String armor; // 갑옷
	private String shield; // 방패

	
	
	
	// 생

	
	
	
	
	
	// 메
	public String getSword() {
		return sword;
	}

	public String getArmor() {
		return armor;
	}

	public String getShield() {
		return shield;
	}

	public void setSword(String sword) {
		this.sword = sword;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}

	public void setShield(String shield) {
		this.shield = shield;
	}

}