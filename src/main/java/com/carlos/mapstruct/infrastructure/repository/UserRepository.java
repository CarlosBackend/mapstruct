package com.carlos.mapstruct.infrastructure.repository;

import com.carlos.mapstruct.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
