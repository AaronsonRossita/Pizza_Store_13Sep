import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,JobTitle.COOK,"A","AA","address",100, LocalDate.now());
        Employee e2 = new Employee(2,JobTitle.CASHIER,"B","BB","address",150, LocalDate.now());
        Employee e3 = new Employee(3,JobTitle.DELIVERY,"C","CC","address",200, LocalDate.now());
        Employee e4 = new Employee(4,JobTitle.JANITOR,"D","DD","address",100, LocalDate.now());
        Employee e5 = new Employee(5,JobTitle.CASHIER,"E","EE","address",150, LocalDate.now());
        Employee e6 = new Employee(6,JobTitle.COOK,"F","FF","address",200, LocalDate.now());

        PizzaHut pizzaHut = new PizzaHut(1,"TLV",10,"123");
        PizzaDominos pizzaDominos = new PizzaDominos(1,"TLV",10,"123");

        pizzaHut.hireEmployee(e1);
        pizzaHut.hireEmployee(e2);
        pizzaHut.hireEmployee(e3);

        pizzaDominos.hireEmployee(e4);
        pizzaDominos.hireEmployee(e5);
        pizzaDominos.hireEmployee(e6);

//        pizzaHut.setRank();
//        System.out.println("rank without range = " + pizzaHut.getRank());
//
//        e2.updateRankDate(LocalDate.of(2023, Month.SEPTEMBER,1));
//
//        pizzaHut.setRangedRank(10);
//        System.out.println("rank with range = " + pizzaHut.getRank());
//
//        pizzaDominos.setRank();
//        System.out.println("rank without range = " + pizzaDominos.getRank());
//
//        e5.updateRankDate(LocalDate.of(2023, Month.SEPTEMBER,1));
//
//        pizzaDominos.setRangedRank(10);
//        System.out.println("rank with range = " + pizzaDominos.getRank());












    }
}