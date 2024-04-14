/**
 * This class represents an input expression in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class InputExpNode extends ExpressionNode {
   String id;
    public InputExpNode(ExpressionNode e) {
        super();
	this.children.add(e);
    }

       @Override
    public String toString() {
        return "Input expression";
    }
}
