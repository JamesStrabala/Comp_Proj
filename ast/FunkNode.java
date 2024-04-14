/**
 * This class represents a Function in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class FunkNode extends ASTNode {
   String id;
    public FunkNode(TypeNode t, String i, ParamListNode p, StatementListNode s) {
        super();
	this.children.add(t);
	this.children.add(p);
	this.children.add(s);
	this.id=i;
    }

       @Override
    public String toString() {
        return "Function Declaration: "+this.id;
    }
}
