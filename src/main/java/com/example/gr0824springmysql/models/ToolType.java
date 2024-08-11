package com.example.gr0824springmysql.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ToolType {
    public int toolTypeId;
    @NonNull
    public String toolType;
    @NonNull
    public String dailyCharge;
    public boolean weekdayCharge;
    public boolean weekendCharge;
    public boolean holidayCharge;
}
