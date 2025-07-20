package com.ilouse.fraud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("fraudcheck")
@AllArgsConstructor
public class FraudController {

    private final FraudCheckService fraudCheckService;

    @GetMapping("{customerId}")
    public boolean isFraudster(@PathVariable("customerId") Integer customerId) {
        return fraudCheckService.isFraudulentCustomer(customerId);
    }
}
