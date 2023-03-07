//Criar um programa que leia a idade de um nadador e apresente a sua categoria de acordo com a tabela:
//Nomes: Alejandro Huller Borges da Silva e Victor Hugo Enriquetto Marques da Cruz

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite sua idade: ");
    int idade = leitor.nextInt();
    if (idade >= 5 && idade <= 7) {
      System.out.print("Categoria: Infantil A.");
    }
    else if (idade >= 8 && idade <= 10) {
      System.out.print("Categoria: Infantil B.");
    }
    else if (idade >= 11 && idade <= 13) {
      System.out.print("Categoria: Juvenil A.");
    }
    else if (idade >= 14 && idade <= 17) {
      System.out.print("Categoria: Juvenil B.");
    }
    else if (idade >= 18) {
      System.out.print("Categoria: Adulto.");
    }
    else if (idade <= 4 && idade >= 0) {
      System.out.print("Você não está apto a participar.");
    }
    else {
      System.out.print("Erro! Como você tem idade negativa?");
    }
  }
}