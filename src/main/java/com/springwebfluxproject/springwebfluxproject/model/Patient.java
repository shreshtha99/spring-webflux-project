package com.springwebfluxproject.springwebfluxproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {


    @Id
    private int pid;
    private int inid;
    private String name,city,pass;

}
