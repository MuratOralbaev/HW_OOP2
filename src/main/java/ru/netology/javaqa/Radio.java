package ru.netology.javaqa;

public class Radio {
    private int currentRadiostation;

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int newCurrentRadiostation) {
        if (newCurrentRadiostation < 0) {
            return;
        }
        if (newCurrentRadiostation > 9) {
            return;
        }
        currentRadiostation = newCurrentRadiostation;
    }

    public void nextRadiostation(int newCurrentRadiostation) {
        currentRadiostation = newCurrentRadiostation;
        currentRadiostation = currentRadiostation >= 9 ? 0 : ++currentRadiostation;
    }

    /*public void nextRadiostation(int newCurrentRadiostation) {


    }*/

    public void prevRadiostation(int newCurrentRadiostation) {
        currentRadiostation = newCurrentRadiostation;
        currentRadiostation = currentRadiostation <= 0 ? 9 : --currentRadiostation;
    }

    /*public void setPrevRadiostation(int newCurrentRadiostation) {
        currentRadiostation = newCurrentRadiostation;

    }*/

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        currentVolume = currentVolume >= 100 ? 0 : ++currentVolume;
    }

    /*public void setIncreaseVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;

    }*/

    public void decreaseVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        currentVolume = currentVolume > 100 ? 0 : --currentVolume;
    }

    /*public void setDecreaseVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;

    }*/
}
