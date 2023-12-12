import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = input.nextLine();

        System.out.println("Qual seu salário?");
        double salario = input.nextDouble();
        input.nextLine();

        System.out.println("Qual sua idade?");
        int idade = input.nextInt();
        input.nextLine();

        System.out.println("Qual sua altura em metros?");
        double altura = input.nextDouble();
        input.nextLine();

        System.out.printf("Nome: %s%n Salário : R$%.2f%n Idade: %d ano(s)%n Altura: %.2f metro(s)", nome, salario, idade, altura);
    }
}
