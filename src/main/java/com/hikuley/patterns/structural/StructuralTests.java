package com.hikuley.patterns.structural;

import com.hikuley.patterns.structural.adapter.Employee;
import com.hikuley.patterns.structural.adapter.EmployeeClient;


import com.hikuley.patterns.structural.bridge.*;
import com.hikuley.patterns.structural.bridge.shape2_withBridge.*;
import org.junit.Test;

import java.util.List;

/**
 * Created by hikuley on 5/23/2017.
 */

public class StructuralTests {


    // converting for similar objects
    @Test
    public void adapterDesignPatternTest() {
        EmployeeClient employeeClient = new EmployeeClient();
        List<Employee> employeeList = employeeClient.getEmployeeList();
        System.out.println(employeeList);
    }


    @Test
    public void withoutBridgeDesignPatternTest() {
//        Circle circle = new BlueCircle();
//        Square square = new RedSquare();
//        Circle greenCircle = new GreenCircle();
//
//        circle.applyColor();
//        square.applyColor();
//        greenCircle.applyColor();
    }

    @Test
    public void withBridgeDesignPatternTest() {
        Color blue = new Blue();
        Color red = new Red();
        Color green = new Green();

        Circle blueCircle = new Circle(blue);
        Square redSquuare = new Square(red);
        Circle greenCircle = new Circle(green);

        blueCircle.applyColor();
        redSquuare.applyColor();
        greenCircle.applyColor();
    }

    @Test
    public void withBridgeDesignPatternTest2() {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setYear("2014");
        movie.setRuntime("2:15");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        Formatter htmlFormatter = new HtmlFormatter();
        Printer htmlPrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);
        String htmlMaterial = htmlPrinter.print(htmlFormatter);

        System.out.println(printedMaterial);
        System.out.println(htmlMaterial);
    }


}
