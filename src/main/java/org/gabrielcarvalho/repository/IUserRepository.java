package org.gabrielcarvalho.repository;

import org.gabrielcarvalho.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long>{

    boolean existsByAccountNumber(String accountNumber);
}
