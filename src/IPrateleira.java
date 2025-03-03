public interface IPrateleira {
    void inserir(IBolo bolo);
    IBolo remover(IBolo bolo);
    IBolo remover(int posicao);
    IBolo[] listar(char tipoDoBolo);
}