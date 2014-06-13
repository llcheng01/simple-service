package greeter

/**
 * Created with IntelliJ IDEA.
 * User: jcheng
 * Date: 10/9/13
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
object Main {
  implicit class RichC(val v: C) {
     def name = "foo"
  }

  def main(args: Array[String]) {
    val v = new C
    println(v.name)
  }

}
