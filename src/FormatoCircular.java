public class FormatoCircular implements IFormato {
    private double raio;

    public FormatoCircular(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}