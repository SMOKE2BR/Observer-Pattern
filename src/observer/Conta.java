package observer;

import java.util.Observable;

public class Conta extends Observable {
    private ContaEstado estado;

    public Conta() {
        this.estado = ContaEstadoAtiva.getInstance();
    }

    public void setEstado(ContaEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers(estado.getEstado());
    }

    public ContaEstado getEstado() {
        return estado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public boolean bloquear() {
        return estado.bloquear(this);
    }

    public boolean ativar() {
        return estado.ativar(this);
    }

    public boolean encerrar() {
        return estado.encerrar(this);
    }

    public boolean especial() {
        return estado.especial(this);
    }

    public void atualizarConta() {
        estado.atualizarEstadoConta(this);
    }
}
