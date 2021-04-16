package dataaccesslayer;

import models.logModel;
import models.tourModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class database implements dataAccess{

    private String connectionString;

    public database(){
        //get info from config file
        connectionString = "...";
        //establish DB connection
    };

    @Override
    public List<tourModel> GetTourItems() {
        tourModel[] tourModels = {
                new tourModel("Tour 1", "Vienna to Lower Austria", "2 Days Tour", 170),
                new tourModel("Tour 2", "Vienna to Upper Austria", "4 Days Tour", 220),
                new tourModel("Tour 3", "Vienna to Salzburg", "10 Days Tour", 330)
        };
        return new ArrayList<tourModel>(Arrays.asList(tourModels));
    }

    @Override
    public List<logModel> GetLogItems() {
        logModel[] logModels = {
                new logModel("Tour 1", "16-02-2021","It was fun.","170 km", "27 Hours", 8,"15km/h",
                        "It was cloudy",12,"Floridsdorf", "Buchbach"),
                new logModel("Tour 1", "08-04-2021","It was okay.","170 km", "29 Hours", 8,"17km/h",
                        "It was sunny and cloudy",12,"Floridsdorf", "Buchbach"),
                new logModel("Tour 3", "08-04-2021","It was super fun.","330 km", "230 Hours", 8,"14km/h",
                        "It was sunny and cloudy",25,"Floridsdorf", "Eugendorf"),
        };
        return new ArrayList<logModel>(Arrays.asList(logModels));
    }
}
