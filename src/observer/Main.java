package observer;

public class Main {
    static void main(String[] args) {
        Conta conta = new Conta();

        // Adiciona observadores
        ContaEstadoAtiva.getInstance().update(conta, conta.getNomeEstado());
        ContaEstadoBloqueada.getInstance().update(conta, conta.getNomeEstado());
        ContaEstadoEspecial.getInstance().update(conta, conta.getNomeEstado());
        ContaEstadoEncerrada.getInstance().update(conta, conta.getNomeEstado());

        System.out.println("Estado inicial: " + conta.getNomeEstado());

        conta.bloquear();
        conta.especial();
        conta.encerrar();
    }
}
