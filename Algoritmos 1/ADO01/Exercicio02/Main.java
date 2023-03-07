//Criar um programa que leia três números inteiros e apresente na tela o maior deles.
//Nomes: Alejandro Huller Borges da Silva e Victor Hugo Enriquetto Marques da Cruz

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    float num1 = leitor.nextFloat();
    System.out.print("Digite o segundo número: ");
    float num2 = leitor.nextFloat();
    System.out.print("Digite o terceiro número: ");
    float num3 = leitor.nextFloat();
    if (num1 > num2 && num1 > num3) {
      System.out.print("O maior número é: " + num1);
    }  
    else if (num2 > num1 && num2 > num3) {
      System.out.print("O maior número é: " + num2);
    }
    else if (num3 > num1 && num3 > num2) {
      System.out.print("O maior número é: " + num3);
    }
    else {
      System.out.print("Erro! Os valores são iguais.");
    }
  }
}