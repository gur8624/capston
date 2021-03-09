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
public class use_infoDTO {

    private Date use_dtt;

    private String chg_cd;

    private String use_rsvt;

    private Long use_payment;

    private Long use_chg_amt;

    private String u_id;
}
