package ru.netology;

public class Radio {

    private int quantityStation = 10;
    private int currentStation;
    private int minStationNumber = 0;
    private int maxStationNumber = quantityStation - 1;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
        this.maxStationNumber = this.quantityStation - 1;
    }

    public Radio() {
    }


    // СТАНЦИИ
    public int getQuantityStation() {
        return quantityStation;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation >= maxStationNumber) {
            setCurrentStation(minStationNumber);
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation <= minStationNumber) {
            setCurrentStation(maxStationNumber);
        } else {
            currentStation = currentStation - 1;
        }

    }

    // ГРОМКОСТЬ
    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void upVolume() {
        if (currentVolume >= maxVolume) {
            setCurrentVolume(maxVolume);
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}