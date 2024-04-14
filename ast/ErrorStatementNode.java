/**
 * This class represents an error statement in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class ErrorStatementNode extends StatementNode {
    public ErrorStatementNode(StatementListNode s) {
        super();
        this.children.add(s);
    }

    @Override
    public String toString() {
        return "Error Statement";
    }
}
