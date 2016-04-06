package com.javacodegeeks.android.apps.moviesearchapp.model;

import com.leansoft.nano.annotation.Element;
import com.leansoft.nano.annotation.RootElement;

import java.io.Serializable;

@RootElement(name = "OpenSearchDescription")
public class MovieSearchResult implements Serializable {

    private static final long serialVersionUID = -5992078345571261309L;

    @Element(name = "Query")
    public Query query;

    @Element
    public int totalResults;

    @Element(name = "movies")
    public MovieContainer movieContainer;

}
