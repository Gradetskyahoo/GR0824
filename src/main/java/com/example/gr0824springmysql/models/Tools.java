package com.example.gr0824springmysql.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tools {
    private int toolID;
    @NonNull
    private String toolCode;
    private int toolTypeID;
    @NonNull
    private String brand;
}
