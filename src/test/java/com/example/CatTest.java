package com.example;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnCorrectSound() {

        Cat cat = new Cat(feline);
        String expected = "Мяу";

        String actual = cat.getSound();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getFoodReturnCorrectList() throws Exception {

        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Травушка", "Муравушка"));
        List<String> expected = List.of("Травушка", "Муравушка");

        List<String> actual = cat.getFood();

        Assert.assertEquals(expected, actual);

    }

}