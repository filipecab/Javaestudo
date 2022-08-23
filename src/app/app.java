package app;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.Duration;
import java.util.Date;
import entidades.Cliente;




public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        LocalDate data=LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        
       
        sc.close();
    }

    


}
