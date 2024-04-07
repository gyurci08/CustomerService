package repository;

import model.Client;
import model.Company;

import java.util.ArrayList;
import java.util.List;

public class CompanyRepository implements ClientRepository<Company> {
    private ArrayList<Company> companys;


    public CompanyRepository() {
        if (this.companys == null)
        {
            this.companys = new ArrayList<>();
            String[] raw_customer = {"2;Google;Budapest"};

            for (String client : raw_customer)
            {
                String[] test = client.split(";");
                companys.add(new Company(Integer.parseInt(test[0]),test[1],test[2]));
            }

        }
    }

    @Override
    public List<Company> listAll() {
        return companys;
    }

    @Override
    public Company create(Company client) {
        companys.add(client);

        return null;
    }

    @Override
    public Company save(Company client) {
        return null;
    }

    @Override
    public Company update(Company client) {
        var company = findById(client);
        company = client;
        return company;
    }

    @Override
    public Company findById(Company client) {
        for(Company company : companys){
            if (client.getId() == company.getId())
                return company;
        }


        return null;
    }
}
