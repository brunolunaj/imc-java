import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner pessoa = new Scanner(System.in);

        System.out.println("digite seu peso:");
        int peso = pessoa.nextInt();
        System.out.println("digite sua altura:");
        double altura = pessoa.nextDouble();
        Imc calculo = new Imc();
        double imc = calculo.calcularImc(peso, altura);
        System.out.println(imc);


    }
}

