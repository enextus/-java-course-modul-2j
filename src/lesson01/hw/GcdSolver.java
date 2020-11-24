package lesson01.hw;

/**
 * class GcdSolver
 */
public class GcdSolver {

    /**
     * The method accepts only positive int numbers.
     *
     * @param a int number
     * @param b int number
     * @return GCD of a and b
     */
    public int getGcd(int a, int b) {
        return b == 0 ? a : getGcd(b, a % b);
    }
}
