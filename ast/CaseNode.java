/**
 * This class represents a case in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class CaseNode extends ASTNode {
    public CaseNode(ExpressionNode e, StatementNode s) {
        super();
	this.children.add(e);
	this.children.add(s);
    }

       @Override
    public String toString() {
        return "Case";
    }
}
