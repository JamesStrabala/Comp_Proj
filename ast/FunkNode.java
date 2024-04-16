/**
 * This class represents a Function in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class FunkNode extends ASTNode {
   String ид;
    public FunkNode(TypeNode t, String и, ParamListNode p, StatementListNode s) {
        super();
 this.children.add(t);
 this.children.add(p);
 this.children.add(s);
 this.ид=и;
    }

       @Override
    public String toString() {
        return "Function Declaration: "+this.ид;
    }
}
