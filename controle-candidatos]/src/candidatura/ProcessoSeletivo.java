package candidatura;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
     analisarCandidato(1900.0);
     analisarCandidato(2300.0);
     analisarCandidato(2000.0);
    }

    static void selecaoDeCandidatos() {
        
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0; 
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if ( salarioPretendido == salarioBase ) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
