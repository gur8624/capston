package org.zerock.capston.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class fileDTO {

    private String f_no;

    private String b_no;

    private String f_ori_nm;

    private String f_sv_nm;

    private Long f_capacity;

    private String f_ext;
}
