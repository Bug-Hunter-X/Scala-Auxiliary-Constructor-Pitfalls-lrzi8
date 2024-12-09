```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val obj1 = new MyClass(5)
val obj2 = new MyClass()
println(obj1.x) // Output: 5
println(obj2.x) // Output: 0
```