package com.example.restdemo;

import java.util.ArrayList;
import java.util.List;

public class Port {
    List<Boat> boats = new ArrayList<>();

    public Boat add(Boat boat) {
        boats.add(boat);
        return boat;
    }
}
