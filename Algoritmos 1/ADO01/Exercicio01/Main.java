//Criar um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e imprimir o total a receber no final do mês.
//Nomes: Alejandro Huller Borges da Silva e Victor Hugo Enriquetto Marques da Cruz

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Seu nome: ");
    char nome = leitor.next().charAt(0);
    System.out.print("Seu salário fixo: ");
    float salario = leitor.nextFloat();
    System.out.print("Valor arrecadado em vendas: ");
    float vendas = leitor.nextFloat();
    float novoSalario = salario + (vendas * 0.15f);
    System.out.print("Valor a receber no fim do mês: " + novoSalario);
  }
}