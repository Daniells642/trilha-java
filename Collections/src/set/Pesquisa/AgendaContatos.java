package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void  adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato contato: contatoSet) {
            if (contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContados = new AgendaContatos();

        agendaContados.adicionarContato("Camila", 123456);
        agendaContados.adicionarContato("Camila", 056656); // Não adiona com o mesmo nome, conforme implementado.
        agendaContados.adicionarContato("Camila Caalcante", 456789);
        agendaContados.adicionarContato("Camila DIO", 417852);
        agendaContados.adicionarContato("Daniel Lima", 112469);

        agendaContados.exibirContatos();
        agendaContados.pesquisarPorNome("Daniel");

        System.out.println(agendaContados.pesquisarPorNome("Daniel"));

        System.out.println("Contato atualizado: " + agendaContados.atualizarNumeroContato("Camila", 555555));

        agendaContados.exibirContatos();
    }
}
