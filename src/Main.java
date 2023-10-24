import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de lanches!");
        // Crie os ingredientes
        Ingrediente alface = new Ingrediente("Alface", 0.40);
        Ingrediente bacon = new Ingrediente("Bacon", 2.00);
        Ingrediente hamburguer = new Ingrediente("Hambúrguer", 3.00);
        Ingrediente ovo = new Ingrediente("Ovo", 0.80);
        Ingrediente queijo = new Ingrediente("Queijo", 1.50);

        // Crie os lanches do cardápio
        List<Ingrediente> xBaconIngredientes = Arrays.asList(bacon, hamburguer, queijo);
        Lanche xBacon = new Lanche("X-Bacon", xBaconIngredientes);

        // Possibilidade de criar os outros lanches da mesma maneira

        // Personalize um lanche
        List<Ingrediente> lanchePersonalizadoIngredientes = Arrays.asList(hamburguer, queijo, ovo);
        Lanche lanchePersonalizado = new Lanche("Lanche Personalizado", lanchePersonalizadoIngredientes);

        // Calcule e exiba o preço dos lanches
        System.out.println("Preço do " + xBacon.getNome() + ": R$" + xBacon.calcularPreco());
        System.out.println("Preço do lanche personalizado: R$" + lanchePersonalizado.calcularPreco());
    }
}


