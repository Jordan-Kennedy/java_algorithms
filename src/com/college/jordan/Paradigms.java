package com.college.jordan;

import java.util.Scanner;

//Interface
interface Family {
	String sentence = "post";
	public void wack();
	public void wacky(String sentence);
}

class Parent {
	Parent() {
		System.out.println("Parent");
	}
	String familyName = "Kennedy";
	public String inherit() {
		return familyName;
	}
}
class Child extends Parent {
	Child() {
		this(13);
		System.out.println("Child");
	}
	Child(int input) {
		this(13.24);
		System.out.println(input);
	}
	Child(double input) {
		this('h');
		System.out.println(input);
	}
	Child(char input) {
		this("Hello kitty");
		System.out.println(input);
	}
	Child(String input) {
		this(true);
		System.out.println(input);
	}
	Child(boolean input) {
		System.out.println(input);
	}
}
class Grandchild extends Child implements Family {
	Grandchild(){
		super(false);
		System.out.println("Grandchild");
		wack();
		wacky(sentence);
	}
	public void wack() {
		System.out.println("Who needs friends when you've got family");
	}
	public void wacky(String sentence) {
		System.out.println(sentence);
	}
}

//Abstract class
abstract class Vehicle {
	abstract void Accelerate();
	abstract void Brake();
	abstract void Indicate(boolean b);
}

class Car extends Vehicle {
	Car() {
		Accelerate();
		Brake();
		Indicate(true);
	}
	void Accelerate() {
		System.out.println("Brum");
	}
	void Brake() {
		System.out.println("Skrrr");
	}
	void Indicate(boolean working) {
		if (working) {
			System.out.println("Tik tik tik");
		}
	}
}

class Encapsulation {
	
	private int age = 21;
	private String name = "Jordan";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class EncapsulationTwo {
	
	EncapsulationTwo(){
		Scanner scan = new Scanner(System.in);
		Encapsulation e = new Encapsulation();
		System.out.println(e.getName() + "\n" + e.getAge());
		System.out.println("Please type a new name, and age");
		String nameInput = scan.nextLine();
		e.setName(nameInput);
		int ageInput = scan.nextInt();
		e.setAge(ageInput);
		System.out.println(e.getName() + "\n" + e.getAge());
	}
}

public class Paradigms {
	
	static Scanner scan = new Scanner(System.in);
	static String userInput = " ";
	
	public static void main(String... args) {
		menu();
		menuSelect();
		scan.close();
	}
	
	public static void menu() {
		System.out.println("1. Inheritance");
		System.out.println("2. Abstraction");
		System.out.println("3. Encapsulation");	
	}
	
	public static void menuSelect() {
		userInput = scan.nextLine();
		
		switch(userInput) {
		case "1" :
//			System.out.println("");
			Inheritance();
			break;
		case "2" :
//			System.out.println("");
			Abstraction();
			break;
		case "3" :
//			System.out.println("");
			Encapsulation();
			break;
		default:
			System.out.println("It's brok");	
			break;
		}		
	}
	
	public static void Inheritance() {
		System.out.println("Creating Parent object");
		Parent p = new Parent();
		System.out.println("Creating Child object");
		Child c = new Child();
		System.out.println("Creating Grandchild object");
		Grandchild gc = new Grandchild();
		System.out.println("Family name is Kennedy");
		System.out.println("Child also inherits " + c.inherit());
		System.out.println("Grandchild also inherits " + c.familyName);
	}
	
	public static void Abstraction() {
		System.out.println("Lets ride family");
		new Car();
	}
	
	public static void Encapsulation() {
		System.out.println("Tight");
		new EncapsulationTwo();
	}
}

