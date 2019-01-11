package com.example.burritoservice.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "burrito")
public class BurritoProperties {

    private String size;
    private String meat;
    private String salad;
    private boolean withGuacamole;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public boolean isWithGuacamole() {
        return withGuacamole;
    }

    public void setWithGuacamole(boolean withGuacamole) {
        this.withGuacamole = withGuacamole;
    }
}
