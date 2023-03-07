// Criar uma função que receba como parâmetro o valor do raio de uma esfera, calcule e retorne o volume desta esfera. A função main do programa deve ler um raio, chamar a função criada e apresentar na tela o dado retornado pela função. Fórmula: V = 4 3 πR3.
//Componentes do grupo: Lucas da Silva Santos, Victor Hugo Enriquetto Marques da Cruz, Alejandro Huller.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Insira o raio: ");
    double r = leitor.nextInt();
    double pp = 3.14;
    double volume = resultado(r, pp);
    System.out.print("Volume :" + volume);
  }
  public static double resultado(double r, double pp) {
    double vv;
    return vv = (4/3 * (pp*Math.pow(r,3)));
  }
}