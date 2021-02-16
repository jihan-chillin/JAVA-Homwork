package package3.model.vo;

public abstract class Animal {
	
	private String name;  // 동물이름
	private String kinds;  // 동물종
	
	protected Animal() {
		// TODO Auto-generated constructor stub
	}

	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public String toString() {
		return "저의 이름은 "+name+"이고, 종류는 "+kinds+"입니다.";
	}
	
	public abstract void speak();
	

}
