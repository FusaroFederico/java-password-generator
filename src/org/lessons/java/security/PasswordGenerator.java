package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// new instance scanner
		Scanner scanner = new Scanner(System.in);
		// user inputs
		System.out.println("inserisci il tuo nome:");
		String userFirstName = scanner.nextLine();
		System.out.println("inserisci il tuo cognome:");
		String userLastName = scanner.nextLine();
		System.out.println("inserisci il tuo colore preferito:");
		String userFavColour = scanner.nextLine();
		System.out.println("inserisci il giorno in cui sei nato:");
		byte userBirthDay = (byte) Integer.parseInt(scanner.nextLine());
		System.out.println("inserisci il mese in cui sei nato:");
		byte userBirthMonth = (byte) Integer.parseInt(scanner.nextLine());
		System.out.println("inserisci il tuo anno di nascita:");
		short userBirthYear = (short) Integer.parseInt(scanner.nextLine());
		}

}
