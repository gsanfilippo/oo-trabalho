package oo.trabalho.entity;

public class ContaCorrente extends Conta {

    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void transferir(Conta contaDestino, Double valor) {
        this.sacar(new Debito(valor));
        contaDestino.depositar(new Credito(valor));
    }

    public Double calcularSaldo() {
        return this.getSaldo();
    }

}