package com.cc.java;

public class App {

	public static void main(String[] args) {

		// Inheritance | Vererbung

		Child child = new Child();

		// Mehrfachvererbung NICHT Möglich
		// Child --> Parent --> Grandparent
		// Serielle Vererbung (serial inheritance)
		// Speziallisierung nach unten
		// Generalisierung nach Oben
		// In Java keine Mehrfachvererbung -> Interfaces nutzen!

		child.sayHello();
		child.sayHello1();
		child.sayHello2();

		// gleiche SIGNATUR --> Overriding
	}

}
