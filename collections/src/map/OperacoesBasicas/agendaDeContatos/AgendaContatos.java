package map.OperacoesBasicas.agendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Thiago", 123456);
        agendaContatos.adicionarContato("João", 654321);
        agendaContatos.adicionarContato("Thiago", 123);
        agendaContatos.adicionarContato("Bianca", 1234);

        agendaContatos.exibirContatos();
        System.out.println("");
        agendaContatos.removerContato("João");
        agendaContatos.exibirContatos();
        System.out.println("");
        System.out.println(agendaContatos.pesquisarPorNome("Thiago"));

    }
    
}
