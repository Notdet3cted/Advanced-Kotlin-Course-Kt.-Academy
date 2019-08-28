abstract class Tree {
    override fun toString() = treeToString(this, StringBuilder())
}
class Leaf(val value: String): Tree()
class Node(val left: Tree, val right: Tree): Tree()

private fun treeToString(tree: Tree, sb: StringBuilder): String {
    when (tree) {
        is Leaf -> sb.append(tree.value)
        is Node -> {
            treeToString(tree.left, sb)
            sb.append(", ")
            treeToString(tree.right, sb)
        }
    }
    return sb.toString()
}