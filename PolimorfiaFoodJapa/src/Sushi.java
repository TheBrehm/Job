public class Sushi extends ComidaJaponesa {
    private String recheio;

    // Construtor sem parâmetros
    public Sushi() {
        super();
        this.recheio = "Desconhecido";
    }

    // Construtor com parâmetros
    public Sushi(String nome, double preco, String tipo, String recheio) {
        super(nome, preco, tipo);
        this.recheio = recheio;
    }

    // Getters e Setters
    public String getRecheio() {
        return this.recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    // Sobrescrevendo método preparar
    @Override
    public void preparar() {
        System.out.println("Preparando sushi de " + this.recheio);
    }

    // Método exclusivo da classe Sushi
    public void enrolar() {
        System.out.println("Enrolando o sushi com " + this.recheio);
    }
}
