package oo.trabalho;

import oo.trabalho.entity.Cliente;
import oo.trabalho.entity.Endereco;

import java.util.Scanner;

public class Aplicacao2 {

    //Aplicação 2
    // - Crie um cliente e adicione 3 endereços a ele
    // - Imprima os endereços desse cliente

    public static void main(String[] args) {
        Cliente client = addClient();

        System.out.println("VIP: " + client.getVip());
        System.out.println("Nome: " + client.getNome());
        System.out.println("Cpf: " + client.getCpf());
        System.out.println("Telefone: " + client.getTelefone());
        System.out.println("------------------------------------------------------");

        System.out.println("");
        System.out.println("Vamos adicionar seus endereços? ");
        System.out.println("");

        // Endereço 1
        client.addEndereco(addEndereco());
        // Endereço 2
        client.addEndereco(addEndereco());
        // Endereço 3
        client.addEndereco(addEndereco());

        //teste
        //client.addEndereco(new Endereco("09760-480", "Rua Maria de fatima", "362", "Ap 51 Bloc B", "SBC", "SP"));
        //client.addEndereco(new Endereco("09760-280", "Av Armando Italo Setti", "16", "Ap 61 Bloc C", "SBC", "SP"));
        //client.addEndereco(new Endereco("09480-020", "Rua Guatemala", "171", "Ap 1", "STO", "SP"));

        System.out.println("");
        System.out.println("Lista de endereços");
        System.out.println("");

        for (int i = 0; i < client.listarEnderecos().toArray().length; i++) {
            Endereco endCliente = client.listarEnderecos().get(i);
            System.out.println(
                "Endereço " + (i + 1) + ": " +
                    endCliente.getLogradouro() + ", " + endCliente.getNumero() + " - " + endCliente.getComplemento() + ", " +
                    endCliente.getCidade() + " - " + endCliente.getUf() + "," + endCliente.getCep()
            );
            System.out.println("--------------------------------------------------------------");
        }
    }

    public static Cliente addClient() {

        Scanner sc = new Scanner(System.in);

        Cliente newClient;

        System.out.println("Adição de cliente e seus 3 endereços");
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


    public static Endereco addEndereco() {

        Scanner sc = new Scanner(System.in);

        System.out.println("");

        System.out.println("Qual o cep?");
        String cep = sc.nextLine();

        System.out.println("Qual o logradouro?");
        String logradouro = sc.nextLine();

        System.out.println("Qual o numero?");
        String numero = sc.nextLine();

        System.out.println("Qual o complemento?");
        String complemento = sc.nextLine();

        System.out.println("Qual o cidade?");
        String cidade = sc.nextLine();

        System.out.println("Qual o uf?");
        String uf = sc.nextLine();

        System.out.println("");

        return new Endereco(cep, logradouro, numero, complemento, cidade, uf);
    }

}
