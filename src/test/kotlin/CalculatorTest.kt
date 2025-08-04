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

}