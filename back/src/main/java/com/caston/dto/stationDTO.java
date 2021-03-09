package org.zerock.capston.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class stationDTO {

    private String stat_id;

    private String stat_nm;

    private String stat_addr;

    private String stat_p_free;

    private Long stat_p_fee;

    private String stat_note;

    private String stat_zcode;
}
