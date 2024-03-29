package aparelhoTelefonico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AparelhoTelefonico {
    
    private List<Contato> contatos = new ArrayList<>();
    private String numeroSelecionado;

    public void adicionarContato(String nome, String numero) {
        Contato contadoParaAdicionar = new Contato(nome, numero);
        contatos.add(contadoParaAdicionar);
    }


    public void ligar(String id) {
      contatos.stream().filter(c -> c.getId().equals(id)).findFirst();
      //onde iria implementação ligar 
    }

    public void atender(String id) {
        contatos.stream().filter(c -> c.getId().equals(id)).findFirst();
        //onde iria implementação atender
    }

    public void iniciarCorreioVoz(String id){
        contatos.stream().filter(c -> c.getId().equals(id)).findFirst();
        //onde iria implementação iniciarCorreioVoz
    }

    public void deletar(String id) {
          contatos = contatos.stream()
                      .filter(c -> !c.getId().equals(id))
                      .collect(Collectors.toList());
    }

}
