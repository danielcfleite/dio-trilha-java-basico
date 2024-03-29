package navegador;

public class Aba {
    
    private int id; 
    private String url;
    private boolean isAtiva; 

    public void ativar(){
        isAtiva = true; 
    }    

    public void desativar(){
        isAtiva = false; 
    }

    public int getId(){
        return id;
    }

    public String getUrl(){
        return url;
    }
    
    public void refresh() {

    }
}
