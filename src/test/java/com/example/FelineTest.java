package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatReturnCorrectList() throws Exception {

        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        List<String> actual = feline.eatMeat();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getFamilyReturnCorrectValue() {

        Feline feline = new Feline();
        String expected = "Кошачьи";

        String actual = feline.getFamily();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getKittensReturnCorrectNumber() {

        Feline feline = new Feline();
        int expected = 1;

        int actual = feline.getKittens();

        Assert.assertEquals(expected, actual);

    }

}