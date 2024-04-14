import java_cup.runtime.*;

/**
 * This class represents a for statement in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class ForStateNode extends StatementNode {
    private String id;

    public ForStateNode(TypeNode t, String id, IdExpressionNode i, StatementListNode s) {
        super();
        this.id = id;
        this.children.add(t);
	this.children.add(i);
	this.children.add(s);
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "For statement: " + this.id;
    }
}
