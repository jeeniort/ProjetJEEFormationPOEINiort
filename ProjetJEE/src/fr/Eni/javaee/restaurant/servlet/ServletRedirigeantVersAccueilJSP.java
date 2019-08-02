package fr.Eni.javaee.restaurant.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.Eni.javaee.restaurant.BusinessException;
import fr.Eni.javaee.restaurant.bll.RestaurantManager;
import fr.Eni.javaee.restaurant.bo.Restaurant;

/**
 * Servlet implementation class ServletRedirigeantVersAccueilJSP
 */
@WebServlet("/RedirigeAccueil")
public class ServletRedirigeantVersAccueilJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RestaurantManager restaurantManager = new RestaurantManager();
	public static Logger logger = Logger.getLogger("log");

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletRedirigeantVersAccueilJSP() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {

		super.init();
		try {
			FileHandler handler = new FileHandler("logs.log", true);
			handler.setFormatter(new SimpleFormatter() {
				private static final String format = "[%1$tF %1$tT] [%2$-7s] %3$s %n";

				@Override
				public synchronized String format(LogRecord lr) {
					return String.format(format, new Date(lr.getMillis()), lr.getLevel().getLocalizedName(),
							lr.getMessage());
				}
			});
			logger.addHandler(handler);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Restaurant> listeResto = new ArrayList<Restaurant>();

		try {
			listeResto = restaurantManager.SelectAll();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!listeResto.isEmpty()) {
			System.out.println(listeResto.toString());
			request.setAttribute("listeResto", listeResto);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/Accueil.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
