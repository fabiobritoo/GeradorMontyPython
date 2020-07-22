package challenge;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.util.Streamable;

import java.util.List;
import java.util.Optional;


public interface QuoteRepository extends CrudRepository<Quote,Integer> {

    //Optional<Quote> findById(Integer id);


//    @Query(value = "select * from scripts s " +
//            "where actor = :actor "
//            , nativeQuery = true)

    @Query(value = "SELECT * FROM scripts" +
            " ORDER BY RAND()" +
            " LIMIT 1", nativeQuery = true)
    Optional<Quote> findRandomQuote();

//    @Query(value = "SELECT * FROM scripts" +
//            "  WHERE ACTOR = ?1"+
//            " ORDER BY RAND()" +
//            " LIMIT 1", nativeQuery = true)
//    Optional<Quote> findByActor(String actor);


    List<Quote> findByActor(String actor);

}
