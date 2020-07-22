package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		return repository.findRandomQuote().get();
	}


	public Optional<Quote> getQuoteById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Optional<Quote> getQuoteByActor(String actor) {
		System.out.println(repository.findByActor(actor).size());

		Random rand = new Random();
		Quote randomElement = repository.findByActor(actor).get(rand.nextInt(repository.findByActor(actor).size()));

		return Optional.of(randomElement);
	}

}
