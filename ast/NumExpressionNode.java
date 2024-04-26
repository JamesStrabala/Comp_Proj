import java_cup.runtime.*;

/**
 * This class represents a number (as an expression in the AST).
 *
 * @author Peter Ohmann + James Strabala
 */
public class NumExpressionNode extends ExpressionNode {
    private double value;

    public NumExpressionNode(String text) {
        super();
        try {
            String updatedText = text.replace(',', '.');
            Double val = Double.parseDouble(updatedText);
            this.value = val;
        }
        catch (Exception e) {
            // this exception should never happen, so we'll have the parser
            // crash brutally
            System.err.println("Compilation error: invalid Num '" + text + "'");
            System.exit(1);
        }
    }

    public double getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Number: " + this.value;
    }
}
