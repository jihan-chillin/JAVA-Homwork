package package3.model.vo;

public class Dog extends Animal {
	
	public String Place = "�ְ�ī��"; 
	private int weight;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}
	
	
	
	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "���� �̸��� "+getName()+"�̰�, ������ "+getKinds()+"�Դϴ�.";
	}

	@Override
	public void speak() {
		String toStr = toString();
		System.out.print(toStr);
		System.out.println("\n�����Դ� "+weight+"kg�Դϴ�.");
		
	}



}
