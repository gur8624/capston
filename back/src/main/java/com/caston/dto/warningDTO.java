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
public class warningDTO {

    private Date w_dt;

    private String w_cat;

    private String w_reason;

    private String w_content;

    private String u_id;
}
