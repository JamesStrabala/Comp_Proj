import java_cup.runtime.*;

/**
 * This class represents a string (as an expression in the AST).
 *
 * @author Peter Ohmann + James Strabala
 */
public class StringExpressionNode extends ExpressionNode {
    private String text;

    public StringExpressionNode(String s) {
        super();
        this.text = s;
    }

    @Override
    public String toString() {
        return "Quoted String: " + this.text;//More like GOATed String, amirite?

    }
}
