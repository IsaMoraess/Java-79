package estu;

public class aluno {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public double NotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double PontosFalta() {
       if (NotaFinal() < 12.0) {
           return 12.0 - NotaFinal();
        }
        else {
           return 0.0;
        }
    }
}
