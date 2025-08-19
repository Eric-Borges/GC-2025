package timeattack.desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        dadosFinais();
    }
    static Scanner leitor=new Scanner(System.in);

    public static String nome () {
        System.out.println("Qual seu nome?");
        String nomeDigitado=leitor.next();
        return nomeDigitado;
    }
    public static String sobrenome () {
        System.out.println("Qual seu sobrenome?");
       String sobrenomeDigitado = leitor.next();
        return sobrenomeDigitado;
    }
    public static int idade () {
        System.out.println("Qual sua idade?");
        int idadeDigitada = leitor.nextInt();
        return idadeDigitada;
    }
    public static String fraseDigitada () {
        System.out.println("Digite uma frase favorita:");
        String fraseDigitada = leitor.nextLine();
        return fraseDigitada;
    }
    public static void dadosFinais () {
        System.out.printf(nome(), sobrenome(), idade(), fraseDigitada());
    }
}
