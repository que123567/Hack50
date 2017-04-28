package com.example.smaug.hack50.part_1;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.example.smaug.hack50.R;


//hack4 preference
public class Preference extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.xml);
    }


}
