import java.time.LocalDate;

public class PizzaDominos extends PizzaStore{

    public PizzaDominos(int id, String name, int numberOfEmployees, String phoneNumber) {
        super(id, name, numberOfEmployees, phoneNumber);
    }

    @Override
    public int calculateRank() {
        int rank = 0;
        for( Employee e : this.getListOfEmployees() ){
            rank += e.getPizzaRank();
        }
        return rank;
    }

    @Override
    public int calculateRangedRank(int range) {
        int rank = 0;
        for( Employee e : this.getListOfEmployees() ){
            int temp = Helper.calculateDays(e.getPizzaRankDate());
            if( temp == -1 || temp > range){
                System.out.println(e.getFirstName() + " needs to update his score");
            }else {
                rank += e.getPizzaRank();
            }
        }
        return rank;
    }


}
