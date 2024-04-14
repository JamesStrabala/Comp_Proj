import java_cup.runtime.*;

/**
 * This class represents an read statement in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class ReadStatementNode extends AssignStatementNode {
    private String id;

    public ReadStatementNode(String id, ExpressionNode e) {
        super(id, e);
	this.id=id;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "File read into variable: " + this.id;
    }
}
