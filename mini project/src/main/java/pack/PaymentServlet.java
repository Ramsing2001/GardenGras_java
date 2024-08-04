package pack;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/payment")
public class PaymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");

        if (user == null) {
            // User is not logged in, redirect to login page
            session.setAttribute("redirectTo", "payment");
            response.sendRedirect("login.jsp");
        } else {
            // User is logged in, handle payment and address submission
            String cardNumber = request.getParameter("cardNumber");
            String expiryDate = request.getParameter("expiryDate");
            String cvv = request.getParameter("cvv");
            String address = request.getParameter("address");

            // Add logic to update the database with payment details and address

            // Redirect to a confirmation page
            response.sendRedirect("paymentConfirmation.jsp");
        }
    }
}

