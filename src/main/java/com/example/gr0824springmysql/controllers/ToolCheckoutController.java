package com.example.gr0824springmysql.controllers;

import com.example.gr0824springmysql.models.RentalAgreement;
import com.example.gr0824springmysql.services.ToolCheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToolCheckoutController {
    @Autowired
    private ToolCheckoutService toolCheckoutService;

    /**
     * api to create a rental agreement for checking out tools
     *
     * Tool code - See tool table above
     * Rental day count - The number of days for which the customer wants to rent the tool. (e.g. 4
     * days)
     * Discount percent - As a whole number, 0-100 (e.g. 20 = 20%)
     * Check out date
     * @return a generated RentalAgreement Object.
     */
    @PostMapping("api/toolCheckout")
    @ResponseBody
    public RentalAgreement toolCheckout(@RequestParam(name = "toolCode") String toolCode, @RequestParam(name = "rentalDayCount") int rentalDayCount, @RequestParam(name = "discountPercentage") int discountPercentage, @RequestParam(name = "checkoutDate") String checkoutDate) {
        return this.toolCheckoutService.getServiceAgreement(toolCode, rentalDayCount, discountPercentage, checkoutDate);
    }
}