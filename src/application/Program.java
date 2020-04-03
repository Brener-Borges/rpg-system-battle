package application;

import java.util.Scanner;

import entities.Hero;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hero's name: ");
		Hero hero = new Hero(sc.nextLine());
		System.out.println(hero);
		sc.close();
	}

}
