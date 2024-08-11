package com.example.gr0824springmysql.services.implementations;

import com.example.gr0824springmysql.models.RentalAgreement;
import com.example.gr0824springmysql.services.ToolCheckoutService;
import org.springframework.stereotype.Service;

@Service
public class ToolCheckoutServiceImpl implements ToolCheckoutService {

    @Override
    public RentalAgreement getServiceAgreement(String toolCode, int rentalDayCount, int discountPercentage, String checkoutDate) {
        return RentalAgreement.builder().build();
    }
}
