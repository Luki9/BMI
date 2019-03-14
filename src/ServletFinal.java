import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletFinal")
public class ServletFinal extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


         class BMIService {

             private BMIService() {
                 //To avoid a new instance of BMIService class
             }

             public Float getIndex(Float weight, Float height) {
                 return weight / (height * height);
             }

             public String getDescription(Float bmiIndex) {

                 return "";
             }


         }