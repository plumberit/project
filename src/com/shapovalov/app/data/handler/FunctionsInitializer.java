package com.shapovalov.app.data.handler;

import com.shapovalov.app.data.Functions;
import com.shapovalov.app.model.functional.entities.Function;

public class FunctionsInitializer {
    public void initialize() {
        Functions.FUNCTIONS.add(new Function( "COMPARE",
                "команда для сравнения стран и союзов"));
        Functions.FUNCTIONS.get(0).getExamples().add("COMPARE [Country 1] [Country 2]");
        Functions.FUNCTIONS.get(0).getExamples().add("COMPARE [Switzerland] [Turkey]");
        Functions.FUNCTIONS.get(0).getExamples().add("COMPARE [Country 1] [Unit 1]");
        Functions.FUNCTIONS.get(0).getExamples().add("COMPARE [Great Britain] [Unit of Gas]");
        Functions.FUNCTIONS.get(0).getExamples().add("COMPARE [Unit 1] [Unit 2]");
        Functions.FUNCTIONS.get(0).getExamples().add("COMPARE [Unit of Gas] [Ocean Unit]");



        Functions.FUNCTIONS.add(new Function( "CREATE UNION",
                "команда для создания союза"));
        Functions.FUNCTIONS.get(1).getExamples().add("CREATE UNION [union_name] : [Country 1] [Country 2] [Country 3]");
        Functions.FUNCTIONS.get(1).getExamples().add("CREATE UNION [Ocean Unit] : [Singapore] [Malaysia] [Indonesia]");


        Functions.FUNCTIONS.add(new Function( "DELETE UNION",
                "команда для удаления союза"));
        Functions.FUNCTIONS.get(2).getExamples().add("DELETE UNION [union_name]");
        Functions.FUNCTIONS.get(2).getExamples().add("DELETE UNION [Unit of Gas]");




        Functions.FUNCTIONS.add(new Function( "DETAIL",
                "команда для отображения детальной информации о стране или союзе"));
        Functions.FUNCTIONS.get(3).getExamples().add("DETAIL [country_name]");
        Functions.FUNCTIONS.get(3).getExamples().add("DETAIL [Italy]");
        Functions.FUNCTIONS.get(3).getExamples().add("DETAIL [unit_name]");
        Functions.FUNCTIONS.get(3).getExamples().add("DETAIL [Unit of Gas]");




        Functions.FUNCTIONS.add(new Function( "SHOW",
                "команда для отображения всех стран и созданных союзов"));
        Functions.FUNCTIONS.get(4).getExamples().add("SHOW");

    }
}
