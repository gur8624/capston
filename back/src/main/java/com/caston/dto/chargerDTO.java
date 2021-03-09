package org.zerock.capston.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class chargerDTO {

    private String chg_cd;

    private String chg_type;

    private String chg_lat;

    private String chg_lng;

    private String chg_use_time;

    private String chg_agcy_call;

    private String chg_st;

    private String chg_st_dt;

    private String chg_pwr_type;

    private String chg_rsvt;

    private String agcy_id;
}
