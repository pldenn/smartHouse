package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(10);
    @Test
    void shouldNextStation() {
        radio.setCurrentStation(8);

        radio.nextStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        radio.setCurrentStation(1);

        radio.prevStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldUnderStation() {
        radio.setCurrentStation(0);

        radio.prevStation();

        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void shouldOverStation() {
        radio.setCurrentStation(10);

        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldUnderLimitStation() {
        radio.setCurrentStation(-1);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldOverLimitStation() {
        radio.setCurrentStation(11);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldCurrentStation() {
        radio.setCurrentStation(5);

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldVolumeUp() {
        radio.setCurrentVolume(9);

        radio.volumeUp();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        radio.setCurrentVolume(1);

        radio.volumeDown();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeOver() {
        radio.setCurrentVolume(100);

        radio.volumeUp();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeUnder() {
        radio.setCurrentVolume(0);

        radio.volumeDown();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeCurrentOver() {
        radio.setCurrentVolume(101);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeCurrentUnder() {
        radio.setCurrentVolume(-2);

        assertEquals(0, radio.getCurrentVolume());
    }

}