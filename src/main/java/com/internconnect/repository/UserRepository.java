package com.internconnect.repository;
import com.internconnect.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);

    List<User> findByNameAndAddress(String name, String address);


    Optional<User> findById(Long id);


}
