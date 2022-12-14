package com.example.URLShorter.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class URL {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String shorturl;
    private String originalurl;


}
