package lesson01.hw;

/**
 * class GcdSolver
 */
public class GcdSolver {

    public int getGcd(int a, int b) {
        return b == 0 ? a : getGcd(b, a % b);
    }
}
