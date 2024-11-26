package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Wall wall1 = new Wall("Blue");
        Wall wall2 = new Wall("White");
        Wall wall3 = new Wall("White");
        Wall wall4 = new Wall("Gray");
        Ceiling ceiling = new Ceiling(15, PaintColor.GREEN);
        Bed bed = new Bed("King Size",2,2,2,2);
        Lamp lamp = new Lamp(LampType.LAVA, true, 2);
        Wardrobe wardrobe = new Wardrobe(2,2,2);
        Carpet carpet = new Carpet(2,2,PaintColor.GREEN);

        Bedroom myBedroom = new Bedroom(
                "Master Bedroom",
                wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet
        );
    }
}