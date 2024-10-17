package org.example.Exo2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class FibTest {
    private Fib fib;

    @Test
    public void whenGetFibSeries_Range1_Then_ResultNotNull() {
        // Arrange
        fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse(result.isEmpty());
    }

    @Test
    public void whenGetFibSeries_Range1_Then_ResultArray0() {
        // Arrange
        fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertArrayEquals(new Integer[]{0}, result.toArray());
    }

    @Test
    public void whenGetFibSeries_Range6_Then_ResultContainsNumber3() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertTrue(result.contains(3));
    }

    @Test
    public void whenGetFibSeries_Range6_Then_ResultContains6Elements() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertEquals(6, result.size());
    }

    @Test
    public void whenGetFibSeries_Range4_Then_ResultNotContainsNumber4() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse(result.contains(4));
    }

    @Test
    public void whenGetFibSeries_Range4_Then_ResultArray0_1_1_2_3_5() {
        // Arrange
        fib = new Fib(6);
        List<Integer> resultAwait = List.of(0, 1, 1, 2, 3, 5);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertArrayEquals(resultAwait.toArray(), result.toArray());
    }

    @Test
    public void whenGetFibSeries_Range4_Then_ResultIsOrderAscending() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        List<Integer> resultInOrderAsc = result;
        Collections.sort(resultInOrderAsc);

        // Assert
        Assert.assertArrayEquals(resultInOrderAsc.toArray(), result.toArray());
    }
}
