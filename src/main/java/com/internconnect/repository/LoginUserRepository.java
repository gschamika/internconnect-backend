package com.internconnect.repository;
import com.internconnect.model.LoginUser;
import java.util.List;
import java.util.Optional;

public interface LoginUserRepository {
    List<LoginUser> findByName(String name);

    Optional<LoginUser> findById(Integer id);
}
