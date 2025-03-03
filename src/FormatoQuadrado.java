public class FormatoQuadrado implements IFormato {
    private double lado;

    public FormatoQuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}