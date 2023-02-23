package transport;
public class Mechanic {
    private String name;
    private String surname;
    private String company;
    private Car dfas;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

        public void performMaintenance(Transport transport) {
            System.out.println("Механик " + surname + " " + name + " из компании " + company + " проводит техобслуживание автомобиля " + transport);
        }

        public void fixTheCar() {
            System.out.println("Механик " + surname + " " + name + " из компании " + company + " чинит машину!");
        }

        @Override
        public String toString() {
            return "Механик: " + surname + " " + name + " из компании " + company;
        }
    }