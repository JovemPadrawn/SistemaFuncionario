import models.Funcionario;
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
        String funcao = JOptionPane.showInputDialog("Informe a sua função: ");
        String dataAdmissao = JOptionPane.showInputDialog("Informe a sua data de admissao: ");
        String dataNascimento = JOptionPane.showInputDialog("Informe a sua data de nascimento: ");
        String numeroCTPS = JOptionPane.showInputDialog("Informe seu numero CTPS: ");
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("informe seu salario base: "));

        if (nome != null && !nome.isEmpty() && cpf != null && !cpf.isEmpty() && funcao != null && !funcao.isEmpty() && dataAdmissao != null && !dataAdmissao.isEmpty() && dataNascimento != null && !dataNascimento.isEmpty() && numeroCTPS != null && !numeroCTPS.isEmpty()){
            Funcionario funcionarioNovo = new Funcionario(nome, cpf, funcao, dataAdmissao, dataNascimento, numeroCTPS, salarioBase);
            ArrayList<Funcionario> func = new ArrayList<Funcionario>();
            func.add(funcionarioNovo);
            System.out.println(func.get(0));

            JOptionPane.showMessageDialog(null, func.get(0));
        } else {
            JOptionPane.showMessageDialog(null, "um ou mais campos não foram preenchidos!");
        }
    }
}