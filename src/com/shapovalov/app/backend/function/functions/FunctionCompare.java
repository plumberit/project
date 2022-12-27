package com.shapovalov.app.backend.function.functions;

import com.shapovalov.app.backend.function.functions.utils.CountryDemonstrate;
import com.shapovalov.app.data.Countries;
import com.shapovalov.app.model.Country;
import com.shapovalov.app.model.Result;

import java.util.ArrayList;

public class FunctionCompare implements FunctionLogic {


    @Override
    public Result handle() {
        return null;
    }

    @Override
    public Result handle(ArrayList<String> parameters) {
        String country1name = parameters.get(0);
        String country2name = parameters.get(1);
        Country country1 = null;
        Country country2 = null;

        for (Country country : Countries.countries) {
            if (country.getName().equals(country1name)) {
                country1 = country;
            }
             else if (country.getName().equals(country2name)) {
                country2 = country;
            }
        }

        if(country1 == null || country2 == null) {
            Result result = new Result();
            result.getStrokes().add("Country name is invalid.");
            result.setError(true);
            return result;
        }

        CountryDemonstrate tool = new CountryDemonstrate();
        ArrayList<String> country1strokes = tool.format(country1);
        ArrayList<String> country2strokes = tool.format(country2);

        Result result = new Result();
        for (int i = 0; i < country1strokes.size(); i++) {
            result.getStrokes().add(country1strokes.get(i));
        }
        result.getStrokes().add("");
        for (int i = 0; i < country2strokes.size(); i++) {
            result.getStrokes().add(country2strokes.get(i));
        }
        result.getStrokes().add("");
        ArrayList<String> strokes = compare(country1, country2);
        for (int i = 0; i < strokes.size(); i++) {
            result.getStrokes().add(strokes.get(i));
        }

        return result;
    }
    // COMPARE [Spain] [Germany]


    private ArrayList<String> compare(Country country1, Country country2) {
        float populationDivision =
                (float) country1.getPopulation() / country2.getPopulation();
        CompareStatus populationStatus = exp(populationDivision);

        float squareDivision =
                (float) country1.getSquare() / country2.getSquare();
        CompareStatus squareStatus = exp(squareDivision);

        float GDPDivision =
                (float) country1.getGDP() / country2.getGDP();
        CompareStatus GDPStatus = exp(GDPDivision);


        ArrayList<String> strokes = new ArrayList<>();
        strokes.add(country1.getName() + " to " + country2.getName());
        strokes.add("");
        strokes.add("Population " + populationStatus.relation
        + " in " + populationStatus.difference);
        strokes.add("Square " + squareStatus.relation
                + " in " + squareStatus.difference);
        strokes.add("GDP " + GDPStatus.relation
                + " in " + GDPStatus.difference);

        return strokes;
    }


    private CompareStatus exp(float division) {
        boolean isBigger=false;
        if(division<1) {
            isBigger = false;
        } else if (division > 1) {
            isBigger = true;
        }

        float difference = division;
        byte percent = 0;
        if(!isBigger) {
            difference = (float) 1 / division;
            percent = (byte) ( 100 / difference);
        }
        CompareStatus status = new CompareStatus(isBigger, difference, percent);
        return status;
    }



    private class CompareStatus {
        final String [] relations = {"smaller", "bigger"};
        final String relation;
        final boolean isBigger;
        final String difference;

        CompareStatus(boolean isBigger, float difference, byte percent) {
            this.isBigger = isBigger;
            if (!isBigger) {
                relation = relations[0];
                this.difference = String.format("%.2f",difference)
                + " (" + String.valueOf(percent) + "%)";
            } else {
                relation = relations[1];
                this.difference = String.format("%.2f",difference);
            }
        }
    }

}