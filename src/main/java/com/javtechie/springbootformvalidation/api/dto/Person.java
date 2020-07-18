package com.javtechie.springbootformvalidation.api.dto;

import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Person
{
    @NotNull
    @Size(min = 2, max = 10, message = "Lenght should int between 2 to 10")
    private String name;

    @NotEmpty(message = "Email field shoulf not be empty")
    @Email(regexp = "^(.+)@(.+)$", message = "Invalid email id")
    private String email;

    @Pattern(regexp = "[7-9][0-9]{9}", message = "Invalid mobile number")
    @Size(max =10, message = "digit should be 10 ")
    private String mobile;
}
