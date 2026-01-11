package com.ngovantai.example0001.dto;

import com.ngovantai.example0001.entity.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private String username;
    private String password;
    private String fullName;
    private User.Role role;
    private String email;
    private String phone;
    private String imageUrl;
}
