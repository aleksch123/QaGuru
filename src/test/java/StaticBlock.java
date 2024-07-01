import java.time.LocalDate;

public class StaticBlock {

   public static final int year;
    static {
        year = LocalDate.now().getYear();
    }
}
