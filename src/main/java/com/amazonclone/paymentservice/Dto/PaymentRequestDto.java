package com.amazonclone.paymentservice.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequestDto {
    private String orderId;
    private String name;
    private String phoneNumber;
    private String email;
}
