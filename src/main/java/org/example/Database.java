package org.example;

import java.util.Collection;
public interface Database {
    void load();

    void save();

    public Collection<Entity> getAll();
}
