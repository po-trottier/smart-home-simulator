package com.concordia.smarthomesimulator.activities.editMap;

import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.ViewModel;
import com.concordia.smarthomesimulator.R;
import com.concordia.smarthomesimulator.dataModels.*;
import com.concordia.smarthomesimulator.helpers.HouseLayoutHelper;

import java.util.ArrayList;

public class EditMapModel  extends ViewModel {

    private HouseLayout houseLayout;

    public EditMapModel() { }

    /**
     * Gets house layout.
     *
     * @return the house layout
     */
    public HouseLayout getHouseLayout() {
        return houseLayout;
    }

    /**
     * Sets house layout.
     *
     * @param houseLayout the house layout
     */
    public void setHouseLayout(HouseLayout houseLayout) {
        this.houseLayout = houseLayout;
    }

    /**
     * Update house layout name.
     *
     * @param name the name
     */
    public void updateHouseLayoutName(String name) {
        houseLayout.setName(name);
    }

    /**
     * Save house layout.
     *
     * @param context the context
     */
    public void saveHouseLayout(Context context) {
        if (HouseLayoutHelper.saveHouseLayout(context, houseLayout)){
            HouseLayoutHelper.updateSelectedLayout(context, houseLayout);
            Toast.makeText(context, context.getString(R.string.success_alert_save_layout), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, context.getString(R.string.error_unknown_alert_save_layout), Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Delete a house layout.
     *
     * @param context  the context
     * @param layouts  the list of currently available layouts
     * @param position the position of the layout to remove
     */
    public void deleteHouseLayout(Context context, ArrayList<HouseLayout> layouts, int position) {
        HouseLayoutHelper.removeHouseLayout(context, layouts.get(position));
        layouts.remove(position);
    }
}
