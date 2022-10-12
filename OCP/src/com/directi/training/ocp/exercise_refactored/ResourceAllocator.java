package com.directi.training.ocp.example_refactored;

import java.util.List;

public class AreaCalculator
{
    public void free(List<Resource> shapes)
    {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        System.out.println("total area = " + area);
    }
}
