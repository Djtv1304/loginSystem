package com.loginUsers.login.Repository;

import com.loginUsers.login.Document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer>{

    User findUserByUsuarioEstudiante(String usuarioEstudiante);

}
