package com.springwebfluxproject.springwebfluxproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id
    
    private int docid;
    private String docname;
}
