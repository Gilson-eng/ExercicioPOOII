package exercicioloja.classes;

/**
 *
 * @author Gilson
 */
public class ItemDeVenda {
    private Produto produto;
    private double quantidade;
    private double valor;
    private double impostoTotal;

    public ItemDeVenda(double quantidade, double valor, double impostoTotal) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.impostoTotal = impostoTotal;
    }
    
    
    public ItemDeVenda(){}

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getImpostoTotal() {
        return impostoTotal;
    }

    public void setImpostoTotal(double impostoTotal) {
        this.impostoTotal = impostoTotal;
    }
    
    
    
    
    
}
