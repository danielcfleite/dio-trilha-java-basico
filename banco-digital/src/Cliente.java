import java.util.ArrayList;
import java.util.List;

public class Cliente {
   private String nome; 
   private String documento;
   private List<Conta> contas; 


   Cliente(String nome, String documento) {
    this.nome = nome;
    this.documento = documento; 
    this.contas = new ArrayList<>();
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public void adicionarConta(Conta conta) {
    contas.add(conta);
   }

   public String getDocumento() {
       return documento;
   }

   public void removerConta(Conta conta) {
    
    contas.removeIf(c -> c.getNumero() == conta.getNumero());
 
   }

   public void listarContas() {
    String titulo = String.format("\n=== Contas de %s =====\n", this.getNome());
    System.out.println(titulo);
    contas.forEach(c -> System.out.println(String.format("Agência:%s\nNúmero: %d\nSaldo: %.2f\n", c.agencia, c.numero, c.saldo)));
   }

}
