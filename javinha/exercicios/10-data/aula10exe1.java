import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.ZoneId;

public class aula10exe1 {
    public static void main(String[] args){
        //LocalDate hoje = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
    
        LocalTime agora = LocalTime.now(ZoneId.of("America/Sao_Paulo"));

        // System.out.println("Hoje é: " + hoje.format(formato));
        System.out.println("Horario: " + agora.format(formato));
    }
}
