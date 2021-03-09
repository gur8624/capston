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
public class replyDTO {

    private Date r_dtt;

    private String b_no;

    private String r_content;

    private String r_writer;

    private Date r_dt;
}
