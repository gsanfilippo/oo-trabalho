package oo.trabalho.entity;

public class ContaPoupanca extends Conta {

    private Double rentabilidadeMensal;

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public Double calcularSaldo() {
        return 0.00;
    }

}