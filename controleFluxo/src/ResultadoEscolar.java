import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        int nota = scanner.nextInt();

        if (nota >= 7 )
            System.out.println("Aprovado!");

        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de recuperação.");

         else
             System.out.println("Reprovado!");
    }
}
