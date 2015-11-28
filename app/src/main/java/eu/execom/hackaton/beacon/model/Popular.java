package eu.execom.hackaton.beacon.model;

import com.orm.SugarRecord;

/**
 * Created by Giannis on 28/11/2015.
 */
public class Popular extends SugarRecord<Popular> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Popular(String description, String name) {
        this.description = description;
        this.name = name;
    }

    private String name;
    private  String description;


}
