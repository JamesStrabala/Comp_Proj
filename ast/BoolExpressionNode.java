import java_cup.runtime.*;

/**
 * This class represents a boolean (as an expression in the AST).
 *
 * @author Peter Ohmann + James Strabala
 */
public class BoolExpressionNode extends ExpressionNode {
    private Object value;

    public BoolExpressionNode(Object input) {
        super();
         value=input;
        }
    

    public Object getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Boolean: " + this.value;
    }
}
