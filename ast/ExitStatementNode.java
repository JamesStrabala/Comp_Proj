/**
 * This class represents an error statement in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class ExitStatementNode extends StatementNode {
    public ExitStatementNode(ExpressionNode e) {
        super();
        this.children.add(e);
    }

    @Override
    public String toString() {
        return "Exit Statement";
    }
}
