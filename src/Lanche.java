import java.util.List;

public class Lanche {

    private String nome;
    private List<Ingrediente> ingredientes;

    public Lanche(String nome, List<Ingrediente> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    // Método para calcular o preço do lanche
    public double calcularPreco() {
        double precoTotal = 0;
        for (Ingrediente ingrediente : ingredientes) {
            precoTotal += ingrediente.getPreco();
        }
        return precoTotal;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;

    }
}
