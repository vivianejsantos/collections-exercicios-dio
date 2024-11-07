package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;


    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    //métodos

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaRemoverItem = new ArrayList<>();
        for(Item i : listaItens){
            if (i.getNome().equalsIgnoreCase(nome)){
                listaRemoverItem.add(i);
            }
        }listaItens.removeAll(listaRemoverItem);
    }

    public double  calcularValorTotal(){
       var total=0.0;
        for(Item i : listaItens){
            total+= i.getPreco() * i.getQuantidade();
        }
        return total;
    }



    public void exibirItens(){
        System.out.println(listaItens);
    }


    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Computador",1,20);
        carrinhoDeCompras.adicionarItem("Mesa",2.00,30);
        carrinhoDeCompras.adicionarItem("Cadeira gamer",70.00,20);
//        carrinhoDeCompras.adicionarItem("Teclado",100.00,520);
//        carrinhoDeCompras.adicionarItem("Mouse",50.00,60);
//        carrinhoDeCompras.adicionarItem("Mouse",50.00,60);
//        carrinhoDeCompras.exibirItens();
//        carrinhoDeCompras.removerItem("Computador");
//        carrinhoDeCompras.removerItem("Mouse");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());



    }
}

