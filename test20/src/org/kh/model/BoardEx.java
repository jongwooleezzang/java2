package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Apartment;
import section.Board;

public class BoardEx {

	public static void main(String[] args) {
		List<Board> brd = new ArrayList();
		for(int i=0; i<11 ; i++) {
			Board b = new Board (i,"제목"+i,"내용"+i,"저자"+i,"24.03."+(1+i),10000);
			brd.add(b);
		}
		for(Board b : brd) {
			System.out.println(b.toString());
		}
	}
}
