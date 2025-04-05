package basithesapmakinesi;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class BasitHesapMakinesi {

	public static void main(String[] args) {
//Java ile girilen 2 sayı ile kullanıcının seçtiği 4 işlemleri yapabilen bir hesap makinesi yapınız.

		Scanner scanner = new Scanner(System.in);
		System.out.println("İlk sayıyı giriniz: ");
		double num1 = scanner.nextDouble();
		System.out.println("İkinci sayıyı giriniz: ");
		double num2 = scanner.nextDouble();

		double addition = num1 + num2;
		double subtraction = num1 - num2;
		double multiplication = num1 * num2;
		double division = num1 / num2;

		System.out.println("işlem seçiniz: ");
		System.out.println("1- toplama ");
		System.out.println("2- çıkarma ");
		System.out.println("3- çarpma ");
		System.out.println("4- bölme ");
		int select = scanner.nextInt();

		/*
		 * if (select == 1) { System.out.println("sonuç: " + addition); } else if
		 * (select ==2) { System.out.println("sonuç: " + subtraction); } else if (select
		 * ==3) { System.out.println("sonuç: " + multiplication); } else if (select== 4)
		 * { System.out.println("sonuç: " + division); }
		 */
		switch (select) {
		case 1:
			System.out.println("sonuç: " + addition);

			break;

		case 2:
			System.out.println("sonuç: " + subtraction);
			break;
		case 3:
			System.out.println("sonuç: " + multiplication);
			break;
		case 4:
			System.out.println("sonuç: " + division);
			break;
		}

	}

}
