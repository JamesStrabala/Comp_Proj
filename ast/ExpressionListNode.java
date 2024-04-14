/**
 * This class represents an expression List in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class ExpressionListNode extends ExpressionNode {
    /**
     * An empty statement list.
     */
    public ExpressionListNode() {
        super();
    }

	public ExpressionListNode(ExpressionNode e) {
        super();
	addExpression(e);
    }
    public void addExpression(ExpressionNode e, int position) {
        this.children.add(position, e);
    }

    public void addExpression(ExpressionNode e) {
        this.children.add(e);
    }

    @Override
    public String toString() {
        return "Expression List";
    }
}
