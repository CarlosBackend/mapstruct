package com.carlos.mapstruct.infrastructure.bussines;

import com.carlos.mapstruct.infrastructure.dtos.mapper.UserMapper;
import com.carlos.mapstruct.infrastructure.dtos.UserRequestDTO;
import com.carlos.mapstruct.infrastructure.dtos.UserResponseEntityDTO;
import com.carlos.mapstruct.infrastructure.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    public UserResponseEntityDTO createUser(UserRequestDTO userRequestDTO){
        return mapper.toResponseEntityDTO(repository.save(mapper.toEntity(userRequestDTO)));
    }
}
