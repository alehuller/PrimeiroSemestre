//Em uma eleição presidencial existem quatro candidatos. Os votos são informados por código. Os dados utilizados para a apuração obedecem à seguinte codificação:
//1, 2, 3, 4 = voto para os respectivos candidatos;
//5 = voto nulo;
//6 = voto em branco.
//Criar um programa que calcule e apresente:
//o total de votos para cada candidato e seu porcentual sobre o total;
//o total de votos nulos e seu porcentual sobre o total;
//o total de votos em branco e seu porcentual sobre o total.
//Como finalizador do conjunto de votos, tem-se o valor 0.
//Nomes: Alejandro Huller Borges da Silva ou Victor Hugo Enriquetto Marques da Cruz

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int somaPrimeiro = 0;
    int somaSegundo = 0;
    int somaTerceiro = 0;
    int somaQuarto = 0;
    int somaNulo = 0;
    int somaBranco = 0;
    System.out.print("Digite em quem vai o seu voto: ");
    int voto = leitor.nextInt();
    while (voto !=0) {
      if (voto == 1) {
        somaPrimeiro = somaPrimeiro + voto;
        } 
      else if (voto == 2) {
        somaSegundo = somaSegundo + voto - 1;
      }
      else if (voto == 3) {
        somaTerceiro = somaTerceiro + voto - 2;
      }
      else if (voto == 4) {
        somaQuarto = somaQuarto + voto - 3;
      }
      else if (voto == 5) {
        somaNulo = somaNulo + voto - 4;
      }
      else if (voto == 6) {
        somaBranco = somaBranco + voto - 5;
      }
      else {
        System.out.print("Candidato inválido.");
      }
      System.out.print("Digite em quem vai o seu voto: ");
      voto = leitor.nextInt();
    }
    float somaTotal = somaPrimeiro + somaSegundo + somaTerceiro + somaQuarto + somaNulo + somaBranco;
    float percentual1 = (somaPrimeiro / somaTotal) * 100;
    float percentual2 = (somaSegundo / somaTotal) * 100;
    float percentual3 = (somaTerceiro / somaTotal) * 100;
    float percentual4 = (somaQuarto / somaTotal) * 100;
    float percentualNulo = (somaNulo / somaTotal) * 100;
    float percentualBranco = (somaBranco / somaTotal) * 100;
    System.out.println("Total de votos do candidato 1: " + somaPrimeiro);
    System.out.println("Total de votos do candidato 2: " + somaSegundo);
    System.out.println("Total de votos do candidato 3: " + somaTerceiro);
    System.out.println("Total de votos do candidato 4: " + somaQuarto);
    System.out.println("Total de votos nulos: " + somaNulo);
    System.out.println("Total de votos em branco: " + somaBranco);
    System.out.println("Percentual de votos do candidato 1 sobre o total de votos: " + percentual1);
    System.out.println("Percentual de votos do candidato 2 sobre o total de votos: " + percentual2);
    System.out.println("Percentual de votos do candidato 3 sobre o total de votos: " + percentual3);
    System.out.println("Percentual de votos do candidato 4 sobre o total de votos: " + percentual4);
    System.out.println("Percentual de votos nulos sobre o total de votos: " + percentualNulo);
    System.out.println("Percentual de votos em branco sobre o total de votos: " + percentualBranco);  
  }
}