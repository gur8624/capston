package org.zerock.capston.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class carDTO {

    private String car_cd;

    private String car_nm;

    private String car_rapidity;

    private String car_slow;

    private Blob car_img;
}
