package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @BeforeEach
    public void setup() {
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
    }

    @Test
    public void shouldIncrease() {
        conditioner.setCurrentTemperature(29);
        conditioner.increaseCurrentTemperature();
        Assertions.assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotIncrease() {
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        Assertions.assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecrease() {
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        Assertions.assertEquals(15, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotDecrease() {
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        Assertions.assertEquals(15, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotSetUncorrectedMaxTemperature() {
        conditioner.setCurrentTemperature(15);
        conditioner.setCurrentTemperature(150);
        Assertions.assertEquals(15, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotSetUncorrectedMinTemperature() {
        conditioner.setCurrentTemperature(15);
        conditioner.setCurrentTemperature(1);
        Assertions.assertEquals(15, conditioner.getCurrentTemperature());
    }
}
