package temp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Auth extends HttpServlet
	{
		private static final long serialVersionUID = 1L;

		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public Auth()
			{
				super();
				// TODO Auto-generated constructor stub
			}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException
			{

				String un = request.getParameter("txtun");
				String pass = request.getParameter("txtpwd");
				HttpSession session = request.getSession();
				session.setAttribute("sun", un);

				Authorization a1 = new Authorization();
				boolean flag = a1.Authorizeid(un, pass);
				if (flag == true)
					{
						response.sendRedirect("welcome.jsp");
					}
				//				if ((un != null) && (un != ""))
				//					{
				//						response.sendRedirect("welcome.jsp");
				//					}
				else
					{
						response.sendRedirect("failed.jsp");
					}

			}

	}
