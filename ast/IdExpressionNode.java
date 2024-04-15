import java_cup.runtime.*;

/**
 * This class represents an identifier (as an expression in the AST).
 *
 * @author Peter Ohmann + James Strabala
 */
public class IdExpressionNode extends ExpressionNode {
    private String value;

    public IdExpressionNode(String ид) {
        super();
        this.value = ид;
    }

    @Override
    public String toString() {
        return "Identifier: " + this.value;
    }
}
