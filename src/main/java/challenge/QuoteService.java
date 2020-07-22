package challenge;

import java.util.Optional;

public interface QuoteService {

	Quote getQuote();
	
	Optional<Quote> getQuoteByActor(String actor);

}
