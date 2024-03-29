package navegador;

import java.util.ArrayList;
import java.util.List;

public class Navegador {
    List<Aba> abas = new ArrayList<>();
    Aba abaSelecionada;

    public void exibirPagina(Aba aba){
        abaSelecionada = aba; 
        aba.ativar();

        abas.stream().filter(a -> a.getId() != aba.getId()).forEach(a -> a.desativar());
    }

    public void adicionarNovaAba() {
        Aba novaAba = new Aba();
        
        abas.add(novaAba);
    }

    public void atualizarPagina(Aba aba){
        aba.refresh();
    }

    

}
