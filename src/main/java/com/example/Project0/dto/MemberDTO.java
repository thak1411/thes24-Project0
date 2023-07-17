package com.example.Project0.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
