package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		return repository.findById(2).get();
	}


	public Optional<Quote> getQuoteById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Optional<Quote> getQuoteByActor(String actor) {
		return repository.findByActor(actor);
	}

}
