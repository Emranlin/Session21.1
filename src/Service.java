import java.time.LocalDate;

public interface Service {
    int getAge();
    Customer[] getSameCountry(Customer[] customers,String name);
    Country[] sortCountry(Customer[]customers);
    Customer[]allCustomer(Customer[]customers);
}
