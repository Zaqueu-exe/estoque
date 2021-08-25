package br.com.estoque.aplicacao;

import java.util.Scanner;

import br.com.estoque.dao.EstoqueDAO;
import br.com.estoque.model.Produtos;

public class Funcoes {

    public int opcoes(Scanner scan) {
        String aux;
        int op;
        do {
            System.out.println("1 - Para cadastrar um produto");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            aux = scan.nextLine();
            op = Integer.parseInt(aux);
        } while (op < 0);
        return op;
    }

    public void execucao(Scanner scan, int op) {
        Produtos produto = new Produtos();
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        switch (op) {
            case 1: {
                System.out.println("Digite o nome do produto");
                produto.setNome(scan.nextLine());
                System.out.println("Digite a quantidade inicial do produto");
                produto.setQuantidade(Integer.parseInt(scan.nextLine()));
                System.out.println("Digite o preço unitario do produto");
                produto.setPreco(Double.parseDouble(scan.nextLine()));
                estoqueDAO.save(produto);
            }
                break;

            default:
                break;
        }
    }
}
