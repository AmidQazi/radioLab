package com.example.radiolab

import com.example.radiolab.R
import com.example.radiolab.RadioStation


/**
 * [Datasource] generates a list of [RadioStation]
 */
class DataSource() {

    fun loadRadioLab(): List<RadioStation> {
        return listOf<RadioStation>(
            RadioStation(0, R.string.radiost1_name, R.string.radiost1_link, R.drawable.comedy),
            RadioStation(0, R.string.radiost2_name, R.string.radiost2_link, R.drawable.jazz),
            RadioStation(0, R.string.radiost3_name, R.string.radiost3_link, R.drawable.pop),
            RadioStation(0, R.string.radiost4_name, R.string.radiost4_link, R.drawable.rock),
            RadioStation(0, R.string.radiost5_name, R.string.radiost5_link, R.drawable.rap))
    }
}
