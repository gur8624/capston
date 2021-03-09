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
public class reviewDTO {

    private Date re_reg_dtt;

    private String stat_id;

    private String re_content;

    private String re_writer;
}
