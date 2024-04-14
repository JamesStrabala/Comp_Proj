/**
 * This class represents a List Filter in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class ListFiltNode extends ExpressionNode {

    public ListFiltNode(String id,ExpressionNode e) {
        super();
	this.children.add(new IdExpressionNode(id));
	this.children.add(e);
    }

       @Override
    public String toString() {
        return "List FIlter";
    }
}
