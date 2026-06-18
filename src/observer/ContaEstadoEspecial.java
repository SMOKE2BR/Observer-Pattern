package observer;

public class ContaEstadoEspecial extends ContaEstado {
    private static final ContaEstadoEspecial instance = new ContaEstadoEspecial();
    private ContaEstadoEspecial() {}

    public static ContaEstadoEspecial getInstance() { return instance; }

    @Override
    public String getEstado() { return "Especial"; }

    @Override
    public boolean ativar(Conta conta) {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        return true;
    }

    @Override
    public boolean bloquear(Conta conta) {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        return true;
    }

    @Override
    public boolean encerrar(Conta conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        return true;
    }
}
