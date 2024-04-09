package repository;

import model.Company;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ClientRepository<Customer> {
    private ArrayList<Customer> customers;


    public CustomerRepository() {
            this.customers = new ArrayList<>();
            String[] raw_customer = {"1;Mézga Aladár;Budapest"};

            for (String client : raw_customer)
            {
                String[] test = client.split(";");
                customers.add(new Customer(Integer.parseInt(test[0]),test[1],test[2]));
            }
    }

    @Override
    public List<Customer> listAll() {
        return customers;
    }

    @Override
    public Customer create(Customer client) {
        return null;
    }

    @Override
    public Customer remove(Customer client) {
        this.customers.remove(client);
        return null;
    }

    @Override
    public Customer save(Customer client) {
        return null;
    }

    @Override
    public Customer update(Customer client) {
        return null;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : this.customers) {
            if (id == customer.getId())
                return customer;
        }
        return null;
    }
}
