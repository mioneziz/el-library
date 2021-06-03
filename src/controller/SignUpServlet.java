package controller;

import model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import Validator.RegistrationValidator;


@WebServlet(name = "SignUpServlet", value = "/register")

public class SignUpServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/view/registrationForm.jsp").forward(request,response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName=request.getParameter("firstname");
        String lastName=request.getParameter("lastname");
        String userName=request.getParameter("username");
        String password=request.getParameter("password");

            User user = new User();
            user.setFirstname(firstName);
            user.setLastname(lastName);
            user.setUsername(userName);
            user.setPassword(password);
            RegistrationValidator validator=new RegistrationValidator();
            validator.validation(user);





    }
}
