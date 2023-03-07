// Criar uma função que receba como parâmetro três números reais a, b, c e retorne a maior raiz da equação de 2° grau: ax2 + bx + c. Nesta questão, você deve utilizar a fórmula de Báskara. Se não houver raízes reais, a função deve retornar -1.
//Componentes do grupo: Lucas da Silva Santos, Victor Hugo Enriquetto Marques da Cruz, Alejandro Huller.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Informe o valor de a: ");
    double a = leitor.nextDouble();
    System.out.print("Informe o valor de b: ");
    double b = leitor.nextDouble();
    System.out.print("Informe o valor de c: ");
    double c = leitor.nextDouble();
    double x1 = ab(a, b, c);
    double x2 = abc(a, b, c);
    double calculo = bhaskara(x1, x2);
    System.out.print("Resultado: " + calculo);
  }
  public static double ab(double a, double b, double c) {
    double x1;
    double conta = Math.pow(b, 2);
    return x1 = (- b + Math.sqrt(conta - 4 * a * c)) / (2 * a);
  }
  public static double abc(double a, double b, double c){
    double x2;
    double conta = Math.pow(b, 2);
    return x2 = (- b - Math.sqrt(conta - 4 * a * c)) / (2 * a);
  }
  public static double bhaskara(double x1, double x2) {
   double retorno;
   if (x1 < 0 && x2 < 0) {
     return retorno = -1; 
    }
   else if ( x1 > x2) {
     return retorno = x1; 
    }
   else {
     return retorno = x2; 
    }
  }
}
