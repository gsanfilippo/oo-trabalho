package oo.trabalho;

import oo.trabalho.entity.Cargo;
import oo.trabalho.entity.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao1 {

    //Aplicação 1
    // - Crie dois funcionários do banco, um gerente e um atendente

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        //Usuario 1 Gerente
        funcionarios.add(addEmployee());

        //Usuario 2 Atendente
        funcionarios.add(addEmployee());

        System.out.println("Lista de funcionarios");

        for (int i = 0; i < funcionarios.toArray().length; i++) {
            Funcionario fCadastrado = funcionarios.get(i);
            System.out.println("Nome: " + fCadastrado.getNome());
            System.out.println("Cargo: " + fCadastrado.getCagro().getNome());
            System.out.println("Salario: " + fCadastrado.getSalario());
            System.out.println("------------------------------------------------------");
        }

    }

    public static Funcionario addEmployee() {

        Scanner sc = new Scanner(System.in);

        Funcionario newEmployee;

        //Cargos: gerente - atendente
        System.out.println("Adição de funcionario");
        System.out.println("");

        System.out.println("Qual o cargo?");
        String cargo = sc.nextLine();

        System.out.println("Qual o salario?");
        String salario = sc.nextLine();

        System.out.println("Qual o nome?");
        String nome = sc.nextLine();

        System.out.println("Qual o cpf?");
        String cpf = sc.nextLine();

        System.out.println("Qual o telefone?");
        String telefone = sc.nextLine();

        newEmployee = new Funcionario(new Cargo(cargo), Double.parseDouble(salario));
        newEmployee.setNome(nome);
        newEmployee.setCpf(cpf);
        newEmployee.setTelefone(telefone);

        System.out.println("");

        return newEmployee;
    }

}
