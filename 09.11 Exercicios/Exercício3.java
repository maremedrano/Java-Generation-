package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	int idade;
		
		System.out.println("Sua idade: ");
		idade = leia. nextInt();
		
		if(idade >= 10 && idade <=14) {
			System.out.println("Categoria infantil.");
		}
		
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria juvenil.");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria adulto.");
		}
		else {
			System.out.println("N�o se enquadra em nenhuma categoria.");
		}
	}

}
