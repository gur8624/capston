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
public class checkDTO {

    private Date ck_dtt;

    private String bol_cd;

    private String ck_reason;

    private String ck_nm;
}
