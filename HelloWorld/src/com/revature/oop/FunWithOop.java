package com.revature.oop;

import java.util.ArrayList;
import java.util.List;

public class FunWithOop {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.setName("fluffy"); // we have this because we inherited it

		Bear bear1 = new Bear();
		bear1.setName("jinkies");

		List<Animal> animalList = new ArrayList<Animal>();

		animalList.add(cat1);
		animalList.add(bear1);

		System.out.println(animalList.toString());
		
		System.out.println(animalList.toString());
		
		for (Animal a : animalList) {
			if(a instanceof Domestic) {
				((Domestic) a).pet();
			}
		}
	}

}
