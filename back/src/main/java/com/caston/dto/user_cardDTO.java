package org.zerock.capston.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class user_cardDTO {

    private String agcy_id;

    private String u_id;

    private String uc_no;

    private String uc_issue_dt;

    private String uc_issue_nm;
}
