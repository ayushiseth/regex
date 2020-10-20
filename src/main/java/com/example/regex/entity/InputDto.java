package com.example.regex.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InputDto {

    private String regex;
    private String textBody;
    
}
