package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {
	
	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		
		a[0] = new Dog("��", "�ùٰ�", 15);
		a[1] = new Dog("����", "�׷���Ʈ�Ƿ�����", 58);
		a[2] = new Cat("����", "�ڸ��ȼ�Ĺ", "�ѱ�", "ȸ��");
		a[3] = new Cat("����", "�ڸ��ȼ�Ĺ", "����", "����");
		a[4] = new Dog("��", "�ùٰ�", 17);
		
		
		for(int i =0; i<a.length; i++) {
			a[i].speak();
			System.out.println();
			
		}
	}

}
