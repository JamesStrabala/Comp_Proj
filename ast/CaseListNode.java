/**
 * This class represents a list of cases in the AST.
 *
 * @author Peter Ohmann + James Strabala
 */
public class CaseListNode extends ASTNode {
    /**
     * An empty statement list.
     */
    public CaseListNode() {
        super();
    }

    public void addCase(CaseNode c, int position) {
        this.children.add(position, c);
    }

    public void addDefault(DefaultCaseNode dc) {
        this.children.add(dc);
    }
    @Override
    public String toString() {
        return "Case List";
    }
}
