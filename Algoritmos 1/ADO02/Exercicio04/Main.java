//Criar uma função que receba dois números inteiros: um valor A e um valor N. A função deve retornar a soma dos N números a partir de A (inclusive). Se N for negativo ou zero, a função deve retornar -1. A função main deve ler dois valores inteiros (para A e para N), chamar a função criada e apresentar na tela o dado retornado pela função. Exemplo de cálculo da função: se A for 3 e N for 2, o retorno da função deve ser 7, pois é a soma de 3 + 4.
//Componentes do grupo: Lucas da Silva Santos, Victor Hugo Enriquetto Marques da Cruz, Alejandro Huller.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Valor A: ");
    int A = leitor.nextInt();
    System.out.print("Valor N: ");
    int N = leitor.nextInt();
    int calculo = valores(A, N);
    if (N > 0) {
      System.out.print("Soma do A e dos N: " + calculo);
    }
    else {
      System.out.print("Como o N é negativo, o valor é: " + calculo);
    }
  }
  public static int valores(int A, int N) {
    int retorno;
    if (N > 0) {
      return retorno = N + N + A;
    }
    else {
      return retorno = -1;
    }
  }
}