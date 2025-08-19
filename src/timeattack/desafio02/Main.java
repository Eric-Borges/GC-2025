package timeattack.desafio02;
import java.util.Scanner;

public class Main {
    static void main() {

    }
}


public static int numero( String numero) {
    System.out.print("Qual o primeiro numero?");
    return numero;
}
public static int number( String number) {
    System.out.println("Qual o segundo numero?");
    return number();
}
public static String soma( String soma) {
    return soma(number+numero());
}

