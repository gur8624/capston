package org.zerock.capston.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class boardDTO {

    private String car_cd;

    private Date b_dtt;

    private String b_title;

    private String b_content;

    private String u_id;
}
