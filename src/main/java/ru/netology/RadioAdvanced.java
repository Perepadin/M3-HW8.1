package ru.netology;

public class RadioAdvanced {
    private String name;
    private int currentStation = 0;
    private int MaxStation = 9;
    private int MinStation = 0;
    private int currentVolume = 0;
    private int MaxVolumeLevel = 10;
    private int MinVolumeLevel = 0;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
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

    public int getMaxStation() {
        return MaxStation;
    }

    public void setMaxStation(int maxStation) {
        MaxStation = maxStation;
    }

    public int getMinStation() {
        return MinStation;
    }

    public void setMinStation(int minStation) {
        MinStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public int getMaxVolumeLevel() {
        return MaxVolumeLevel;
    }

    public void setMaxVolumeLevel(int maxVolumeLevel) {
        MaxVolumeLevel = maxVolumeLevel;
    }

    public int getMinVolumeLevel() {
        return MinVolumeLevel;
    }

    public void setMinVolumeLevel(int minVolumeLevel) {
        MinVolumeLevel = minVolumeLevel;
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

    public void changeOnPreviousRadioStation() {
        if (currentStation == MinStation) {
            this.currentStation = 9;
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

    public boolean isOn() {
        return on;
    }
}
