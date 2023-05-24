import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true) {
            System.out.println("Digite o primeiro número (ou 'Q' para sair):");
            if (scanner.hasNextDouble()) {
                double numeroUm = scanner.nextDouble();
                calculadora.setNumeroUm(numeroUm);

                System.out.println("Digite o segundo número:");
                double numeroDois = scanner.nextDouble();
                calculadora.setNumeroDois(numeroDois);
                scanner.nextLine(); // Limpar o buffer

                System.out.println("Escolha a operação:");
                System.out.println("1 - Adição");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Potência");
                System.out.println("6 - Raiz quadrada");

                int operacao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (operacao) {
                    case 1:
                        double soma = calculadora.adicao();
                        System.out.println("Resultado: " + soma);
                        break;
                    case 2:
                        double subtracao = calculadora.subtracao();
                        System.out.println("Resultado: " + subtracao);
                        break;
                    case 3:
                        double multiplicacao = calculadora.multiplicacao();
                        System.out.println("Resultado: " + multiplicacao);
                        break;
                    case 4:
                        if (numeroDois == 0) {
                            System.out.println("Impossível realizar uma divisão por zero.");
                        } else {
                            double divisao = calculadora.divisao();
                            System.out.println("Resultado: " + divisao);
                        }
                        break;
                    case 5:
                        double potencia = calculadora.potencia();
                        System.out.println("Resultado: " + potencia);
                        break;
                    case 6:
                        if (numeroUm < 0) {
                            System.out.println("Não existe raiz de número negativo.");
                        } else {
                            double raizQuadrada = calculadora.raizQuadrada();
                            System.out.println("Resultado: " + raizQuadrada);
                        }
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } else {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("Q")) {
                    System.out.println("Encerrando o programa...");
                    break;
                } else {
                    System.out.println("Entrada inválida. Digite um número válido.");
                }
            }
        }

        scanner.close();
    }
}
