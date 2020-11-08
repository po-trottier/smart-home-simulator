package com.concordia.smarthomesimulator.dataModels;

import androidx.annotation.NonNull;
import com.concordia.smarthomesimulator.R;
import com.concordia.smarthomesimulator.enums.DeviceType;
import com.concordia.smarthomesimulator.interfaces.IDevice;

import java.io.Serializable;

public class Light implements IDevice, Serializable {

    private boolean isOpened = false;
    private Geometry geometry;

    public Light() {
        geometry = new Geometry();
    }

    public Light(Geometry geometry) {
        this.geometry = geometry;
    }

    @Override
    public int getOpenedIcon() {
        return R.drawable.ic_lightbulb_on;
    }

    @Override
    public int getClosedIcon() {
        return R.drawable.ic_lightbulb_off;
    }

    @Override
    public int getOpenedTint() {
        return R.color.primary;
    }

    @Override
    public int getClosedTint() {
        return R.color.accent;
    }

    @Override
    public boolean getIsOpened() {
        return isOpened;
    }

    @Override
    public void setIsOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    @Override
    public Geometry getGeometry() {
        return geometry;
    }

    @Override
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @Override
    public DeviceType getDeviceType() {
        return DeviceType.LIGHT;
    }

    @NonNull
    @Override
    public IDevice clone() {
        Light copy = new Light(geometry);
        copy.setIsOpened(isOpened);
        return copy;
    }

    @Override
    public boolean equals(IDevice other) {
        return getDeviceType() == other.getDeviceType()
            && getIsOpened() == other.getIsOpened()
            && getGeometry().equals(other.getGeometry());
    }
}