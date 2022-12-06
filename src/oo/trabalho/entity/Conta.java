package oo.trabalho.entity;

public abstract class Conta {

    private String numero = "";
    private Double saldo = 0.00;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Credito credito) {
        this.saldo += credito.getValor();
    }

    public void sacar(Debito debito) {
        this.saldo -= debito.getValor();
    }

}