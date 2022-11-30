import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;

public class Customer implements Service {
    private String name;
    private String lastName;
    private Country country;
    private String email;
    private LocalDate dateOfBirth;

    public Customer(String name, String lastName, Country country, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.country = country;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int getAge() throws InputMismatchException{
        LocalDate myDate = getDateOfBirth();
        LocalDate localDate = LocalDate.now();
        return localDate.minusYears(myDate.getYear()).getYear();
    }


    @Override

    public Customer[] getSameCountry(Customer[]customers,String name)throws InputMismatchException {
        if (name.matches("[1-9]+")){
            throw new InputMismatchException("don't write number!!!");
        }

       int counter = 0;
        for (Customer customer : customers) {
            if(customer.getCountry().name().equals(name.toUpperCase())) counter++;
        }
        if(counter >= 2){
            Customer[] array = new Customer[counter];
            int i = 0;
            for (Customer customer : customers) {
                if(customer.getCountry().name().equals(name.toUpperCase()))
                    array[i++] = customer;
            }
            return array;
        }else return null;

    }
    @Override
    public Country[] sortCountry(Customer[] customers)throws RuntimeException {
        if(!country.name().matches("[a-zA-Za-яА-Я]*")){
            throw new RuntimeException("Don't write the symbols");

        }
        Country[]country=new Country[customers.length];
        int index=0;
        for (Customer customer1 : customers) {
            country[index]=customer1.country;
            index++;
        }Arrays.sort(country);


        return country;
    }

    @Override
    public Customer[] allCustomer(Customer[] customers) throws ArrayIndexOutOfBoundsException{
        if (customers.length>4) {
            throw new ArrayIndexOutOfBoundsException("There aren't more index");
        }

        for (Customer customer : customers) {

            return customers;
        } return null;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country=" + country +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
