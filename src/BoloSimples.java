public class BoloSimples extends Bolo {
    private boolean semLactose;

    public BoloSimples(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
        this.semLactose = false;
    }

    public BoloSimples(int codigo, double custo, IFormato formato, boolean semLactose) {
        super(codigo, custo, formato);
        this.semLactose = semLactose;
    }

    @Override
    public double preco() {
        double precoBase = custo * formato.area();
        if (semLactose) {
            precoBase += 35.0;
        }
        return precoBase;
    }

    @Override
    public String toString() {
        return "BoloSimples{" +
                "codigo=" + codigo +
                ", custo=" + custo +
                ", semLactose=" + semLactose +
                ", preco=" + preco() +
                "}";
    }
}