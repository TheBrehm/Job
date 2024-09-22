public class Main {
    public static void main(String[] args) {
        // Objetos polimórficos
        ComidaJaponesa sushi = new Sushi("Sushi", 20.0, "Sushi", "Salmão");
        ComidaJaponesa sashimi = new Sashimi("Sashimi", 30.0, "Sashimi", "Atum");
        ComidaJaponesa tempura = new Tempura("Tempura", 15.0, "Frito", "Camarão");

        // Chamando método exclusivo de cada classe filha com typecast e instanceof
        if (sushi instanceof Sushi) {
            ((Sushi) sushi).enrolar();
        }

        if (sashimi instanceof Sashimi) {
            ((Sashimi) sashimi).cortar();
        }

        if (tempura instanceof Tempura) {
            ((Tempura) tempura).fritar();
        }

        // Chamada polimórfica de método sobrescrito
        realizarPreparo(sushi);
        realizarPreparo(sashimi);
        realizarPreparo(tempura);
    }

    // Método que realiza a chamada polimórfica do método sobrescrito
    public static void realizarPreparo(ComidaJaponesa comida) {
        comida.preparar();
    }
}
