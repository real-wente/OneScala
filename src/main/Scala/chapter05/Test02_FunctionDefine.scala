package chapter05

/**
 * @author wentao
 * @date 2022-07-11 15:48
 */
object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {

    // 6.多参数，有返回值
    def f6(a: Int, b: Int): Int = {
      println("6.多参数，有返回值")
      return a + b
    }
    println(f6(12, 37))

  }
}


//    // 1.没有参数，没有返回值
//    def f1() : Unit = {
//      println("1.无参，无返回值")
//    }
//    f1()
//    println("=======================")
//  }
//
//  // 2.没有参数，有返回值
//    def f2(): Int = {
//    println("2.没有参数有返回值")
//    return 12
//    }
//    println(f2())
//    println("=======================")
//
//  // 3.有参数，没有返回值
//    def f3(name: String):Unit = {
//      println("3：有参，无返回值 " + name)
//    }
//    println(f3("alice"))
//    println("=======================")
//
//  // 4.有参数，有返回值
//    def f4(name: String): String = {
//      println("有参数有返回值" +name)
//      return "hi, " + name
//    }
//    println(f4("alice"))
//    println("=======================")
//
//  // 5.多参数，没有返回值
//    def f5(name1: String,name2: String): Unit = {
//      println("多参数没有返回值")
//      println(s"${name1}和${name2}是优霓空骨干")
//    }
//    f5("刘鹏程","刘阳阳")
//    println("=======================")

