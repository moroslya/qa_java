package com.example;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionNonParameterizedTest {

    @Mock
    Feline feline;

    @Test
    public void constructorForUnknownSexThrowsException() throws Exception {

        String expectedErrorMessage = "Используйте допустимые значения пола животного - самей или самка";

        Exception exception = null;

        try {
            Lion lion = new Lion(feline, "Недопустимое значение");
        } catch (Exception ex) {
            exception = ex;
        }

        Assert.assertNotNull(exception);
        Assert.assertEquals(expectedErrorMessage, exception.getMessage());

    }

    @Test
    public void getKittensReturnCorrectNumber() throws Exception {

        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;

        int actual = lion.getKittens();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getFoodReturnCorrectList() throws Exception {

        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Травушка", "Муравушка"));
        List<String> expected = List.of("Травушка", "Муравушка");

        List<String> actual = lion.getFood();

        Assert.assertEquals(expected, actual);

    }

}