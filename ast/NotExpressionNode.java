/**
 * This class represents a not operation in the
 * AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class NotExpressionNode extends ExpressionNode {
    private ExpressionNode val;
    private String operator;

    /**
     * Represent an infix binary operator; that is "left op right".
     */
    public NotExpressionNode(ExpressionNode v) {
        super();
        this.val = v;
        this.children.add(val);
    }

    @Override
    public String toString() {
        return "Not expression";
    }
}
