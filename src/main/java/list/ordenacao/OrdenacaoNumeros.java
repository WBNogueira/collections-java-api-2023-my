package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("Lista de números está vazia!");
        }
    }

    public  List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.numeros);
        if (!numerosDescendente.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("Lista de números está vazia!");
        }
    }

    public void exibirNumeros () {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("Lista de números está vazia!");
        }
    }

    public static void main(String[] args) {

        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());
        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());
        numeros.exibirNumeros();

    }
}
