import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트를 진행합니다.
    @Test
    public void addTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,10);
        /* 테스트 코드 입력*/
        assertTrue(result == 20);
    }

    @Test
    public void subtractTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(30,10);
        /* 테스트 코드 입력*/
        assertTrue(result == 20);
    }
    @Test
    public void multiplyTest(){
        customCalculator = new CustomCalculator();
        assertTrue(customCalculator.multiply(2,3) == 6);
    }
    @Test
    public void DivideTest(){
        customCalculator = new CustomCalculator();
        assertTrue(customCalculator.divide(25,5) == 5);
    }
}