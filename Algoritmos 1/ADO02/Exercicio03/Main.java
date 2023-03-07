//** Criar uma função que receba como parâmetro o salário bruto de um funcionário, calcule e retorne o imposto de renda a ser pago a partir do salário do funcionário. Se o salário for menor que R$ 1.257,12 está isento do imposto. Se o salário for entre R$ 1.257,12 e R$ 2.510,00 (inclusive), a alíquota do imposto é 17%. Se o salário for superior a R$ 2.510,00, a alíquota do imposto é 28%. Criar uma outra função que receba o salário bruto do funcionário e o valor do imposto de renda a ser pago e retorne o salário líquido do funcionário. A função main do programa deve ler o salário bruto do funcionário e apresentar o valor do imposto a ser pago e o salário líquido dofuncionário.
//Componentes do grupo: Lucas da Silva Santos, Victor Hugo Enriquetto Marques da Cruz, Alejandro Huller.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Informe seu salário bruto: ");
    float slrBrt = leitor.nextFloat();
    float elseIf = conta(slrBrt);
    float slrLiq = calculo(slrBrt, elseIf);
    System.out.println("Valor do imposto a ser pago: " + elseIf);
    System.out.println("Salario liquido: " + slrLiq);
  }
  public static float conta(float slrBrt) {
    float impost;
    if (slrBrt < 1257.12) {
      return impost = 0;
    }
    else if (slrBrt > 1257.12 && slrBrt <= 2510.00) {
      return impost = (slrBrt * 17) / 100;
    }
    else {
      return impost = (slrBrt * 28) / 100;
    }
  }
  public static float calculo(float slBrt, float imposto) {
    float liquido;
    return liquido = slBrt + imposto;
  }
}