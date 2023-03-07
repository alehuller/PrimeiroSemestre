//Criar um programa que leia 3 números reais A, B e C e ordene-os em ordem crescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
//se A ≥ B + C, apresente a mensagem: NAO FORMA TRIANGULO
//se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
//se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
//se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
//se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
//se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
//Nomes: Alejandro Huller Borges da Silva e Victor Hugo Enriquetto Marques da Cruz

import java.util.Scanner;
//Professor, tivemos alguns problemas e dúvidas com essa questão, então em alguns lugares, onde poderíamos ter usados operadores para facilitar o processo, acabamos indo por um caminho "mais difícil".
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite o lado A: ");
    float A = leitor.nextFloat();
    System.out.print("Digite o lado B: ");
    float B = leitor.nextFloat();
    System.out.print("Digite o lado C: ");
    float C = leitor.nextFloat();
    float troca;
    float ladoA, ladoB, ladoC;
    //Aqui é pra deixar A, B e C em ordem crescente, mas ao mesmo tempo que o exercício pede para deixar em ordem crescente, onde na teoria, o A teria o menor valor, o exercício pede para o A ter o maior valor, então o enunciado não tem muito sentido. Em vez disso, atribuímos o maior valor na variável "ladoA", e a variável "A" ficou com o menor valor, para fazer mais sentido, mediante o solicitado pelo enunciado.
    if (A > B) {
     troca = B;
     B = A;
     A = troca;
    }
    if (A > C) {
     troca = C;
     C = A;
     A = troca;
    }
    if (B > C) {
     troca = C;
     C = B;
     B = troca;
    }
    //Não colocamos para imprimir os valores de A, B e C, respectivamente, em ordem crescente, pois o enunciado não pediu para imprimir, apenas para organizar.
    ladoA = C;
    ladoB = B;
    ladoC = A;
    // Aqui, em vez de usarmos potência, colocamos as varíaveis multiplicadas por elas mesmas para representar a segunda potência, pois não estava dando para usar o "^2".
    if (ladoA >= ladoB + ladoC) {
      System.out.print("Não forma um triângulo.");
    }
    else if ((ladoA * ladoA) == (ladoB * ladoB) + (ladoC * ladoC)) {
      System.out.print("Triângulo retângulo.");
    }
    else if ((ladoA * ladoA) > (ladoB * ladoB) + (ladoC * ladoC)) {
      System.out.print("Triângulo obtsângulo.");
    }
    else if ((ladoA * ladoA) < (ladoB * ladoB) + (ladoC * ladoC)) {
      System.out.print("Triângulo acutângulo.");
    }
    // Aqui, queríamos ter deixado ladoA == ladoB == ladoC, mas também não deu certo.
    else if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
      System.out.print("Triângulo equilátero.");
    }
    else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
      System.out.print("Triângulo isósceles.");
    }
  }
}