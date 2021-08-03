package com.springwebfluxproject.springwebfluxproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drug {
    @Id
    private int did;
    private String drug;

    private int price;
}
