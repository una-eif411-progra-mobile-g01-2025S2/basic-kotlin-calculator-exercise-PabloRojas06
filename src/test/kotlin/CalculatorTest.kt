import org.example.Calculator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class CalculatorTest {

    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAddition() {
        val result = calculator.add(2.0, 3.0)
        assertEquals(5.0, result)
    }

    @Test
    fun testSubtraction() {
        val result = calculator.subtract(10.0, 4.0)
        assertEquals(6.0, result)
    }

    @Test
    fun testMultiplication() {
        val result = calculator.multiply(3.0, 4.0)
        assertEquals(12.0, result)
    }

    @Test
    fun testDivision() {
        val result = calculator.divide(10.0, 2.0)
        assertEquals(5.0, result)
    }


    //error tests
    @Test
    fun testDivisionByZero() {
        assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(10.0, 0.0)
        }
    }

    @Test
    fun testAdditionWithNegativeNumbers() {
        val result = calculator.add(-3.0, -2.0)
        assertEquals(-5.0, result)
    }

}