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
public class questionDTO {

    private Date q_dtt;

    private String q_content;

    private String q_cat;

    private String q_group;

    private String u_id;
}
