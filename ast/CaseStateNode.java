/**
 * This class represents a switch statement in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class CaseStateNode extends StatementNode {
    public CaseStateNode(ExpressionNode e, CaseListNode c) {
        super();
	this.children.add(e);
        this.children.add(c);
    }

    @Override
    public String toString() {
        return "Switch Statement";
    }
}
