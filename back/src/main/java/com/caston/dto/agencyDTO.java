package org.zerock.capston.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class agencyDTO {

    private String agcy_id;

    private String agcy_nm;

    private Long agcy_bs_r;

    private Long agcy_fee;

    private Long agcy_dc;

    private Blob agcy_card;

    private Date agcy_up_dtt;
}
