package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ListServlet extends HttpServlet {

    //private final PetService petService = new PetService();
    //private final ArrayList<Pet> pets = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //req.setAttribute("pets", pets);
        //req.getRequestDispatcher("/List.jsp").forward(req, resp);
    }

}