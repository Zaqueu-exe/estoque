package br.com.estoque.aplicacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funcoes f = new Funcoes();
        int aux = -1;
        do{
            aux = f.opcoes(scan);
            f.execucao(scan, aux);
        }while(aux != 0);
    }
}
