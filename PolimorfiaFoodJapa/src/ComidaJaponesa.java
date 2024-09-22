public class ComidaJaponesa {
    private String nome;
    private double preco;
    private String tipo; // ex: sushi, sashimi, etc.

    // Construtor sem parâmetros
    public ComidaJaponesa() {
        this.nome = "Desconhecido";
        this.preco = 0.0;
        this.tipo = "Desconhecido";
    }

    // Construtor com todos os parâmetros
    public ComidaJaponesa(String nome, double preco, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método qualquer
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + ", Preço: " + this.preco + ", Tipo: " + this.tipo);
    }

    // Método a ser sobrescrito
    public void preparar() {
        System.out.println("Preparando " + this.nome);
    }
}
