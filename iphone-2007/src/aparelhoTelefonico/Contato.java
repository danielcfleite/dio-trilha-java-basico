package aparelhoTelefonico;

public class Contato {
    
    private String id; 
    private String nome; 
    private String numero; 

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public Contato(String nome, String numero) {
        this.nome = nome; 
        this.numero = numero; 
        this.id = String.valueOf(Math.random());
    }

}
