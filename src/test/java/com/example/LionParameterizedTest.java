package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expected;

    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    public LionParameterizedTest(String sex, boolean expected) {

        this.sex = sex;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void constructorForAvailableSexSetCorrectMane() throws Exception {

        Lion lion = new Lion(feline, sex);

        boolean actual = lion.doesHaveMane();

        Assert.assertEquals(expected, actual);

    }

}