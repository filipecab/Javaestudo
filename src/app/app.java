package app;
import java.util.Scanner;

import ent_ord.Ordem;

import java.util.Locale;
import poo.manipulados;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.Duration;
import java.util.Date;



public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        
        manipulados o=new manipulados(1080,new Date(),Ordem.AGUARDANDO_PAGAMENTO);

        System.out.println(o);
        Ordem o1= Ordem.valueOf("AGUARDANDO_PAGAMENTO");
        Ordem o2=Ordem.AGUARDANDO_PAGAMENTO;

        

        System.out.println(o1);
        System.out.println(o2);
        sc.close();
    }

    


}
