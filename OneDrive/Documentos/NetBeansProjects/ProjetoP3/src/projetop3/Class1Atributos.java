package projetop3;

public class Class1Atributos implements Comparable <Class1Atributos>{
    private String cpf, nome;
    private int idade;
    private double deposito, saldo;
    public Class1Atributos(String cpf){
        this.cpf = cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setDeposito(double deposito){
        this.deposito = deposito;
    }
    public double getDeposito(){
        return this.deposito;
    }
    public void deposita(float valor) {// classe para cadastrar o deposito do cliente que alugou um carro
        saldo += valor;
    }
    @Override
    public int compareTo(Class1Atributos c) {
        return this.cpf.compareToIgnoreCase(c.getCpf());
    }
}
