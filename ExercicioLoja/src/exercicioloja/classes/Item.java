package exercicioloja.classes;

/**
 *
 * @author Gilson
 */
public class Item {
    
    private double quantidade;
    private Produto Produto;
    private double valorTotal;

    public Item(double quantidade, Produto Produto, double valorTotal) {
        this.quantidade = quantidade;
        this.Produto = Produto;
        this.valorTotal = valorTotal;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal*quantidade;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
