package ru.netology.domain;

import lombok.Data;

@Data
public class Radio {
    private int id;
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        this.currentStation = ++currentStation;
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        this.currentStation = --currentStation;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = ++currentVolume;
    }

    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = --currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
    }
}
