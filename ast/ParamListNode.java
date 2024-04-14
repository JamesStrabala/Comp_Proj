/**
 * This class represents a Param List in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class ParamListNode extends ASTNode {
    /**
     * An empty parameter list.
     */
    public ParamListNode() {
        super();
    }

	public ParamListNode(ParamNode e) {
        super();
	addParam(e);
    }
    public void addParam(ParamNode e, int position) {
        this.children.add(position, e);
    }

    public void addParam(ParamNode e) {
        this.children.add(e);
    }

    @Override
    public String toString() {
        return "Parameter List";
    }
}
