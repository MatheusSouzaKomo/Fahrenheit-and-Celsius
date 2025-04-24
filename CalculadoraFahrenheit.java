import java.util.Scanner;

public class CalculadoraFahrenheit {
    public static void main(String[] args) {
        //Declaração de Variáveis
        double cel, fah, option; //cel - temperatura em graus celsius; fah - temperatura em graus fahrenheit;

        //Criação e instância do objet0 de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Conversor --\n");
        System.out.println("1. Celsius para Fahrenheit.");
        System.out.println("2. Fahrenheit para Celsius");

        System.out.println("Opção: ");
        option = entrada.nextInt();

        //Entradas de Celsius para Fahrenheit.
        if (option == 1){
        System.out.print("Informe a temperatura em °C: ");
        cel = entrada.nextDouble();
        
        //Processamento Celsius para Fahrenheit
        fah = cel * 9 / 5 + 32;

        //Saída Celsius para Fahrenheit
        System.out.println("\n" + cel + "°C = " + fah + "°F\n");
        }

        //Entradas de Fahrenheit para Celsius
        if (option == 2){
            System.out.print("Informe a temperatura em °F: ");
            fah = entrada.nextDouble();

        //Processamento Fahrenheit para Celsius
        cel = (fah - 32) * 5 / 9;

        //Saída Fahrenheit para Celsius
        System.out.println("\n" + fah + "°F= " + cel + "°C\n");
        }
    }
}