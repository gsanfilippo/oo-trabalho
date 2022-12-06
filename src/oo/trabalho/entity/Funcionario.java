package oo.trabalho.entity;

import oo.trabalho.IUsuario;

public class Funcionario extends Pessoa implements IUsuario {

    private Cargo cagro;

    private Double salario;

    public Cargo getCagro() {
        return cagro;
    }

    public void setCagro(Cargo cagro) {
        this.cagro = cagro;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Funcionario(Cargo cagro, Double salario) {
        this.cagro = cagro;
        this.salario = salario;
    }
}