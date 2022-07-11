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
    sayHi("alice")
    Test01_FunctionAndMethod.sayHi("bob")



  }
}
