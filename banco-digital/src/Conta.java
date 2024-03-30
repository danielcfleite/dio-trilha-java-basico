public abstract class Conta implements Iconta{
    protected int agencia; 
    protected int numero;
    protected double saldo;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente; 
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo-=valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

   public int getAgencia() {
       return agencia;
   }

   public int getNumero() {
       return numero;
   }

   public double getSaldo() {
       return saldo;
   }

   public void imprimirDadosDaConta(){
    System.out.println(String.format("Titular:%s\nAgência: %d\nNúmero da Conta: %d\nSaldo: %.2f", this.cliente.getNome(),  this.agencia, this.numero, this.saldo));
   }

}
