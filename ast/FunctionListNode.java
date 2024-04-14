/**
 * This class represents a Function List in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class FunctionListNode extends ASTNode {
    /**
     * An empty function list.
     */
    public FunctionListNode() {
        super();
    }


     public void addFunk(FunkNode s, int position) {
        this.children.add(position, s);
    }

    public void addFunk(FunkNode s) {
        this.children.add(s);
    }

    @Override
    public String toString() {
        return "Function List";
    }
}
