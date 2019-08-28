sealed class Tree
data class Leaf(val value: String) : Tree()
data class Node(val left: Tree, val right: Tree) : Tree()

// Implement operations here

fun main() {
    val tree = Node(Node(Node(Leaf("AAA"), Leaf("BBB")), Leaf("CCC")), Node(Node(Leaf("AAA"), Leaf("BBB")), Leaf("CCC")))
    println(Leaf("A").plus(Leaf("B"))) // Node(left=Leaf(value=A), right=Leaf(value=B))
    assert(Leaf("A").plus(Leaf("B")) == Node(Leaf("A"), Leaf("B")))

    println(Node(Leaf("A"), Leaf("B")).plus(Leaf("C"))) // Node(left=Node(left=Leaf(value=A), right=Leaf(value=B)), right=Leaf(value=C))
    assert(Node(Leaf("A"), Leaf("B")).plus(Leaf("C")) == Node(Node(Leaf("A"), Leaf("B")), Leaf("C")))

    println(tree.count()) // 6
    println(tree.height()) // 4

    println(tree.contains("AAA")) // true
    println(tree.contains("DDD")) // false
}