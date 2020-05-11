package ru.netology.domain;

public class Radio {
    int currentStation;
    int currentVolume;

    public void nextStation (){
        if (currentStation == 9){
            currentStation = 0;
            return;
        }
        this.currentStation = ++currentStation;
    }

    public void prevStation (){
        if (currentStation == 0){
            currentStation = 9;
            return;
        }
        this.currentStation = --currentStation;
    }

    public void volumeUp (){
        if (currentVolume == 10){
            currentVolume = 10;
            return;
        }
        this.currentVolume = ++currentVolume;
        }

    public void volumeDown (){
        if (currentVolume == 0){
            currentVolume = 0;
            return;
        }
        this.currentVolume = --currentVolume;
        }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9){
            currentStation = 9;
        }
        if (currentStation < 0) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;

    }
}
