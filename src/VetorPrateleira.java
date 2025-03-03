public class VetorPrateleira implements IPrateleira {
    private IBolo[] prateleira;
    private int quantidadeBolos;

    public VetorPrateleira(int tamanho) {
        this.prateleira = new IBolo[tamanho];
        this.quantidadeBolos = 0;
    }

    @Override
    public void inserir(IBolo bolo) {
        for (int i = 0; i < quantidadeBolos; i++) {
            if (prateleira[i].equals(bolo)) {
                System.out.println("Bolo já cadastrado.");
                return;
            }
        }

        if (quantidadeBolos < prateleira.length) {
            prateleira[quantidadeBolos] = bolo;
            quantidadeBolos++;
        } else {
            System.out.println("Prateleira está cheia.");
        }
    }

    @Override
    public IBolo remover(IBolo bolo) {
        for (int i = 0; i < quantidadeBolos; i++) {
            if (prateleira[i].equals(bolo)) {
                IBolo boloRemovido = prateleira[i];

                for (int j = i; j < quantidadeBolos - 1; j++) {
                    prateleira[j] = prateleira[j + 1];
                }
                prateleira[quantidadeBolos - 1] = null;
                quantidadeBolos--;
                return boloRemovido;
            }
        }
        System.out.println("Bolo inexistente.");
        return null;
    }

    @Override
    public IBolo remover(int posicao) {
        if (posicao >= 0 && posicao < quantidadeBolos) {
            IBolo boloRemovido = prateleira[posicao];

            for (int j = posicao; j < quantidadeBolos - 1; j++) {
                prateleira[j] = prateleira[j + 1];
            }
            prateleira[quantidadeBolos - 1] = null;
            quantidadeBolos--;
            return boloRemovido;
        }
        System.out.println("Bolo inexistente.");
        return null;
    }

    @Override
    public IBolo[] listar(char tipoDoBolo) {
        int contador = 0;

        for (int i = 0; i < quantidadeBolos; i++) {
            if ((tipoDoBolo == 'S' && prateleira[i] instanceof BoloSimples) ||
                    (tipoDoBolo == 'T' && prateleira[i] instanceof Torta)) {
                contador++;
            }
        }


        IBolo[] bolosFiltrados = new IBolo[contador];
        int index = 0;

        for (int i = 0; i < quantidadeBolos; i++) {
            if ((tipoDoBolo == 'S' && prateleira[i] instanceof BoloSimples) ||
                    (tipoDoBolo == 'T' && prateleira[i] instanceof Torta)) {
                bolosFiltrados[index] = prateleira[i];
                index++;
            }
        }

        return bolosFiltrados;
    }
}