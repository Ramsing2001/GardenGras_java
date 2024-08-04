package pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/buyProduct")
public class BuyProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");

        if (user == null) {
            // User is not logged in, redirect to login page
            session.setAttribute("redirectTo", "buyProduct?productId=" + request.getParameter("productId"));
            response.sendRedirect("login.jsp");
        } else {
            // User is logged in, redirect to payment page
            response.sendRedirect("payment.jsp");
        }
    }
}
