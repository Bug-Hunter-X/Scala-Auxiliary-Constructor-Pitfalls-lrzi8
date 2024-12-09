```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
  //Adding explicit handling
  def this(s:String) = this(s.toInt) 
}

val obj1 = new MyClass(5)
val obj2 = new MyClass()
val obj3 = new MyClass("10")
println(obj1.x) // Output: 5
println(obj2.x) // Output: 0
println(obj3.x) // Output: 10
```