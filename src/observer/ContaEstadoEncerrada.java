package observer;

public class ContaEstadoEncerrada extends ContaEstado {
    private static final ContaEstadoEncerrada instance = new ContaEstadoEncerrada();
    private ContaEstadoEncerrada() {}

    public static ContaEstadoEncerrada getInstance() { return instance; }

    @Override
    public String getEstado() { return "Encerrada"; }
}
