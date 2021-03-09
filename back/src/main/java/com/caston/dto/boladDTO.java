package org.zerock.capston.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class boladDTO {

    private String bol_cd;

    private String chg_cd;

    private String bol_st;

    private String bol_setup_dt;
}
