package models;


public class Funcionario {
    private String cpf;
    private String nome;
    private String funcao;
    private String dataAdmissao;
    private String dataNascimento;
    private String numeroCTPS;
    public double salarioBase;

    //construtor

    //public Funcionario(){}

    public Funcionario(String nome, String cpf, String funcao, String dataAdmissao, String dataNascimento, String numeroCTPS, double salarioBase){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setFuncao(funcao);
        this.setDataAdmissao(dataAdmissao);
        this.setDataNascimento(dataNascimento);
        this.setNumeroCTPS(numeroCTPS);
        this.setSalarioBase(salarioBase);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    private void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    private void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private void setNumeroCTPS(String numeroCTPS) {
        this.numeroCTPS = numeroCTPS;
    }

    private void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    private void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getNumeroCTPS() {
        return numeroCTPS;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    /*@Override
    public String toString() {
        return "Funcionario " +
                "\nCpf= "+cpf+
                "\nNome= " +nome+
                "\nFuncao= " +funcao+
                "\nDataAdmissao= " +dataAdmissao+
                "\nDataNascimento= " +dataNascimento+
                "\nNumeroCTPS= " +numeroCTPS+
                "\nSalarioBase= " +salarioBase;
    }*/

    public String imprimirFuncionario(){
        return "Funcionario " +
                "\nCpf= "+cpf+
                "\nNome= " +nome+
                "\nFuncao= " +funcao+
                "\nDataAdmissao= " +dataAdmissao+
                "\nDataNascimento= " +dataNascimento+
                "\nNumeroCTPS= " +numeroCTPS+
                "\nSalarioBase= " +salarioBase;
    }
}
