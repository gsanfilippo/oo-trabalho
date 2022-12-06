package oo.trabalho.entity;

public abstract class Conta {

    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void depositar(Credito credito) {

    }

    public void sacar(Debito debito) {

    }

}