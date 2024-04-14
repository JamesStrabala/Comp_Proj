/**
 * This class represents a default case in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class DefaultCaseNode extends ASTNode {
    public DefaultCaseNode(StatementNode s) {
        super();
	this.children.add(s);
    }

       @Override
    public String toString() {
        return "Default Case";
    }
}
