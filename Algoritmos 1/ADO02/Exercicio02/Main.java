//**Criar uma função que receba como parâmetros a altura e o sexo de uma pessoa (M ou F), calcule e retorne o seu peso ideal. A função main do programa deve ler a altura e sexo da pessoa, chamar a função criada e apresentar na tela o dado retornado pela função. A fórmula para o cálculo do peso ideal é: • para homens: (72.7 * altura) - 58 • para mulheres: (62.1 * altura) - 44.7
//Componentes do grupo: Lucas da Silva Santos, Victor Hugo Enriquetto Marques da Cruz, Alejandro Huller.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Altura: ");
    float altura = leitor.nextFloat();
    System.out.print("Sexo (M ou F): ");
    char sexo = leitor.next().charAt(0);
    float pesoIdeal = ideal(sexo, altura);
    System.out.print("Peso ideal: " + pesoIdeal);
  }
  public static float ideal (char sexo, float altura) {
    float peso = 0;
    if (sexo == 'M' || sexo == 'm') {
      return peso = ((72.2f * altura) - 58.0f);
    }
    else {
      return peso = ((62.1f * altura) - 44.7f);
    }
  }
}
