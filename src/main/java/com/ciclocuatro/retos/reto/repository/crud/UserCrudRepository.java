package com.ciclocuatro.retos.reto.repository.crud;

import com.ciclocuatro.retos.reto.model.User;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author Yeisi
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    public Optional <User> findByEmail(String email);

    public Optional<User> findByEmailAndPassword(String email, String password);

}
