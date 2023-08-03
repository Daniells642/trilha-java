import java.util.Scanner;

public class ContaTerminal {


    private int numero = 1021;
    private String agencia = "067-8";
    private String nomeCliente = "MARIO ANDRADE";
    private Double saldo = 237.48;

    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("\n" + agencia);

        //Exibir as mensagens para nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
    }
}
