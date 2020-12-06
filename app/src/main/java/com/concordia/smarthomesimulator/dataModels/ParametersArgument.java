package com.concordia.smarthomesimulator.dataModels;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * The type Parameters argument.
 */
public class ParametersArgument {
    private boolean status;
    private boolean awayMode;
    private int callTimer;
    private int temperature;
    private LocalDate date;
    private LocalTime time;
    private int winterStart;
    private int winterEnd;
    private int summerStart;
    private int summerEnd;
    private LocalTime minLightsTime;
    private LocalTime maxLightsTime;

    /**
     * Instantiates a new Parameters argument.
     */
    public ParametersArgument() {}

    /**
     * Gets status.
     *
     * @return the status
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * Is away mode boolean.
     *
     * @return the boolean
     */
    public boolean isAwayMode() {
        return awayMode;
    }

    /**
     * Gets call timer.
     *
     * @return the call timer
     */
    public int getCallTimer() {
        return callTimer;
    }

    /**
     * Gets temperature.
     *
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * Gets winter start.
     *
     * @return the winter start
     */
    public int getWinterStart() {
        return winterStart;
    }

    /**
     * Gets winter end.
     *
     * @return the winter end
     */
    public int getWinterEnd() {
        return winterEnd;
    }

    /**
     * Gets summer start.
     *
     * @return the summer start
     */
    public int getSummerStart() {
        return summerStart;
    }

    /**
     * Gets summer end.
     *
     * @return the summer end
     */
    public int getSummerEnd() {
        return summerEnd;
    }

    /**
     * Gets min lights time.
     *
     * @return the min lights time
     */
    public LocalTime getMinLightsTime() {
        return minLightsTime;
    }

    /**
     * Gets max lights time.
     *
     * @return the max lights time
     */
    public LocalTime getMaxLightsTime() {
        return maxLightsTime;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Sets away mode.
     *
     * @param awayMode the away mode
     */
    public void setAwayMode(boolean awayMode) {
        this.awayMode = awayMode;
    }

    /**
     * Sets call timer.
     *
     * @param callTimer the call timer
     */
    public void setCallTimer(int callTimer) {
        this.callTimer = callTimer;
    }

    /**
     * Sets temperature.
     *
     * @param temperature the temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }

    /**
     * Sets winter start.
     *
     * @param winterStart the winter start
     */
    public void setWinterStart(int winterStart) {
        this.winterStart = winterStart;
    }

    /**
     * Sets winter end.
     *
     * @param winterEnd the winter end
     */
    public void setWinterEnd(int winterEnd) {
        this.winterEnd = winterEnd;
    }

    /**
     * Sets summer start.
     *
     * @param summerStart the summer start
     */
    public void setSummerStart(int summerStart) {
        this.summerStart = summerStart;
    }

    /**
     * Sets summer end.
     *
     * @param summerEnd the summer end
     */
    public void setSummerEnd(int summerEnd) {
        this.summerEnd = summerEnd;
    }

    /**
     * Sets min lights time.
     *
     * @param minLightsTime the min lights time
     */
    public void setMinLightsTime(LocalTime minLightsTime) {
        this.minLightsTime = minLightsTime;
    }

    /**
     * Sets max lights time.
     *
     * @param maxLightsTime the max lights time
     */
    public void setMaxLightsTime(LocalTime maxLightsTime) {
        this.maxLightsTime = maxLightsTime;
    }
}