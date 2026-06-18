package observer;

public class ContaEstadoBloqueada extends ContaEstado {
    private static final ContaEstadoBloqueada instance = new ContaEstadoBloqueada();
    private ContaEstadoBloqueada() {}

    public static ContaEstadoBloqueada getInstance() { return instance; }

    @Override
    public String getEstado() { return "Bloqueada"; }

    @Override
    public boolean ativar(Conta conta) {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        return true;
    }

    @Override
    public boolean encerrar(Conta conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        return true;
    }
}
