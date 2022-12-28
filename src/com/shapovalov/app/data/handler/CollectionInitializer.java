package com.shapovalov.app.data.handler;

import com.shapovalov.app.data.Functions;
import com.shapovalov.app.model.functional.entities.Function;
import org.json.simple.JSONObject;

import java.util.ArrayList;


public class CollectionInitializer {

    public void initialize(JSONObject obj) {

        CountriesInitializer init = new CountriesInitializer();
        init.initialize(obj);
        fillCommands();
    }


    private void fillCommands() {
        Functions.functions.add(new Function("COMPARE",
                "команда для сравнения стран и союзов",
                new ArrayList<>()));
        Functions.functions.get(0).getExamples().add("COMPARE [Country 1] [Country 2]");
        Functions.functions.get(0).getExamples().add("COMPARE [Switzerland] [Turkey]");
        Functions.functions.get(0).getExamples().add("COMPARE [Country 1] [Unit 1]");
        Functions.functions.get(0).getExamples().add("COMPARE [Great Britain] [Unit of Gas]");
        Functions.functions.get(0).getExamples().add("COMPARE [Unit 1] [Unit 2]");
        Functions.functions.get(0).getExamples().add("COMPARE [Unit of Gas] [Ocean Unit]");


        Functions.functions.add(new Function("CREATE UNION",
                "команда для создания союза",
                new ArrayList<>()));
        Functions.functions.get(1).getExamples().add("CREATE UNION [union_name] [Country 1] [Country 2] [Country 3]");
        Functions.functions.get(1).getExamples().add("CREATE UNION [Ocean Unit] [Singapore] [Malaysia] [Indonesia]");


        Functions.functions.add(new Function("DELETE UNION",
                "команда для удаления союза",
                new ArrayList<>()));
        Functions.functions.get(2).getExamples().add("DELETE UNION [union_name]");
        Functions.functions.get(2).getExamples().add("DELETE UNION [Unit of Gas]");


        Functions.functions.add(new Function("DETAIL",
                "команда для отображения детальной информации о стране или союзе",
                new ArrayList<>()));
        Functions.functions.get(3).getExamples().add("DETAIL [country_name]");
        Functions.functions.get(3).getExamples().add("DETAIL [Italy]");
        Functions.functions.get(3).getExamples().add("DETAIL [unit_name]");
        Functions.functions.get(3).getExamples().add("DETAIL [Unit of Gas]");


        Functions.functions.add(new Function("SHOW",
                "команда для отображения всех стран и созданных союзов",
                new ArrayList<>()));
        Functions.functions.get(4).getExamples().add("SHOW");
    }

}
