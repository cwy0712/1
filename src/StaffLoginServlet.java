/**
 * Created by wenya on 30/1/2017.
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "StaffLoginServlet", urlPatterns = "/login")
public class StaffLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.print("=============================" + request + "=============================");

        String username = request.getParameter("username");
        String password =  request.getParameter("password");

        System.out.print( "OUTPUT==========================================================================================");

        try {
            StaffDAO s = new StaffDAO();


        System.out.print( "TEST" +s.validateLogin(username, password));

            if(!s.validateLogin(username, password)){

                Staff staff = s.getStaff(username);
                String name = staff.getName();

                request.setAttribute("username", name);
                getServletContext().getRequestDispatcher("login.jsp").forward(request, response);
            }
            else{
                request.setAttribute("username", username);
                request.setAttribute("password", password);
                getServletContext().getRequestDispatcher("fail.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            getServletContext().getRequestDispatcher("fail.jsp").forward(request, response);
        }


    }
}