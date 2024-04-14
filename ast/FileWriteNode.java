/**
 * This class represents a write to file statement in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class FileWriteNode extends StatementNode {
    public FileWriteNode(ExpressionNode e,ExpressionNode e2) {
        super();
        this.children.add(e);
	this.children.add(e2);
    }

    @Override
    public String toString() {
        return "File Write Statement";
    }
}
