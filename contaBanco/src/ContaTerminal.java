import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");        
        int numero = scanner.nextInt();
        System.out.print("Por favor, digite a agência: ");
        String agencia = scanner.next();
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Por favor, digite seu saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " reais já está disponível para saque.");

    };

        //Exibir as mensagens para nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
    }
