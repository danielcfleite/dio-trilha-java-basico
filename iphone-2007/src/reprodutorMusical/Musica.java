package reprodutorMusical;

public class Musica {
    
    private String id; 
    private boolean isSelecionada;
    private double tempoMusica; 

    public void setSelecionada(boolean isSelecionada) {
        this.isSelecionada = isSelecionada;
    }
    
    public double getTempoMusica() {
        return tempoMusica;
    }

    public String getId() {
        return id;
    }

}
