package ru.pashintsev.TestAB.rest.response;

import lombok.Data;

import java.util.HashMap;

@Data
public class Exchange {
    private String disclaimer;
    private String license;
    private String base;
    private HashMap<String, Double> rates;
}
