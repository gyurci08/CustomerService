package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Client;
import repository.ClientRepository;
import repository.CompanyRepository;
import repository.CustomerRepository;

import java.io.IOException;
import java.util.ArrayList;

public class ListServlet extends HttpServlet {

    private final CustomerRepository customerRepo = new CustomerRepository();
    private final CompanyRepository companyRepo = new CompanyRepository();

    private final ArrayList<Client> clients = new ArrayList<Client>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        clients.clear();
        clients.addAll(customerRepo.listAll());
        clients.addAll(companyRepo.listAll());

        req.setAttribute("clients", clients);
        req.getRequestDispatcher("/List.jsp").forward(req, resp);
    }

}