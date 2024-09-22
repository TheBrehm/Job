public class Sashimi extends ComidaJaponesa {
    private String peixe;

    // Construtor sem parâmetros
    public Sashimi() {
        super();
        this.peixe = "Desconhecido";
    }

    // Construtor com parâmetros
    public Sashimi(String nome, double preco, String tipo, String peixe) {
        super(nome, preco, tipo);
        this.peixe = peixe;
    }

    // Getters e Setters
    public String getPeixe() {
        return this.peixe;
    }

    public void setPeixe(String peixe) {
        this.peixe = peixe;
    }

    // Sobrescrevendo método preparar
    @Override
    public void preparar() {
        System.out.println("Preparando sashimi de " + this.peixe);
    }

    // Método exclusivo da classe Sashimi
    public void cortar() {
        System.out.println("Cortando o sashimi de " + this.peixe);
    }
}
