package javer.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplesOf3or5Test {

    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3or5().solution(10));
    }

    @Test
    public void shouldReturnCorrectSum(){
        //given
        int number = 15;
        //when
        int sum = new MultiplesOf3or5().solution2(number);
        //then
        assertEquals(45, sum);
    }

    @Test
    public void shouldReturnZeroWhenIsNegative(){
        //given
        int number = -2;
        //when
        int sum = new MultiplesOf3or5().solution2(number);
        //then
        assertEquals(0, sum);
    }
}