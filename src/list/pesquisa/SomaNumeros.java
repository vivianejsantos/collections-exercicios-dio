package list.pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaNumeros {

    private List<Integer> listaNumerosInteiros;


    public SomaNumeros() {
        this.listaNumerosInteiros = new ArrayList<>();
    }

    public List<Integer> getListaNumerosInteiros() {
        return listaNumerosInteiros;
    }

    // Adiciona um número a lista de numeros
    public void adicionarNumeros(int numero) {
        listaNumerosInteiros.add(numero);
    }

    //Calcula a sima de todos os numeros na lista e retorna o resultado
    public int calcularSoma() {
        var soma = 0;
        if (!listaNumerosInteiros.isEmpty()) {
            for (Integer i : listaNumerosInteiros) {
                soma += i;
            }
        }
        return soma;
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listaNumerosInteiros=" + listaNumerosInteiros +
                '}';
    }


    //Retornar uma lista contendo os numeros presentes na lista
    public void exibirNumeros() {
        System.out.println(listaNumerosInteiros);
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listaNumerosInteiros.isEmpty()) {
            for (Integer numero : listaNumerosInteiros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMaiorNumero() {
        //vvariavel para guardar o menor valor de todos
        int maiorValor = Integer.MIN_VALUE;
        if (!listaNumerosInteiros.isEmpty()) {
            for (Integer numero : listaNumerosInteiros) {
                if (numero >= maiorValor) {
                    maiorValor = numero;

                }
            }
        }return maiorValor;

    }
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();


        somaNumeros.adicionarNumeros(12);
        somaNumeros.adicionarNumeros(24);
        somaNumeros.adicionarNumeros(1);
        somaNumeros.adicionarNumeros(2);
        System.out.println(somaNumeros.calcularSoma());
        somaNumeros.exibirNumeros();
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.encontrarMaiorNumero());
    }
}
