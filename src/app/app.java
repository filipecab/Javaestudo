package app;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import entidades.Cliente;
import entidades.Enumerados;
import entidades.funcionario;
import entidades.horasContrato;




public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        String nome=sc.next();
        String nivel=sc.next();
        double salario=sc.nextDouble();

        String cliente=sc.next();

        LocalDate data=LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        
       
        sc.close();
    }

    


}
