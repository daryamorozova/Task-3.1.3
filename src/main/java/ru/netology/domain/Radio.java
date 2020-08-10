package ru.netology.domain;

public class Radio {
    private int radiostationNumberMin = 0;
    private int radiostationNumberMax = 9;
    private int currentRadiostationNumber;

    public int nextRadiostation(int currentRadiostationNumber) {
        if (currentRadiostationNumber >= radiostationNumberMin & currentRadiostationNumber < radiostationNumberMax) {
            this.currentRadiostationNumber = currentRadiostationNumber + 1;
        }

        if (currentRadiostationNumber == radiostationNumberMax | currentRadiostationNumber < radiostationNumberMin) {
            this.currentRadiostationNumber = radiostationNumberMin;
        }

        if (currentRadiostationNumber > radiostationNumberMax) {
            this.currentRadiostationNumber = radiostationNumberMax;
        }

        return this.currentRadiostationNumber;
    }

    public int prevRadiostation(int currentRadiostationNumber) {
        if (currentRadiostationNumber > radiostationNumberMin & currentRadiostationNumber <= radiostationNumberMax) {
            this.currentRadiostationNumber = currentRadiostationNumber - 1;
        }

        if (currentRadiostationNumber == radiostationNumberMin | currentRadiostationNumber > radiostationNumberMax) {
            this.currentRadiostationNumber = radiostationNumberMax;
        }

        if (currentRadiostationNumber < radiostationNumberMin) {
            this.currentRadiostationNumber = radiostationNumberMin;
        }

        return this.currentRadiostationNumber;
    }


}
