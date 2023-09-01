package com.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Object> objects = new ArrayList<>();

    public void add(Object object) {
        objects.add(object);
    }

    public void render() {
        for (var object : objects) {
            if (object instanceof Shape shape)
                shape.render();
            else if (object instanceof Group group)
                group.render();
        }
    }
}
