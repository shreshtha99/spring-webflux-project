package com.springwebfluxproject.springwebfluxproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {

@Id
    private int did;
    private String docname;
    private String city;
    private int status;
    private int pid;
}
