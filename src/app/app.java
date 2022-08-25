package app;
import java.util.Scanner;
import java.util.Locale;
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
        char perg='s';

        while(perg=='s'){

            System.out.println("departamento: ");
            String dep=sc.next();

            sc.nextLine();
            System.out.println("digite o nome do funcionario:");
            String nome=sc.nextLine();
            System.out.println("qual o salario do seu funcionario?");
            double sal=sc.nextDouble();
            
                
            System.out.println("Digite para: 1 junior, 2 Mid_level, 3 senior");
            int opc=sc.nextInt();
               
            if (opc==1){
                String nivel="JUNIOR";
                func=new funcionario(nome, Enumerados.valueOf(nivel), sal, new Cliente(dep));
                }
            else if(opc==2){
                    String nivel="MID_LEVEL";
                    func=new funcionario(nome, Enumerados.valueOf(nivel), sal, new Cliente(dep));

                }
            else if(opc==3){
                    String nivel="SENIOR";
                    func=new funcionario(nome, Enumerados.valueOf(nivel), sal, new Cliente(dep));
                }
            else{
                System.out.println("erro! tente novamente!");
                break;
            }
                System.out.println("digite a quantidade de contratos");
                int qunt_cont=sc.nextInt();

                for (int j=0;j<qunt_cont;j++){
                    System.out.print("dia: ");
                    int d=sc.nextInt();
                    System.out.println();
                    System.out.print("mes: ");
                    int m=sc.nextInt();
                    System.out.println();
                    System.out.print("ano: ");
                    int a=sc.nextInt();
                    LocalDate data=LocalDate.of(a,m ,d );
                    double valorPorHora=sc.nextDouble();
                    int hora=sc.nextInt();
                    horasContrato hr_cont=new horasContrato(data,valorPorHora,hora);
                    func.adcContrato(hr_cont);
                }

                System.out.println("Usuario cadastrado.");

                System.out.println("Entre com o mes e ano para calcular:");
                int mes=sc.nextInt();
                int ano=sc.nextInt();
                double valortotalhoras=func.totalValor(ano, mes);
                System.out.println("nome: "+func.getNome());
                System.out.println("departamento: "+func.getCliente().getName());
                System.out.println("valor total: "+mes+"/"+ano+": "+valortotalhoras);


                System.out.println("deseja parar s ou n?");
                perg=sc.next().charAt(0);
                if (perg=='n'){
                    break;
                }
            
            
            



            sc.close();
        }
        
    }
        
       
        

    


}
