import java.util.Scanner;

public class CalculadoraFahrenheit {
    public static void main(String[] args) {
        //Declaração de Variáveis
        double cel, fah; //cel - temperatura em graus celsius; fah - temperatura em graus fahrenheit;

        //Criação e instância do objet0 de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Conversor --\n");

        //Entradas
        System.out.print("Informe a temperatura em °C: ");
        cel = entrada.nextDouble();

        //Processamento
        fah = cel * 9 / 5 + 32;

        //Saída
        System.out.println("\n" + cel + "°C = " + fah + "°F\n");
    }
}