/**
 * This class represents a List Access in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class ListAcNode extends ExpressionNode {

    public ListAcNode(String id,ExpressionNode e) {
        super();
	this.children.add(new IdExpressionNode(id));
	this.children.add(e);
    }

       @Override
    public String toString() {
        return "List access";
    }
}
