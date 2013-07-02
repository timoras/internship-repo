package lt.timoras.servlets;

import com.google.common.collect.Lists;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PetsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("pets", Lists.newArrayList("dog", "cat", "goldem fish", "hamster"));
        req.getRequestDispatcher("/thymeleaf/pets").forward(req, resp);
    }

}
