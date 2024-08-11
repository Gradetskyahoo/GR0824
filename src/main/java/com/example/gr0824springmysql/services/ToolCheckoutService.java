package com.example.gr0824springmysql.services;

import com.example.gr0824springmysql.models.RentalAgreement;

public interface ToolCheckoutService {
    public RentalAgreement getServiceAgreement(String toolCode, int rentalDayCount, int discountPercentage, String checkoutDate);
}
