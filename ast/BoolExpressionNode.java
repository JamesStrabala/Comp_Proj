import java_cup.runtime.*;

/**
 * This class represents a boolean (as an expression in the AST).
 *
 * @author Peter Ohmann + James Strabala
 */
public class BoolExpressionNode extends ExpressionNode {
    private Boolean value;

    public BoolExpressionNode(Boolean input) {
        super();
         value=input;
        }
    

    public Boolean getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Boolean: " + this.value;
    }
}
