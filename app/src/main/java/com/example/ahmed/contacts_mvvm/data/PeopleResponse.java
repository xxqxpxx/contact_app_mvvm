package com.example.ahmed.contacts_mvvm.data;

import com.example.ahmed.contacts_mvvm.model.People;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PeopleResponse {

    @SerializedName("results")
    private List<People> peopleList;

    public List<People> getPeopleList() {
        return peopleList;
    }
}
