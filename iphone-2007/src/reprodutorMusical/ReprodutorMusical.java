package reprodutorMusical;

public class ReprodutorMusical {
    private String musicaSelecionadaId;
    private double tempoMusica; 
    private boolean isTocando; 

    public void tocar() {
        isTocando = true; 
    }

    public void pausar(){
        isTocando = false; 
    }

    public void selecionarMusica(Musica musica) {
        musicaSelecionadaId = musica.getId();
        musica.setSelecionada(true);
    }
}
