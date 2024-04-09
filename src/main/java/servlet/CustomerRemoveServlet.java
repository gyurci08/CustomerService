package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.CompanyRepository;
import repository.CustomerRepository;

import java.io.IOException;

import static java.lang.Integer.parseInt;

public class CustomerRemoveServlet extends HttpServlet {

    private CustomerRepository customerRepo = CustomerRepository;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = parseInt(req.getParameter("id"));

        customerRepo.remove(customerRepo.findById(id));

        resp.sendRedirect("list");
    }
}