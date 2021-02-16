package package3.model.vo;

public class Cat extends Animal{
	
	private String location;
	private String color;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "저의 이름은 "+getName()+"이고, 종류는 "+getKinds()+"입니다.";
	}
	
	@Override
	public void speak() {
		String toStr = toString();
		System.out.print(toStr);
		System.out.println("\n"+location+"에 서식하며, 색상은 "+color+"입니다.");	
	}
	
	

}
