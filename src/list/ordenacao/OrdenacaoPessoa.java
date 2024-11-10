package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    //ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    //ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.
    // CLASSE CRIADA EM PESSOA
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoaPorAltura);
        return pessoaPorAltura;
    }


    public static void main(String[] args) {

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Maria",20,1.59);
        ordenacaoPessoa.adicionarPessoa("Joana",12,1.60);
        ordenacaoPessoa.adicionarPessoa("Carlos",36,1.70);
        ordenacaoPessoa.adicionarPessoa("Camila",20,1.80);
        ordenacaoPessoa.adicionarPessoa("Maria",20,1.55);
        System.out.println(ordenacaoPessoa.listaPessoas);
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
