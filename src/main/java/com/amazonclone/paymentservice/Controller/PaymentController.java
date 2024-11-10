package com.amazonclone.paymentservice.Controller;

import com.amazonclone.paymentservice.Dto.PaymentRequestDto;
import com.amazonclone.paymentservice.Services.IpaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private IpaymentService paymentService;

    @PostMapping
    public String getPaymentLink(@RequestBody PaymentRequestDto paymentRequestDto) {

        return "";
    }
}
