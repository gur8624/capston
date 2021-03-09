package org.zerock.capston.dto;

import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class userDTO {

    private String u_id;

    private String u_email;

    private String u_pwd;

    private String u_phone;

    private Date u_reg_dt;
}
