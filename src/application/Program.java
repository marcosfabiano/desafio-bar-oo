package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill x;
		x = new Bill();

		System.out.print("Sexo: ");
		x.gender = sc.next().charAt(0);

		while (x.gender != 'F' && x.gender != 'M') {
			System.out.print("Valor invalido! Favor digitar F ou M: ");
			x.gender = sc.next().charAt(0);
		}

		System.out.print("Quantidade de cervejas: ");
		x.beer = sc.nextInt();

		System.out.print("Quantidade de refrigerantes: ");
		x.softDrink = sc.nextInt();

		System.out.print("Quantidade de espetinhos: ");
		x.barbecue = sc.nextInt();

		System.out.println();
		System.out.println("RELATÓRIO");
		System.out.printf("Consumo = R$ %.2f%n", x.feeding());
		if (x.cover() > 0) {
			System.out.printf("Couvert = R$ %.2f%n", x.cover());
		} else {
			System.out.println("Isento de Couvert");
		}
		System.out.printf("Ingresso = R$ %.2f%n", x.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", x.total());

		sc.close();

	}

}
