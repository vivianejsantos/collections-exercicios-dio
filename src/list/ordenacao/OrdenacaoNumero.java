package list.ordenacao;

import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {

    private List<Integer> listaNumerosInteiros;

    public OrdenacaoNumero() {
        this.listaNumerosInteiros = new ArrayList<>();
    }


    public void adicionarNumero(int numero){
        listaNumerosInteiros.add(numero);
    }

    //ordenarAscendente
    public List<Integer> ordenarAscendente(){
        List<Integer> ordemAscendente = new ArrayList<>(listaNumerosInteiros);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }

    //ordenarDescendente com comparable
    public List<Integer> ordenarDescendente(){
        List<Integer> ordemDescendente = new ArrayList<>(listaNumerosInteiros);
        Collections.reverse(ordemDescendente);
        return ordemDescendente;
    }

    public static void main(String[] args) {

        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNumero(1);
        ordenacaoNumero.adicionarNumero(30);
        ordenacaoNumero.adicionarNumero(12);
        ordenacaoNumero.adicionarNumero(42);
        ordenacaoNumero.adicionarNumero(3);
        ordenacaoNumero.adicionarNumero(50);
        ordenacaoNumero.adicionarNumero(100);
        ordenacaoNumero.adicionarNumero(121);


        System.out.println(ordenacaoNumero.listaNumerosInteiros);
        System.out.println(ordenacaoNumero.ordenarAscendente());
        System.out.println(ordenacaoNumero.ordenarDescendente());
    }

}
