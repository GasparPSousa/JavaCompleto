package secao09.Application02ContaCorrente.entities;

public class ContaCorrente {

    private int numero;
    private String nomeTitular;
    private double saldo;
    private double taxa;


    public ContaCorrente(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
    }

    public ContaCorrente(int numero, String nomeTitular, double depositoInicial) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }


    public int getNumero() {
        return numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor + 5;
    }

}
