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
        funcionario func=new funcionario();
        

        while(true){

            System.out.println("Quantos funcionarios deseja cadastrar: ");
            int quant=sc.nextInt();

            for (int i=0;i<=quant;i++){
                System.out.println("digite o nome do funcionario n"+i+1);
                String nome=sc.nextLine();
                System.out.println("qual o salario do seu funcionario?");
                double sal=sc.nextDouble();
                System.out.println("digite o departamento: ");
                String dep=sc.next();
                
                System.out.println("Digite: 1 junior,2 Mid_level,3 senior");
                int opc=sc.nextInt();
               
                if (opc==1){
                    String nivel="JUNIOR";
                    func=new funcionario(nome, Enumerados.JUNIOR, sal, dep);
                }
                else if(opc==2){
                    String nivel="MID_LEVEL";
                    func=new funcionario(nome, Enumerados.valueOf(nivel), sal, dep);

                }
                else if(opc==3){
                    String nivel="SENIOR";
                    func=new funcionario(nome, Enumerados.valueOf(nivel), sal, dep);
                }
                else{
                    System.out.println("tente novamente!");
                    i=i-1;
                }
                


            }
            
            



            sc.close();
        }
        
    }
        
       
        

    


}
