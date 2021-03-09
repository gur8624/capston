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
public class rsvtDTO {

    private Date rsvt_dtt;

    private String chg_cd;

    private String rsvt_start;

    private String rsvt_end;

    private String rsvt_cancel;

    private String u_id;
}
