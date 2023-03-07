//Criar um programa que leia dois valores inteiro X e Z, calcula e apresente na tela XZ (sem utilizar funções ou operadores de potência prontos).
//Nomes: Alejandro Huller Borges da Silva e Victor Hugo Enriquetto Marques da Cruz

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite o valor X: ");
    float x = leitor.nextFloat();
    System.out.print("Digite o valor Z: ");
    float z = leitor.nextFloat();
    float result;
    if (z == 0) {
      result = 1;
    } else if (z == 1) {
       result = x;
    } else {
       result = x;
      for (int i = 2; i <= z; i++) { 
        result = result * x;
      }
    }
   System.out.print("O valor da potência é: " + result);
  }
}