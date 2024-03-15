package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Apartment;

public class ApartmentEx {

	public static void main(String[] args) {
		List<Apartment> apart = new ArrayList<>();
		for(int i=0; i<3 ; i++) {
			Apartment ap = new Apartment ();
			apart.add(ap);
		}
		for(Apartment ap : apart) {
			System.out.println(ap.toString()); 
		}
	}
}

