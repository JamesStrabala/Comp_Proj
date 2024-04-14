/**
 * This class represents an if statement in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class IfStateNode extends StatementNode {
    public IfStateNode(ExpressionNode e, StatementListNode s) {
        super();
	this.children.add(e);
        this.children.add(s);
    }

    public IfStateNode(ExpressionNode e,StatementListNode s, StatementListNode s2) {
        super();
	this.children.add(e);
        this.children.add(s);
        this.children.add(s2);
    }
    @Override
    public String toString() {
        return "If Statement";
    }
}
