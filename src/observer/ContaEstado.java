package observer;

import java.util.Observable;
import java.util.Observer;

public abstract class ContaEstado implements Observer {
    protected String ultimaNotificacao;

    public abstract String getEstado();

    public boolean bloquear(Conta conta) { return false; }
    public boolean ativar(Conta conta) { return false; }
    public boolean encerrar(Conta conta) { return false; }
    public boolean especial(Conta conta) { return false; }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void atualizarEstadoConta(Conta conta) {
        System.out.println("Estado atualizado: " + conta.getNomeEstado());
    }

    @Override
    public void update(Observable conta, Object arg) {
        this.ultimaNotificacao = (String) arg;
        System.out.println("Notificação recebida: " + ultimaNotificacao);
    }
}
