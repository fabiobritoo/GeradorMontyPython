package challenge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface QuoteRepository extends CrudRepository<Quote,Integer> {

    //Optional<Quote> findById(Integer id);


    @Query(value = "select * from scripts s " +
            "where actor = :actor "
            , nativeQuery = true)
    Optional<Quote> findByActor(String actor);

}
