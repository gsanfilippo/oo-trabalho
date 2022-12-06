package oo.trabalho;

import oo.trabalho.entity.*;

import java.util.Random;
import java.util.Scanner;

public class Aplicacao4 {

    //Aplicação 4
    // - Crie um cliente que possua uma ContaCorrente
    // - Efetue um depósito de 1000 nessa ContaCorrente
    // - Crie um cliente que possua uma ContaPoupanca
    // - Efetue um depósito de 1000 reais nessa conta Poupanca

    public static void main(String[] args) {

        System.out.println("Adição do cliente 1");
        System.out.println("");
        Cliente client1 = addClient();
        ContaCorrente cli1ContaCorrente = addContaCorrenteToCliente(client1);

        System.out.println("");
        System.out.println("Adição do cliente 2");
        System.out.println("");
        Cliente client2 = addClient();
        ContaPoupanca cli2ContaPopanca = addContaPoupancaToCliente(client2);


        System.out.println("Transferencia efetuada de R$ 500.00");
        System.out.println("");
        cli1ContaCorrente.transferir(cli2ContaPopanca, 500.00);

        System.out.println("Saldo da conta corrente: " + cli1ContaCorrente.getSaldo());
        System.out.println("Saldo da conta poupanca: " + cli2ContaPopanca.getSaldo());

    }

    public static ContaCorrente addContaCorrenteToCliente(Cliente client) {

        System.out.println("VIP: " + client.getVip());
        System.out.println("Nome: " + client.getNome());
        System.out.println("Cpf: " + client.getCpf());
        System.out.println("Telefone: " + client.getTelefone());
        System.out.println("------------------------------------------------------");

        System.out.println("");

        // Conta corrente

        System.out.println("Adição de conta corrente para " + client.getNome());

        ContaCorrente newConta = addConta();

        System.out.println("Depósito efetuado de R$ 1000.00");
        newConta.depositar(new Credito(1000.00));

        System.out.println("");
        System.out.println("Saldo de " + newConta.getSaldo());

        client.addConta(newConta);
        return newConta;
    }

    public static ContaPoupanca addContaPoupancaToCliente(Cliente client) {

        System.out.println("VIP: " + client.getVip());
        System.out.println("Nome: " + client.getNome());
        System.out.println("Cpf: " + client.getCpf());
        System.out.println("Telefone: " + client.getTelefone());
        System.out.println("------------------------------------------------------");

        System.out.println("");

        // Conta corrente

        System.out.println("Adição de conta corrente para " + client.getNome());

        ContaPoupanca newConta = addContaPoupanca();

        System.out.println("Depósito efetuado de R$ 1000.00");
        newConta.depositar(new Credito(1000.00));

        System.out.println("");
        System.out.println("Saldo de " + newConta.getSaldo());

        client.addConta(newConta);
        return newConta;
    }

    public static Cliente addClient() {

        Scanner sc = new Scanner(System.in);

        Cliente newClient;

        System.out.println("Qual o nome do cliente?");
        String nome = sc.nextLine();

        System.out.println("Qual o cpf?");
        String cpf = sc.nextLine();

        System.out.println("Qual o telefone?");
        String telefone = sc.nextLine();

        System.out.println("É cliente VIP? (Digite Sim ou Nao)");
        String vip = sc.nextLine();

        newClient = new Cliente(vip.equals("Sim"));
        newClient.setNome(nome);
        newClient.setCpf(cpf);
        newClient.setTelefone(telefone);

        System.out.println("");

        return newClient;
    }


    public static ContaCorrente addConta() {

        Scanner sc = new Scanner(System.in);

        ContaCorrente newConta = new ContaCorrente();

        System.out.println("");

        System.out.println("Qual o saldo inicial?");
        String saldo = sc.nextLine();

        newConta.setNumero(getRandomInt(100000, 999999));
        newConta.setLimite(getRandomDouble(100.00, 999.99));
        newConta.setSaldo(Double.parseDouble(saldo));

        System.out.println("");
        System.out.println("" + newConta.getNumero());

        return newConta;
    }

    public static ContaPoupanca addContaPoupanca() {

        Scanner sc = new Scanner(System.in);

        ContaPoupanca newConta = new ContaPoupanca();

        System.out.println("");

        System.out.println("Qual o saldo inicial?");
        String saldo = sc.nextLine();

        newConta.setNumero(getRandomInt(100000, 999999));
        newConta.setSaldo(Double.parseDouble(saldo));

        System.out.println("");
        System.out.println("" + newConta.getNumero());

        return newConta;
    }

    public static String getRandomInt(int min, int max) {
        Random random = new Random();
        return "" + random.nextInt(max - min) + min;
    }

    public static Double getRandomDouble(Double min, Double max) {
        Random random = new Random();
        return min + (max - min) *  random.nextDouble();
    }

}