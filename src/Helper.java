import java.time.LocalDate;
import java.time.Period;

public class Helper {

    public static int calculateDays(LocalDate startDate){
        int temp = 0;
        LocalDate today = LocalDate.now();
        if(today.getYear() == startDate.getYear()){
            if(today.getMonth() == today.getMonth()){
                temp = today.getDayOfMonth() - startDate.getDayOfMonth();
            }else{
                temp = today.getDayOfYear() - startDate.getDayOfYear();
            }
        }else{
            temp = -1;
        }
        return temp;
    }

}
