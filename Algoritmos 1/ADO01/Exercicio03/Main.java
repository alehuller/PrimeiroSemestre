//Criar um programa que leia dois números L e R. O programa deve verificar a maior área entre um quadrado de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo".
//Nomes: Alejandro Huller Borges da Silva e Victor Hugo Enriquetto Marques da Cruz

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Lado de um quadrado: ");
    float L = leitor.nextFloat();
    System.out.print("Raio de um círculo: ");
    float R = leitor.nextFloat();
    float areaL = L * L;
    float areaR = 3.14f * (R * R);
    if (areaL > areaR) {
      System.out.print("A área do quadrado é maior que a do círculo.");
    }
    else {
      System.out.print("A área do círculo é maior que a área do quadrado.");
    }
  }
}