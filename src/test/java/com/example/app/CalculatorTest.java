package com.example.app;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testing Calculator")
public class CalculatorTest {

    @Test
    public void shouldAddNumbers() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 5);
        assertEquals(result, 7, "The result of 2 + 5 was not 7");
    }
}
