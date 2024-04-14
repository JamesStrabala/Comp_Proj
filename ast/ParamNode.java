/**
 * This class represents a parameter in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class ParamNode extends ASTNode {
   String id;
    public ParamNode(TypeNode t, String i) {
	super();
        this.children.add(t);
	this.id=i;
    }

       @Override
    public String toString() {
        return "Parameter: "+id;
    }
}
