package com.shapovalov.app.data;

import com.shapovalov.app.model.Country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Countries {
    public static List<Country> countries =
            new ArrayList<>();

    public static void toReadMode() {
        //set immutable
        countries = Collections.unmodifiableList(countries);
    }

}