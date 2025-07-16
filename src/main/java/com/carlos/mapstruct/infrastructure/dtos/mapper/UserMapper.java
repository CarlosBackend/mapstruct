package com.carlos.mapstruct.infrastructure.dtos.mapper;


import com.carlos.mapstruct.infrastructure.dtos.UserRequestDTO;
import com.carlos.mapstruct.infrastructure.dtos.UserResponseEntityDTO;
import com.carlos.mapstruct.infrastructure.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(UserRequestDTO userRequestDTO);
    UserResponseEntityDTO toResponseEntityDTO(UserEntity userEntity);
}
