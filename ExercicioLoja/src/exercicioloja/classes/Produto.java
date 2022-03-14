package exercicioloja.classes;

import java.util.ArrayList;

/**
 *
 * @author Gilson
 */
public class Produto {
    
    private int id;
    private String descricao;
    private double preco;
    private double quantidadeEstoque;
    private Categoria categoria;
    
    
    public Produto(){}
    
    public Produto(int id, String descricao, double preco, double quantidadeEstoque, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }
   

        public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
      
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidade) {
        this.quantidadeEstoque = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.categoria = Categoria;
    }
    
      
    
}
