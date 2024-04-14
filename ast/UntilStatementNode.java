/**
 * This class represents an until statement in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class UntilStatementNode extends StatementNode {
    public UntilStatementNode(DeclarationStatementNode ds, StatementListNode s) {
        super();
        this.children.add(ds);
	this.children.add(s);
    }

    @Override
    public String toString() {
        return "Until Statement";
    }
}
