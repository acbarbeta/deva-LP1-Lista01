import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Cabeçalho
        System.out.println("********************");
        System.out.println("BEM-VINDO À MISSÃO DA NASA");
        System.out.println("********************");
        System.out.println();
        System.out.println("Vamos trabalhar em 3 módulos, por favor, insira os dados solicitados em cada um");
        System.out.println();

        // MÓDULO 1 - MÁX 3 BYTES
        System.out.println("********************");
        System.out.println("MÓDULO 1 - CONTROLE DE TEMPO X FUNCIONÁRIOS");
        System.out.println("********************");
        System.out.println();

        System.out.println("Insira o ano atual da missão: ");
        short anoAtualDaMissao = input.nextShort(); // 2 bytes
        System.out.println("Insira a quantidade de funcionários envolvidos na missão: ");
        byte quantidadeDeFuncionarios = input.nextByte(); // 1 byte
        System.out.println();

        // MÓDULO 2 - MÁX 6 BYTES
        System.out.println("********************");
        System.out.println("MÓDULO 2 - CONTROLE DE DISTÂNCIA X VELOCIDADE");
        System.out.println("********************");
        System.out.println();

        System.out.println("Insira a que distância que o satélite ficará da Terra: ");
        int distanciaEntreSateliteETerra = input.nextInt(); // 4 bytes
        System.out.println("Insira a velocidade máxima: ");
        short velocidadeMaxima = input.nextShort(); // 2 bytes
        System.out.println();

        // MÓDULO 3 - MÁX 17 BYTES
        System.out.println("********************");
        System.out.println("MÓDULO 3 - STATUS DA MISSÃO");
        System.out.println("********************");
        System.out.println();

        System.out.println("A missão já iniciou? Digite 1 para SIM e 0 para NÃO");
        byte statusMissao = input.nextByte(); // 1 byte
        System.out.println("Insira a distância a ser percorrida durante a missão (em km): ");
        double distanciaMissao = input.nextDouble(); // 8 bytes
        System.out.println("Insira a calibragem das antenas: ");
        double calibragemAntenas = input.nextDouble(); // 8 bytes
        System.out.println();

        // SAÍDA
        System.out.println("********************");
        System.out.println("DADOS DA MISSÃO");
        System.out.println("********************");
        System.out.println();

        if (statusMissao == 1) {
            System.out.println("MISSÃO INICIADA");
        } else if (statusMissao == 0) {
            System.out.println("MISSÃO NÃO INICIADA");
        } else {
            System.out.println("Não foi possível obter o status da missão");
        }

        System.out.println("Ano da missão: " + anoAtualDaMissao);
        System.out.println("Número de funcionários: " + quantidadeDeFuncionarios);
        System.out.println("Distância do satélite: " + distanciaEntreSateliteETerra + " km");
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Distância a ser percorrida: " + distanciaMissao + " km");
        System.out.println("Calibragem das antenas: " + calibragemAntenas);

    }
}
