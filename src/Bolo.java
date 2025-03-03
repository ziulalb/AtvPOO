public abstract class Bolo implements IBolo {
    protected int codigo;
    protected double custo;
    protected IFormato formato;

    public Bolo(int codigo, double custo) {
        this.codigo = codigo;
        this.custo = custo;
    }

    public Bolo(int codigo, double custo, IFormato formato) {
        this.codigo = codigo;
        this.custo = custo;
        this.formato = formato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass().getSuperclass() != o.getClass().getSuperclass()) return false;
        Bolo bolo = (Bolo) o;
        return codigo == bolo.codigo;
    }

    @Override
    public String toString() {
        return "Bolo{" +
                "codigo=" + codigo +
                ", custo=" + custo +
                "}";
    }
}