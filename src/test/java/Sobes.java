import java.time.LocalDate;

public class Sobes {

    public static void main(String[] args) {

        LocalDate ld =  LocalDate.parse("1600-06-01");
        ld=ld.plusMonths(1);
        System.out.println(ld);

    }
}
