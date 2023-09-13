import java.lang.reflect.Array;
import java.util.ArrayList;

public class PizzaHut extends PizzaStore{

    public PizzaHut(int id, String name, int numberOfEmployees, String phoneNumber) {
        super(id, name, numberOfEmployees, phoneNumber);
    }

    @Override
    public int calculateRank() {
        int rank = 0;
        ArrayList<Employee> list = this.getListOfEmployees();
        if(!list.isEmpty()){
            for( Employee e : list ){
                rank += e.getPizzaRank();
            }
            return rank / list.size();
        }else{
            return 0;
        }

    }

    @Override
    public int calculateRangedRank(int range) {
        int rank = 0;
        ArrayList<Employee> list = this.getListOfEmployees();
        int size = list.size();
        if(!list.isEmpty()){
            for( Employee e : list ){
                int temp = Helper.calculateDays(e.getPizzaRankDate());
                if( temp == -1 || temp > range){
                    System.out.println(e.getFirstName() + " needs to update his score");
                    size--;
                }else{
                    rank += e.getPizzaRank();
                }
            }
            return rank / size;
        }else{
            return 0;
        }
    }
}
