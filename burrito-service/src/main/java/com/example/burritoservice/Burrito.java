package com.example.burritoservice;

public class Burrito {

    private final String size;
    private final String meat;
    private final String salad;
    private final boolean guacamole;

    public Burrito(String size, String meat, String salad, boolean guacamole) {

        this.size = size;
        this.meat = meat;
        this.salad = salad;
        this.guacamole = guacamole;
    }

    @Override
    public String toString() {
        return "Burrito{" + "size='" + size + '\'' + ", meat='" + meat + '\'' + ", salad='" + salad + '\'' + ", guacamole=" + guacamole + '}';
    }
}
