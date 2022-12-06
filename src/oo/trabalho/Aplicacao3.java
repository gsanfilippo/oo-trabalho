package oo.trabalho;

import oo.trabalho.entity.*;

import java.util.Random;
import java.util.Scanner;

public class Aplicacao3 {

    //Aplicação 3
    // - Crie um cliente que possua uma ContaCorrente
    // - Efetue três depósitos de 100 nessa ContaCorrente
    // - Efetue um saque de 50 reais nessa ContaCorrente
    // - Imprima o valor do saldo dessa ContaCorrente

    public static void main(String[] args) {
        System.out.println("Adição de cliente");

        Cliente client = addClient();

        System.out.println("VIP: " + client.getVip());
        System.out.println("Nome: " + client.getNome());
        System.out.println("Cpf: " + client.getCpf());
        System.out.println("Telefone: " + client.getTelefone());
        System.out.println("------------------------------------------------------");

        System.out.println("");

        // Conta corrente

        System.out.println("Adição de conta corrente para " + client.getNome());

        ContaCorrente newConta = addConta();

        for (int i = 0; i <= 2; i++) {
            System.out.println("Depósito efetuado de R$ 100.00");
            newConta.depositar(new Credito(100.00));
        }
        System.out.println("");
        System.out.println("Saldo de " + newConta.getSaldo());

        System.out.println("");
        System.out.println("Saque efetuado de R$ 50.00");
        newConta.sacar(new Debito(50.00));

        System.out.println("");
        System.out.println("Saldo de " + newConta.getSaldo());

        client.addConta(newConta);

    }

    public static Cliente addClient() {

        Scanner sc = new Scanner(System.in);

        Cliente newClient;

        System.out.println("Adição de cliente e sua conta corrente");
        System.out.println("");

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

    public static String getRandomInt(int min, int max) {
        Random random = new Random();
        return "" + random.nextInt(max - min) + min;
    }

    public static Double getRandomDouble(Double min, Double max) {
        Random random = new Random();
        return min + (max - min) *  random.nextDouble();
    }

}
