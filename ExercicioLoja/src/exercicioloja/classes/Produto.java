package exercicioloja.classes;

/**
 *
 * @author Gilson
 */
public class Produto {
    
    private String descricao;
    private double preco;
    private double quantidadeEstoque;
    private Categoria Categoria;

    public Produto(String descricao, double preco, double quantidadeEstoque, Categoria Categoria) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.Categoria = Categoria;
    }
   

        public String getDescricao() {
        return descricao;
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

    public void DecrementarEstoque(double estoque){
        
        setQuantidadeEstoque(getQuantidadeEstoque()-estoque);
    }
    
    public void AdicionarEstoque(double estoque){
        setQuantidadeEstoque(getQuantidadeEstoque()+estoque);
    }
    
    
}
