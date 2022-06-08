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

    @Test
    public void getFoodForUnknownAnimalThrowsException() throws Exception {

        Animal animal = new Animal();
        String expectedErrorMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

        Exception exception = null;

        try {
            List<String> actual = animal.getFood("Недопустимое значение");
        } catch (Exception ex) {
            exception = ex;
        }

        Assert.assertNotNull(exception);
        Assert.assertEquals(expectedErrorMessage, exception.getMessage());

    }

}