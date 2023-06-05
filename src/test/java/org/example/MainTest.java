package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void sout(){
        System.out.println("Test passed: ");
    }

    @Test(timeout = 1200)

    public void totalPriceFalse() {
        String ProductNumLine = "3";
        InputStream in1 = new ByteArrayInputStream(ProductNumLine.getBytes());
        System.setIn(in1);
       int ProductNumber = Integer.parseInt(ProductNumLine)-1;

        String amountLine = "3";
        InputStream in2 = new ByteArrayInputStream(amountLine.getBytes());
        System.setIn(in2);
        int amount = Integer.parseInt(amountLine);
        int[] prices = {30, 25, 60, 200, 120};
        int totalPrice = Main.TotalPrice(prices,ProductNumber, amount);
        assertEquals(180, totalPrice);
    }
    @Test(timeout = 900)

    public void totalPricePassed() {
        String ProductNumLine = "3";
        InputStream in1 = new ByteArrayInputStream(ProductNumLine.getBytes());
        System.setIn(in1);
        int ProductNumber = Integer.parseInt(ProductNumLine)-1;

        String amountLine = "3";
        InputStream in2 = new ByteArrayInputStream(amountLine.getBytes());
        System.setIn(in2);
        int amount = Integer.parseInt(amountLine);
        int[] prices = {30, 25, 60, 200, 120};
        int totalPrice = Main.TotalPrice(prices,ProductNumber, amount);
        assertEquals(50, totalPrice);
    }
}