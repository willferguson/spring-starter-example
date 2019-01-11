package com.example.burritoservice;

public class WrappingService {

    private final String size;
    private final String meat;
    private final String salad;
    private final boolean guacamole;

    public WrappingService(String size, String meat, String salad, boolean guacamole) {

        this.size = size;
        this.meat = meat;
        this.salad = salad;
        this.guacamole = guacamole;
    }

    public Burrito wrap() {
        return new Burrito(size, meat, salad, guacamole);
    }





}
