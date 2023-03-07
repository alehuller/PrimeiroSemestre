//O quadrado de um número natural N é dado pela soma dos N primeiros números ímpares consecutivos. Por exemplo, 1 2 = 1, 2 2 = 1 + 3, 3 2 = 1 + 3 + 5, 4 2 = 1 + 3 + 5 + 7. Criar uma função que receba por parâmetro um número inteiro positivo maior que zero, calcule e retorne o quadrado do número usando a soma de ímpares ao invés de produto.
//Componentes do grupo: Lucas da Silva Santos, Victor Hugo Enriquetto Marques da Cruz, Alejandro Huller.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite um número natural: ");
    double n = leitor.nextDouble();
    double quadradoNumero = raiz(n);
    System.out.print("Quadrado do número: " + quadradoNumero);
  }
  public static double raiz(double n) {
    double i;
    double quadrado = Math.pow(n, 2);
    for (i = 1; i <= quadrado; i++) {
    }
    double conta = i - 1;
    return conta;
  }
}
