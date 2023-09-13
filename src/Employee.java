import Gifts.Surprisable;

import java.time.LocalDate;

public class Employee {

    private int id;
    private JobTitle jobTitle;
    private String firstName;
    private String lastName;
    private String address;
    private double salary;
    private LocalDate startDate;
    private int pizzaRank;
    private LocalDate pizzaRankDate;
    private Surprisable surprise;

    public Employee(int id,JobTitle title, String firstName, String lastName, String address, double salary, LocalDate startDate) {
        this.id = id;
        this.jobTitle = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.startDate = startDate;
        setPizzaRank();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getPizzaRank() {
        return pizzaRank;
    }

    public void setPizzaRank() {
        this.pizzaRank = (int)Math.floor(Math.random() * 100 + 1);
        setPizzaRankDate();
    }

    public LocalDate getPizzaRankDate() {
        return pizzaRankDate;
    }

    private void setPizzaRankDate() {
        this.pizzaRankDate = LocalDate.now();
    }

    public Surprisable getSurprise() {
        return surprise;
    }

    public void setSurprise(Surprisable surprise) {
        this.surprise = surprise;
    }

    public void updateRankDate(LocalDate date){
        this.pizzaRankDate = date;
    }
}


