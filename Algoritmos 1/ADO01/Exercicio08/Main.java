//Um cinema possui capacidade de 20 lugares e está sempre com ocupação total. Certo dia, cada espectador respondeu a um questionário, na qual constava:
//sua idade;
//sua opinião em relação ao filme, segundo as seguintes notas:
//Nota Significado
//A Ótimo
//B Bom
//C Regular
//D Ruim
//E Péssimo
//Criar um programa que, lendo estes dados, calcule e apresente:
//a quantidade de respostas Ótimo;
//a média de idade das pessoas que responderam Ruim;
//a porcentagem de respostas Péssimo e a maior idade que utilizou esta opção;
//a diferença de idade entre a maior idade que respondeu Ótimo e a maior idade que respondeu Ruim.
//Nomes: Alejandro Huller Borges da Silva e Victor Hugo Enriquetto Marques da Cruz
//Professor, esse exercicio acabamos ficando com dúvida e não deu certo os resultados, porém fizemos a linha de lógica. Tentamos ao máximo fazer o exercício


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int condicao = 1;
    float mediaD = 0;
    float i = 0;
    float numPessoasA = 0;
    int idade = 0;
    //"i" representa o número de pessoas que votaram em (D).
    float v = 0;
    //"v" é o número de pessoas que votaram em "péssimo (E)".
    float maiorIdadeE = 0;
    float maiorIdadeA = 0;
    float maiorIdadeD = 0;
    float porcentagem = 0;
    //porcentagem de respostas com "péssimo".
    float diferenca;
    float somaIdade = 0;
    char nota;
    while (condicao <= 20) {
      System.out.print("Digite sua idade: ");
      idade = leitor.nextInt();
      System.out.println("Nota:");
      System.out.println("A = Ótimo");
      System.out.println("B = Bom");
      System.out.println("C = Regular");
      System.out.println("D = Ruim");
      System.out.println("E = Péssimo");
      System.out.print("Digite a sua nota em relação ao filme: ");
      nota = leitor.next().charAt(0);
      if (nota == 'A') {
        numPessoasA = numPessoasA + 1;
        if (idade > maiorIdadeA) {
          maiorIdadeA = idade;
        }
      } else if (nota == 'D') {
        i = i + 1;
        somaIdade = somaIdade + idade;
        if (idade > maiorIdadeD) {
          maiorIdadeD = idade;
        }
      } else if (nota == 'E') {
        v++;
        if (idade > maiorIdadeE) {
          maiorIdadeE = idade;
        }
      }
      condicao++;
    }
    if (maiorIdadeA > maiorIdadeD) {
      diferenca = maiorIdadeA - maiorIdadeD;
    }
    else {
      diferenca = maiorIdadeD - maiorIdadeA;
    } 
    mediaD = somaIdade / i;
    porcentagem = (v / 20) * 100;
    System.out.println("Quantidade de votos com nota ótimo (A): " + numPessoasA);
    System.out.println("Média da idade das pessoas que votaram em ruim (D): " + mediaD + "%");
    System.out.println("Porcentagem de respostas em péssimo (E): " + porcentagem + "%");
    System.out.println("Maior idade que votou em péssimo (E): " + maiorIdadeE);
    System.out.println("Diferença de idade entre a pessoa com maior idade que respondeu ótimo e a pessoa com maior idade que respondeu ruim: " + diferenca);
  }
}