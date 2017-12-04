package com.sbm.artemis.demo.jms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable{
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;


}
