package chapter05

/**
 * @author wentao
 * @date 2022-07-08 17:20
 */
object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    //定义函数
    def sayHi(name: String): Unit = {
      println("hi," + name)
    }
    //调用函数
    //sayHi("alice")
    //调用对象方法
    //Test01_FunctionAndMethod.sayHi("bob")
    //获取返回值
//    val result = Test01_FunctionAndMethod.sayHello("panghu")
//    println(result)
  }

  //定义对象的方法
  def sayHi(name: String): Unit = {
    println("Hi ," + name)
  }



  //println("特定" + sayHi("xiaofu"))

  sayHi("real_xiaofu")

  /**
    println("云从出品，必属精品" + sayHi("xiaofu"))
    println("云从出品，必属精品" + ("null"))
    println 套娃以后会出现括号
   */

  def sayHello(name: String): String = {
    println("Hello," + name)
    return "Hello"
  }



}
