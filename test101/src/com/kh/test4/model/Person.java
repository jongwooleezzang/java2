package com.kh.test4.model;

public class Person {
	
		String name;

		@Override
		public String toString() {
			return "Person [name=" + name + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Person(String name) {
			super();
			this.name = name;
		}
		
}
