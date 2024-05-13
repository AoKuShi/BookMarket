package bookmarket;

import bookmarket_View.ConsoleView;
import bookmarket_controller.BookMarketController;
import bookmarket_model.BookStorage;
import bookmarket_model.Cart;

public class BookMarket {

	public static void main(String[] args) {
		// model 생성
		BookStorage bookStorage = new BookStorage();
		Cart cart = new Cart();
		
		// view 생성
		ConsoleView view = new ConsoleView();
		
		// controller 생성
		BookMarketController controller = new BookMarketController(bookStorage, cart, view);
		
		// controller.start()
		controller.start();
		
	}

}
