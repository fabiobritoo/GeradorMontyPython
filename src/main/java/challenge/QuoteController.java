package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("v1/quote")
public class QuoteController {

	@Autowired
	private QuoteServiceImpl service;

	@GetMapping
	public Quote getQuote() {

		return service.getQuote();
	}

	@GetMapping("/id/{id}")
	public Quote getQuotebyId(@PathVariable Integer id) {

		return service.getQuoteById(id).get();
	}

	@GetMapping("/{actor}")
	public Quote getQuoteByActor(String actor) {
		return service.getQuoteByActor(actor).get();
	}

}
