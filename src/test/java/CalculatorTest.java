import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculatorTestAddition() {
        assertEquals(Calculator.calculator(1,2),3);
    }

    @Test
    void calculatorTestSubtraction(){
        assertEquals(Calculator.calculator(1,-2),-1);
    }
    @Test
    void calculatorTestMultiply(){
        assertEquals(Calculator.calculator(2,3),6);
    }

}