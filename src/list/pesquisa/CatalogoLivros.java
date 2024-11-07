package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    //Construtor
    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }


    public List<Livro> getListaLivros () {
        return listaLivros;
    }

    //Método adicionar

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Pesquisar livros por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        //lista que recebe livros do autor solicitado
        List<Livro> listLivroPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAutor().trim().equalsIgnoreCase(autor)) {
                    listLivroPorAutor.add(l);
                }
            }
        }
        return listLivroPorAutor;
    }

    //Pesquisa livros publicados em um deterninado intervalo de anos e retorna uma lista com os livros encontrados
    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> listaPorAnoIntervaloAno = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    listaPorAnoIntervaloAno.add(l);
                }
            }
        }
        return listaPorAnoIntervaloAno;
    }

    //pesquisa livros por titulo e retorna o primeiro livro encontrado;
    public Livro pesquisaPorTitulo(String titulo){
        Livro livroTitulo = null;
        if(!listaLivros.isEmpty()){
            for(Livro livro : listaLivros){
                if(livro.getTitulo().trim().equalsIgnoreCase(titulo)){
                    livroTitulo=livro;
                    break;
                }

            }
        }


        return livroTitulo;
    }




    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Teste titulo", "Teste autor ", 2024);
        catalogoLivros.adicionarLivro("Teste titulo2", "Teste autor2 ", 2024);
        catalogoLivros.adicionarLivro("Teste titulo", "Teste autor ", 2024);
        catalogoLivros.adicionarLivro("Teste titulo3 ", "Teste autor3 ", 2020);
        catalogoLivros.adicionarLivro("Teste titulo3 ", "Teste autor4 ", 2012);


        System.out.println(catalogoLivros.pesquisaPorTitulo("Teste titulo3"));
        System.out.println(catalogoLivros.pesquisarPorAutor("teste autor"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2000,2018));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2018,2024));
    }
}