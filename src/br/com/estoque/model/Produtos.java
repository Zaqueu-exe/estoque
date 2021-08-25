package br.com.estoque.model;

public class Produtos {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;
    private int i_ano;
    private int i_mes;
    private int i_dia;
    private int u_ano;
    private int u_mes;
    private int u_dia;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getI_ano() {
        return i_ano;
    }
    public void setI_ano(int i_ano) {
        this.i_ano = i_ano;
    }
    public int getI_mes() {
        return i_mes;
    }
    public void setI_mes(int i_mes) {
        this.i_mes = i_mes;
    }
    public int getI_dia() {
        return i_dia;
    }
    public void setI_dia(int i_dia) {
        this.i_dia = i_dia;
    }
    public int getU_ano() {
        return u_ano;
    }
    public void setU_ano(int u_ano) {
        this.u_ano = u_ano;
    }
    public int getU_mes() {
        return u_mes;
    }
    public void setU_mes(int u_mes) {
        this.u_mes = u_mes;
    }
    public int getU_dia() {
        return u_dia;
    }
    public void setU_dia(int u_dia) {
        this.u_dia = u_dia;
    }
    @Override
    public String toString() {
        return 
        "Produto ID :             " +id + "\n" +
        "Nome :                   " + nome + "\n" +
        "Preço :                  " + preco + "\n" +
        "Quantidade em estoque:   " + quantidade + "\n" +
        "Data de inserido :       " + i_dia + "/" + i_mes + "/" + i_ano + "\n" +
        "Ultima data atualizada : " + i_dia + "/" + i_mes + "/" + i_ano + "\n" + "\n";
    }
    
}
