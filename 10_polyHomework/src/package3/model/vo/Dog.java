package package3.model.vo;

public class Dog extends Animal {
	
	public String Place = "애견카페"; 
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
		return "저의 이름은 "+getName()+"이고, 종류는 "+getKinds()+"입니다.";
	}

	@Override
	public void speak() {
		String toStr = toString();
		System.out.print(toStr);
		System.out.println("\n몸무게는 "+weight+"kg입니다.");
		
	}



}
