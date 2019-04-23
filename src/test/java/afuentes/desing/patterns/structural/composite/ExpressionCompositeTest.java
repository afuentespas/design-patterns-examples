package afuentes.desing.patterns.structural.composite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExpressionCompositeTest {
    
	private Expression exp1, exp2, exp3, exp4, exp5, exp6;

    @Before
    public void before() {
        this.exp1 = new Number(12);
        this.exp2 = new SumOperation(this.exp1, new Number(5));
        this.exp3 = new SubtractionOperation(this.exp1, new Number(3));
        this.exp4 = new MultiplicationOperation(this.exp1, new Number(10));
        this.exp5 = new DivisionOperation(this.exp1, new Number(6));
        
        // ((3-((4/2)*3))+4)
        this.exp6 = new SumOperation(
        		new SubtractionOperation(
        				new Number(5), 
        				new MultiplicationOperation(
        						new DivisionOperation(
        								this.exp1, 
        								new Number(3)), 
        						new Number(7)
        						)
        				), 
        		this.exp1);
    }

    @Test
    public void testNumber() {
        assertEquals(12, this.exp1.calculate());
    }

    @Test
    public void TestSummation() {
        assertEquals(17, this.exp2.calculate());
    }

    @Test
    public void testSubtraction() {
        assertEquals(9, this.exp3.calculate());
    }

    @Test
    public void testMultiplication() {
        assertEquals(120, this.exp4.calculate());
    }

    @Test
    public void testDivision() {
        assertEquals(2, this.exp5.calculate());
    }

    @Test
    public void testExpressionComposite() {
        assertEquals(-11, this.exp6.calculate());
    }

    @Test
    public void testToString() {
        assertEquals("((5-((12/3)*7))+12)", this.exp6.toString());
    }
}
