package oo.trabalho.entity;

import oo.trabalho.IUsuario;

import java.util.ArrayList;

public class Cliente extends Pessoa implements IUsuario  {

    private Boolean vip;

    private ArrayList<Endereco> enderecos = new ArrayList<>();

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public ArrayList<Endereco> listarEnderecos() {
        return enderecos;
    }

    public void addEndereco(Endereco endereco) { this.enderecos.add(endereco);}

    public Cliente(Boolean vip) {
        this.vip = vip;
    }
}