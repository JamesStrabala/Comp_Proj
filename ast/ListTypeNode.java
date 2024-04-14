/**
 * This class represents a List type in the AST.
 *
 * @author Peter Ohmann +James Strabala
 */
public class ListTypeNode extends TypeNode {
    private TypeNode listOf;

    public ListTypeNode(TypeNode listType) {
        super("list");
        this.listOf = listType;

        this.children.add(listOf);
    }

    // we'll just use the superclass toString...
}
