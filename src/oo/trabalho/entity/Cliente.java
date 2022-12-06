package oo.trabalho.entity;

import oo.trabalho.IUsuario;

import java.util.ArrayList;

public class Cliente extends Pessoa implements IUsuario  {

    private Boolean vip;

    private ArrayList<Endereco> enderecos = new ArrayList<>();

    private ArrayList<Conta> contas = new ArrayList<>();

    public Cliente(Boolean vip) {
        this.vip = vip;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public ArrayList<Endereco> listarEnderecos() {
        return enderecos;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public ArrayList<Conta> listarContas() {
        return contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public Conta getConta(String numeroConta) {

         return this.contas.stream()
                    .filter(findConta -> numeroConta.equals(findConta.getNumero()))
                    .findAny()
                    .orElse(null);

    }

}