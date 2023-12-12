import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual sua altura?");
        double altura = input.nextDouble();

        System.out.println("Qual seu peso?");
        double peso = input.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC é: %.2f ", imc );
    }
}
