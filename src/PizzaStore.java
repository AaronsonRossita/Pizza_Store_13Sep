import Gifts.Surprisable;

import java.util.ArrayList;

public abstract class PizzaStore {

    private int id;
    private String name;
    private int numberOfEmployees;
    private ArrayList<Employee> listOfEmployees;
    private String phoneNumber;
    private int rank;

    public PizzaStore(int id, String name, int numberOfEmployees, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.listOfEmployees = new ArrayList<>();
        this.phoneNumber = phoneNumber;
        this.rank = calculateRank();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRank() {
        return rank;
    }

    public void setRank() {
        this.rank = calculateRank();
    }

    public void setRangedRank(int range){
        this.rank = calculateRangedRank(range);
    }

    public double calculateEmployeeExpenses(){
        double sum = 0;
        for(Employee e : this.listOfEmployees){
            sum += e.getSalary();
        }
        return sum;
    }

    public void hireEmployee(Employee e){
        if(listOfEmployees.size() < numberOfEmployees){
            if(listOfEmployees.contains(e)){
                System.out.println(e.getFirstName() + " already works here");
            }else{
                listOfEmployees.add(e);
                System.out.println(e.getFirstName() + " started working here");
            }
        }else{
            System.out.println("Sorry no jobs available");
        }
    }

    public void fireEmployee(Employee e){
        if(listOfEmployees.contains(e)){
            listOfEmployees.remove(e);
            removeSurprise(e);
            System.out.println(e.getFirstName() + " doesn't work here anymore");
        }else{
            System.out.println("Can't fire somebody who doesn't work here");
        }
    }

    public void giveSurprise(Employee employee, Surprisable surprise){
        employee.setSurprise(surprise);
    }

    public void removeSurprise(Employee employee){
        employee.setSurprise(null);
    }

    public abstract int calculateRank();
    public abstract int calculateRangedRank(int range);
}


