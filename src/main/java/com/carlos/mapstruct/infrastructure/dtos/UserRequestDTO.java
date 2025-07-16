package com.carlos.mapstruct.infrastructure.dtos;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserRequestDTO {
    private String name;
    private String password;
    private String email;
}
