package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {
	
	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		
		a[0] = new Dog("모나", "시바견", 15);
		a[1] = new Dog("벨로", "그레이트피레니즈", 58);
		a[2] = new Cat("밤이", "코리안숏캣", "한국", "회색");
		a[3] = new Cat("솜이", "코리안숏캣", "독일", "갈색");
		a[4] = new Dog("모리", "시바견", 17);
		
		
		for(int i =0; i<a.length; i++) {
			a[i].speak();
			System.out.println();
			
		}
	}

}
