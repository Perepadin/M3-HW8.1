package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class RadioAdvanced {
    private int numbersOfStations = 10;
    private int currentStation = 0;
    private int MaxStation = numbersOfStations;
    private int MinStation = 0;
    private int currentVolume = 0;
    private int MaxVolumeLevel = 100;
    private int MinVolumeLevel = 0;

    public RadioAdvanced(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > MaxStation) {
            return;
        }
        if (currentStation < MinStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void changeOnPreviousRadioStation() {
        if (currentStation == MinStation) {
            this.currentStation = 10;
            return;
        }
        this.currentStation--;
    }

    public void changeOnNextRadioStation() {
        if (currentStation == MaxStation) {
            this.currentStation = 0;
            return;
        }
        this.currentStation++;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > MaxVolumeLevel) {
            return;
        }
        if (currentVolume < MinVolumeLevel) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUpForOne() {

        if (currentVolume == MaxVolumeLevel) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < MaxVolumeLevel) {
            this.currentVolume++;
        }
    }

    public void volumeDownForOne() {
        if (currentVolume == MinVolumeLevel) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > MinVolumeLevel) {
            this.currentVolume--;
        }
    }
}