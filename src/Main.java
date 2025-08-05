import models.Funcionario;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Funcionario funcionarioNovo = new Funcionario( "Telma", "45678258-78", "Zeladora", "2020-10-25", "1988-04-21", "12345/123", 45000.00);

        //funcionarioNovo.setNome("Rafael");

        //funcionarioNovo.setCpf("123456789-78");

        //System.out.println(funcionarioNovo.getNome());
        //System.out.println(funcionarioNovo.getCpf());
        //funcionarioNovo.salarioBase = 45000.00;
        //System.out.println("Salario R$: "+funcionarioNovo.salarioBase);

        System.out.println(funcionarioNovo.imprimirFuncionario());

        ArrayList<Funcionario> func = new ArrayList<Funcionario>();
        func.add(funcionarioNovo);

        System.out.println(func.get(0));

        //Funcionario newFuncionario = new Funcionario();
    }
}