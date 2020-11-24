package lesson01.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdSolverTest {

    GcdSolver gcdsolver = new GcdSolver();

    @Test
    public void testGcd_nEquals15_20_5() {
        assertEquals(5, gcdsolver.getGcd(15,20));
    }

    @Test
    public void test_nEquals1071_462_21(){
        assertEquals(21, gcdsolver.getGcd(1071, 462));
    }
}
