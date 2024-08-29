import java.util.Scanner;

public class ConversorMoeda {

    
    private static final double TAXA_CONVERSAO_DOLAR_PARA_REAL = 5.20;
    private static final double TAXA_CONVERSAO_REAL_PARA_DOLAR = 1 / TAXA_CONVERSAO_DOLAR_PARA_REAL;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão:");
        System.out.println("1 - Dólar para Real");
        System.out.println("2 - Real para Dólar");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o valor em dólares:");
                double valorDolar = scanner.nextDouble();
                double valorReal = converterDolarParaReal(valorDolar);
                System.out.printf("Valor em reais: R$ %.2f%n", valorReal);
                break;

            case 2:
                System.out.println("Digite o valor em reais:");
                double valorRealParaDolar = scanner.nextDouble();
                double valorDolarConvertido = converterRealParaDolar(valorRealParaDolar);
                System.out.printf("Valor em dólares: $ %.2f%n", valorDolarConvertido);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }

    public static double converterDolarParaReal(double valorDolar) {
        return valorDolar * TAXA_CONVERSAO_DOLAR_PARA_REAL;
    }

    public static double converterRealParaDolar(double valorReal) {
        return valorReal * TAXA_CONVERSAO_REAL_PARA_DOLAR;   
        
    }
}
