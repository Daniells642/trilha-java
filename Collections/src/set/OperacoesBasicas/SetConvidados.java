package set.OperacoesBasicas;

// O SET não aceita elemntos iguais

import java.util.HashSet;
import java.util.Set;

public class SetConvidados {

    private Set<Convidado> convidadoSet;

    public SetConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public  void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        SetConvidados conjuntoConvidados = new SetConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 3);
        conjuntoConvidados.adicionarConvidado("Convidado 7", 3);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 4);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");
    }
}
