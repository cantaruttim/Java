package Especiais.src.app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // pega o fuso horário do sistema local
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2024-07-24");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-24T01:30:26");
        Instant d06 = Instant.parse("2024-07-24T01:30:26Z");
        Instant d07 = Instant.parse("2024-07-24T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2024 01:30", fmt2);
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 01, 30);

        System.out.println("d01 = " + d01);
        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);


        // convertendo uma data instant para um LocalDate
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r1 = " + r1);
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r2 = " + r2);
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        /*Para conferir os nomes disponíveis para ZoneIds basta rodar o for comentado abaixo ou 
         * confirme o arquivo .txt disponível.
         */

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        // for (String s : ZoneId.getAvailableZoneIds()) {
        //     System.out.println(s);
        // }


        System.out.println("----------------------------");

        // Extraindo partes de uma data
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("----------------------------");

        System.out.println("Cálculos com data e hora");
        System.out.println();

        LocalDate lastWeek = d01.minusDays(7);
        LocalDate nextWeek = d01.plusDays(7);

        LocalDateTime lastTime = d02.minusDays(7);
        LocalDateTime nextTime = d02.plusDays(7);

        Instant lastInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextInstant = d06.plus(7, ChronoUnit.DAYS);
        

        System.out.println("lastWeek = " + lastWeek);
        System.out.println("nextWeek = " + nextWeek);

        System.out.println("lastTime = " + lastTime);
        System.out.println("nextTime = " + nextTime);

        System.out.println("lastInstant = " + lastInstant);
        System.out.println("nextInstant = " + nextInstant);


        Duration t1 = Duration.between(lastTime, d02);
        System.out.println(t1);
        System.out.println(t1.toDays());

        // atTime converte um LocalDate para uma LocalDateTime  
        Duration t2 = Duration.between(lastWeek.atTime(0, 0), d01.atTime(0, 0));
        //System.out.println(t2);
        // convertendo para LocalDateTime
        System.out.println(t2.toDays());
        
        

    }
}
