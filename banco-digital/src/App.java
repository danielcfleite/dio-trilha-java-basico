public class App {
    public static void main(String[] args) {
            Cliente cliente = new Cliente("Daniel", "475.162.789.12");
            Conta cc = new ContaCorrente(cliente);
            Conta cp = new ContaPoupanca(cliente);
            cliente.adicionarConta(cc);
            cliente.adicionarConta(cp);

            cp.depositar(200);
            cc.depositar(500);

            cliente.listarContas();
    }
}
