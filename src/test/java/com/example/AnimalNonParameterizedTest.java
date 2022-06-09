package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class AnimalNonParameterizedTest {

    @Test
    public void getFamilyReturnCorrectDescription() {

        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        String actual = animal.getFamily();

        Assert.assertEquals(expected, actual);

    }

    @Test(expected = Exception.class)
    public void getFoodForUnknownAnimalThrowsException() throws Exception {

        Animal animal = new Animal();
        List<String> actual = animal.getFood("Недопустимое значение");

    }

}