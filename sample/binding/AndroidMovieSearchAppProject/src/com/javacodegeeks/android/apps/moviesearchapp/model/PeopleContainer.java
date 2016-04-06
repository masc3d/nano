package com.javacodegeeks.android.apps.moviesearchapp.model;

import com.leansoft.nano.annotation.Element;

import java.util.List;

public class PeopleContainer {

    @Element(name = "person")
    public List<Person> personList;

}
