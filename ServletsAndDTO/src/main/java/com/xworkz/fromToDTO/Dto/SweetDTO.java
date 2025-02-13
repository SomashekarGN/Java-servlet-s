package com.xworkz.fromToDTO.Dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SweetDTO {

    private String sweetShopName;
    private String sweet;
    private String special;
    private double quantity;
    private double totalPrice;


}
