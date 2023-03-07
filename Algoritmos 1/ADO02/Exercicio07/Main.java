//Criar uma função chamada somatoria que tem como parâmetro um número inteiro positivo N e retorna a soma de todos os números inteiros positivos menores ou iguais a N. Criar uma outra função chamada fatorial que tem como parâmetro um número inteiro positivo N e retorna o fatorial desse número. A função main do programa deve ler um número inteiro positivo N e apresentar a divisão do produto dos N primeiros números positivos pela soma dos N primeiros números positivos.
//Componentes do grupo: Lucas da Silva Santos, Victor Hugo Enriquetto Marques da Cruz, Alejandro Huller.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("N: ");
    int n = leitor.nextInt();
    int numero = somatoria(n);
    int numero1 = fatorial(n);
    System.out.println("Somatória: " + numero);
    System.out.println("Fatorial: " + numero1);
  }
  public static int somatoria(int n) {
    int soma = 0;
    for (int i = 1; i <= n; i++) {
      soma = soma + i; 
    }
    return soma;
  }
  public static int fatorial(int n) {
    int multiplicacao = 1;
    for (int i = 1; i <= n; i++) {
    multiplicacao = multiplicacao * i; }
    return multiplicacao;
  }
}