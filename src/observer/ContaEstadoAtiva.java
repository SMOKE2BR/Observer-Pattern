package observer;

public class ContaEstadoAtiva extends ContaEstado {
    private static final ContaEstadoAtiva instance = new ContaEstadoAtiva();
    private ContaEstadoAtiva() {}

    public static ContaEstadoAtiva getInstance() { return instance; }

    @Override
    public String getEstado() { return "Ativa"; }

    @Override
    public boolean bloquear(Conta conta) {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        return true;
    }

    @Override
    public boolean especial(Conta conta) {
        conta.setEstado(ContaEstadoEspecial.getInstance());
        return true;
    }

    @Override
    public boolean encerrar(Conta conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        return true;
    }
}
