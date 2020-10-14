package com.concordia.smarthomesimulator.dataModels;

import android.graphics.drawable.Drawable;

public interface IDevice {

    /**
     * Gets opened icon.
     *
     * @return the opened icon
     */
    public Drawable getOpenedIcon();

    /**
     * Gets closed icon.
     *
     * @return the closed icon
     */
    public Drawable getClosedIcon();

    /**
     * Gets opened tint.
     *
     * @return the opened tint
     */
    public int getOpenedTint();

    /**
     * Gets closed tint.
     *
     * @return the closed tint
     */
    public int getClosedTint();

    /**
     * Gets is opened.
     *
     * @return the is opened
     */
    public boolean getIsOpened();

    /**
     * Sets is opened.
     *
     * @param isOpened the is opened
     */
    public void setIsOpened(boolean isOpened);
}