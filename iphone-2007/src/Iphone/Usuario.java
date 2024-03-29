package Iphone;
import java.util.HashMap;
import java.util.Map;

public class Usuario {
    
    private String appleId;
    private String nome;
    private String senha;
    private String numeroDocumento;
    @SuppressWarnings("unused")
    private boolean isLogado; 

    public Usuario(String nome, String senha, String numeroDocumento) {
        this.nome = nome; 
        this.senha = senha;
        this.numeroDocumento = numeroDocumento;
        this.appleId = String.valueOf(Math.random());
    }

    public String getNome(){
        return nome; 
    }

    public String getSenha() {
        return senha;
    }

    public String getAppleId() {
        return appleId;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void logar(String nome, String senha) {
        Map<String, String> mockupAppleDB = new HashMap<>();
        mockupAppleDB.put("usuarioValido", "senhaValida");
        mockupAppleDB.put("outroUsuario", "outraSenha");
        
        if (mockupAppleDB.containsKey(nome)) {
            String senhaCorrespondente = mockupAppleDB.get(nome);
            if (senhaCorrespondente.equals(senha)) {
                System.out.println("Credenciais válidas.");
                this.isLogado = true;
                
            } else {
                System.out.println("Senha inválida.");
            }
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    public void deslogar(){
        this.isLogado = false;  
    }

  
}