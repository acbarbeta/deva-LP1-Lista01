import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada dos dados
        System.out.println("Qual seu nome?");
        String nome = input.nextLine();

        System.out.println("Qual sua idade?");
        int idade = input.nextInt();
        input.nextLine();

        System.out.println("Qual sua profissão?");
        String profissao = input.nextLine();

        // Saída de dados
        System.out.print("Nome: " + nome +"\n");
        System.out.println("Idade: " + idade);
        System.out.printf("Profissão: %s", profissao);

    }
}