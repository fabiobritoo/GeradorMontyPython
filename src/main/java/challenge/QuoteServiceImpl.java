package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		if (repository.findRandomQuote().isPresent())
			return repository.findRandomQuote().get();
		else return  null;
	}


	@Override
	public Quote getQuoteByActor(String actor) {
		System.out.println(repository.findByActor(actor).size());

		Random rand = new Random();

		return repository.findByActor(actor).get(rand.nextInt(repository.findByActor(actor).size()));
	}

}
