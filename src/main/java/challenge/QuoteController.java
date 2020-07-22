package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

	@Autowired
	private QuoteService service;

	@GetMapping("/v1/quote")
	public Quote getQuote() {
		return service.getQuote();
	}

	@GetMapping("/v1/quote/{actor}")
	public Quote getQuoteByActor(String actor) {
		return service.getQuoteByActor(actor);
	}

}
