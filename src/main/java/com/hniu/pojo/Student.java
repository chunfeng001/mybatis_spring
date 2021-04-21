package com.hniu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private  Integer id;
    private  String name;
    private  Integer age;
    private  String stuPhone;
    private  String address;
    private BigDecimal money;
}
