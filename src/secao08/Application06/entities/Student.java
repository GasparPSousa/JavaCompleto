package secao08.Application06.entities;

public class Student {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double media() {
        return ((this.nota1 + this.nota2 + this.nota3) / (30 + 35 + 35)) * 100;
    }

    public void status() {
        if (media() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS %n", (60 - media()));
        }
    }
}
