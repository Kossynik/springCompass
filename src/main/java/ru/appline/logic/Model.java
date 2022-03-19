package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Model implements Serializable {
    private static final Model instance = new Model();

    private final Map<String, Compass> model;

    public Model() {
        model = new HashMap<String, Compass>();
    }

    public static Model getInstance() {
        return instance;
    }

    public void add(Compass compass, String side) {
        model.put(side, compass);
    }

    public Compass get(String side) {
        return model.get(side);
    }

}