package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

   private  List<Tarefa> tarefasList;

//Construtor criando uma lista
    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    // método de obter descrição das tarefas

    public void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }


    // método de adicionar tarefa
    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefa(descricao));
    }

    // método de remover tarefa
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaspararemover = new ArrayList<>();
        for(Tarefa tarefa : tarefasList){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaspararemover.add(tarefa);
            }
        }
        System.out.println(tarefaspararemover);
    }






    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("teste de tarefa 1");
        listaTarefas.adicionarTarefa("teste de tarefa 2");
        listaTarefas.adicionarTarefa("teste de tarefa 1");
        listaTarefas.adicionarTarefa("teste de tarefa 3");
        listaTarefas.adicionarTarefa("teste de tarefa 1");
        listaTarefas.obterDescricoesTarefas();
        listaTarefas.removerTarefa("teste de tarefa 1");
        listaTarefas.obterDescricoesTarefas();


    }
}
