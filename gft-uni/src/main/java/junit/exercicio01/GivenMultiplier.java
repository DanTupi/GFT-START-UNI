package junit.exercicio01;

import java.util.Scanner;

public class GivenMultiplier {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer number1, number2, number3;

        System.out.println("Por favor informe o multiplicando:");
        number1 = Integer.parseInt(input.next());

        System.out.println("Por favor informe o início do intervalo:");
        number2 = Integer.parseInt(input.next());

        System.out.println("Por favor informe o fim do intervalo:");
        number3 = Integer.parseInt(input.next());

        if (number1 > 3000 || number1 < 0) {
            System.out.println("O multiplicando não pode ser maior que 3000 nem negativo");
        } else if ((number3 < 0 || number2 < 0)) {
            System.out.println("Os números de intervalo não podem ser negativos");
        } else if ((number3 - number2) > 10) {
            System.out.println("O intervalo entre os números não pode ser maior que 10");
        } else {
            for (int i = number2; i <= number3; i++) {
                System.out.println(number1 + " X " + i + " = " + number1 * i);
            }
        }
    }
}
