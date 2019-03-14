import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Scanner;

@WebServlet(name = "ServletBMI")
public class ServletBMI extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        class ServletBMIHttpServlet {



            protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                Float weight = Float.valueOf(request.getParameter("weight"));
                Float height = Float.valueOf(request.getParameter("height"));

                Float bmiIndex = ServletBMI.getIndex(weight, height);

                response.getWriter().append(bmiIndex.toString());

            }


        }
    }

    private static Float getIndex(Float weight, Float height) {


    }
    }
