public class FormatoRetangular implements IFormato {
    private double comprimento;
    private double largura;

    public FormatoRetangular(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double area() {
        return comprimento * largura;
    }
}