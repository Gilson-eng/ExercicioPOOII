package exercicioloja.classes;
import java.util.ArrayList;

/**
 *
 * @author Gilson
 */
public class Recebimentos {
        public static ArrayList<Vendas> ListVendas = new ArrayList<>();

    public Recebimentos(){}
    
    public ArrayList<Vendas> getListItensVenda() {
        return ListVendas;
    }

    public void setListItensVenda(ArrayList<Vendas> ListVendas) {
        this.ListVendas = ListVendas;
    }

   
    
       
}


