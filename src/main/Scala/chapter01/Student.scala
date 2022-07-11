package chapter01

/**
 * @author wentao
 * @date 2022-07-08 09:14
 */
class Student (var name:String,var age:Int){
  def printInfo: Unit = {
    println(name + "" + age + "" + Student.school)
  }
}

object Student{
  val school:String = "Unicorn";

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 12)
    val bob = new Student("Bob", 18)

    //能用常量的地方就不要使用变量，函数式编程语言

    alice.printInfo
    bob.printInfo
  }
}
