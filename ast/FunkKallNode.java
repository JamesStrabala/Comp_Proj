/**
 * This class represents a Funktion call in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class FunkKallNode extends ExpressionNode {
   String id;
    public FunkKallNode(String id,ExpressionNode e) {
        super();
	this.id=id;
	this.children.add(e);
    }

       @Override
    public String toString() {
        return "Funk call "+id;
    }
}
