package exercicioloja.classes;

/**
 *
 * @author Gilson
 */
import java.util.ArrayList;
public class Vendas {
    
    private String dataVenda;
    private ItemDeVenda itemVenda;
    private double valorTotalVenda;
    public static ArrayList<ItemDeVenda> ListVenda = new ArrayList<>();
    
      
    public Vendas(){}

    public Vendas(String dataVenda, double valorTotalVenda) {
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
    }

    public ItemDeVenda getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(ItemDeVenda itemVenda) {
        this.itemVenda = itemVenda;
    }

       
    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

      
    
    public ArrayList<ItemDeVenda> getListVenda() {
        return ListVenda;
    }

    public void setListVenda(ArrayList<ItemDeVenda> ListVenda) {
        this.ListVenda = ListVenda;
    }

     

    
   

      
    
    
    
}
