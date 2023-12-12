import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número que representa a forma geométrica a ter área calculada:");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Triângulo");
        System.out.println("3 - Círculo");
        System.out.println("4 - Trapézio");

        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                areaRetangulo();
                break;
            case 2:
                areaTriangulo();
                break;
            case 3:
                areaCirculo();
                break;
            case 4:
                areaTrapezio();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

    }

    public static void areaTriangulo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor da base do triângulo: ");
        double baseTriangulo = input.nextDouble();
        System.out.println("Insira o valor da altura do triângulo: ");
        double alturaTriangulo = input.nextDouble();

        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.printf("A área do triângulo é %.2f cm^2", areaTriangulo);
    }

    public static void areaRetangulo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor da base: ");
        double baseRetangulo = input.nextDouble();
        System.out.println("Insira o valor da altura: ");
        double alturaRetangulo = input.nextDouble();

        double areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.printf("A área do retângulo é %.2f cm^2", areaRetangulo);
    }

    public static void areaCirculo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o raio do círculo: ");
        double raioCirculo = input.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
        System.out.printf("A área do círculo é %.2f cm^2", areaCirculo);
    }

    public static void areaTrapezio() {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor da base maior do trapézio: ");
        double baseMaiorDoTrapezio = input.nextDouble();
        System.out.println("Insira o valor da base menor do trapézio: ");
        double baseMenordoTrapezio = input.nextDouble();
        System.out.println("Insira o valor da altura do trapézio: ");
        double alturaTrapezio = input.nextDouble();

        double areaTrapezio = ((baseMenordoTrapezio + baseMaiorDoTrapezio) * alturaTrapezio) / 2;
        System.out.printf("A área do trapézio é %.2f cm^2", areaTrapezio);
    }
}
