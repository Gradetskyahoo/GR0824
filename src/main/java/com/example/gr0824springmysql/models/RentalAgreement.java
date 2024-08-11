package com.example.gr0824springmysql.models;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RentalAgreement {
    @NonNull
    public String tolCode;
    @NonNull
    public String toolType;
    @NonNull
    public String toolBrand;
    public int rentalDays;
    @NonNull
    public LocalDateTime checkoutDate;
    @NonNull
    public LocalDateTime dueDate;
    public double dailyRentalCharge;
    public int chargeDays;
    public double preDiscountCharge;
    public int discountPercent;
    public double discountAmount;
    public double finalCharge;
}
