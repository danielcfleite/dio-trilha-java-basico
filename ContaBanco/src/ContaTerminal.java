import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, insira o número da conta");
        conta.numero = scanner.nextInt();
        System.out.println("Por favor, insira o número da agência");
        conta.agencia = scanner.next();
        System.out.println("Por favor, insira seu nome");
        scanner.nextLine();
        conta.nome = scanner.nextLine();
        System.out.println("Por favor, insira seu seu saldo");
        String inputEntrada = scanner.next();
        conta.saldo = Double.parseDouble(inputEntrada.replace(",","."));
        scanner.close();
        String mensagem = "Olá " + conta.nome + 
        ", obrigado por criar uma conta em nosso banco, sua agência é "
         + conta.agencia + ", conta " + conta.numero + 
         " e seu saldo " + conta.saldo + " já está disponível para saque.";

        System.out.println(mensagem);

    }
}
