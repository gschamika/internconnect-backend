package com.internconnect.repository;
import com.internconnect.model.SystemUser;
import com.internconnect.model.University;

import java.util.List;
import java.util.Optional;

public interface SystemUserRepository {
    List<SystemUser> findByName(String name);

    Optional<SystemUser> findById(Integer id);
}
