public class Torta extends Bolo {
    private boolean recheio;
    private boolean cobertura;

    public Torta(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
        this.recheio = true;
        this.cobertura = true;
    }

    public Torta(int codigo, double custo, IFormato formato, boolean recheio, boolean cobertura) {
        super(codigo, custo, formato);
        this.recheio = recheio;
        this.cobertura = cobertura;
    }

    @Override
    public double preco() {
        double precoBase = custo * formato.area();
        if (recheio) {
            precoBase += 12.50;
        }
        if (cobertura) {
            precoBase += 20.0;
        }
        return precoBase;
    }

    @Override
    public String toString() {
        return "Torta{" +
                "codigo=" + codigo +
                ", custo=" + custo +
                ", recheio=" + recheio +
                ", cobertura=" + cobertura +
                ", preco=" + preco() +
                "}";
    }
}