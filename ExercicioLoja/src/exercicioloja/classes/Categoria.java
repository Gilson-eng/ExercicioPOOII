package exercicioloja.classes;

/**
 *
 * @author Gilson
 */
public class Categoria {
    private String nome;
    private double imposto;
    private int Id;
    
    public Categoria(){}

    public Categoria(String nome, double imposto, int Id) {
        this.nome = nome;
        this.imposto = imposto;
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

   
    
    
    
}
