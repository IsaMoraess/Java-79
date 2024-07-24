import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

   estu.aluno estudante = new estu.aluno();
   System.out.print("NOME: ");
   estudante.name = sc.nextLine();

   System.out.print("NOTA 1: ");
   estudante.nota1 = sc.nextDouble();

   System.out.print("NOTA 2: ");
   estudante.nota2 = sc.nextDouble();

   System.out.print("NOTA 3: ");
   estudante.nota3 = sc.nextDouble();

   System.out.printf("NOTA FINAL: %.2f%n", estudante.NotaFinal());

   if (estudante.NotaFinal() < 12.0) {
       System.out.println("RECUPERAÇÃO " +estudante.name);
       System.out.printf("PONTOS QUE FALTA: %.2f%n", estudante.PontosFalta());
    }else {
       System.out.println("PASSOU o(a)" +estudante.name);
   }

   } 
}
