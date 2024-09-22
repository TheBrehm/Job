public class Tempura extends ComidaJaponesa {
    private String ingredientePrincipal;

    // Construtor sem parâmetros
    public Tempura() {
        super();
        this.ingredientePrincipal = "Desconhecido";
    }

    // Construtor com parâmetros
    public Tempura(String nome, double preco, String tipo, String ingredientePrincipal) {
        super(nome, preco, tipo);
        this.ingredientePrincipal = ingredientePrincipal;
    }

    // Getters e Setters
    public String getIngredientePrincipal() {
        return this.ingredientePrincipal;
    }

    public void setIngredientePrincipal(String ingredientePrincipal) {
        this.ingredientePrincipal = ingredientePrincipal;
    }

    // Sobrescrevendo método preparar
    @Override
    public void preparar() {
        System.out.println("Fritando tempura de " + this.ingredientePrincipal);
    }

    // Método exclusivo da classe Tempura
    public void fritar() {
        System.out.println("Fritando o tempura de " + this.ingredientePrincipal);
    }
}
