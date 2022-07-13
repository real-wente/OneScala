package chapter05

/**
 * @author wentao
 * @date 2022-07-12 17:56
 */

/**
 * 本章节是鸡汤版编程环境
 */

object Test05_Lambda {
  def main(args: Array[String]): Unit = {

    /*fun相当于是匿名函数的函数名称了*/
    val fun = (name: String) => {
      println(name)
    }
    fun("哈哈哈，今天是美好的一天")
    println("=============美好的分割线=========")

    // 定义一个函数，以函数作为参数输入

    /**
     * String做为参数，Unitu做为返回值的函数func
     *
     * @param func
     */
    def f(func: String => Unit): Unit = {
      func("努力")
    }

    f(fun)
    f((name: String) => {
      println(name)
    })

    //匿名函数的简化原则
    //    （1）参数的类型可以省略，会根据形参进行自动的推导
    f((name) => {
      println(name)
    })

    //    （2）类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况：没有参数和参数超过1的永远不能省略圆括号。
    f(name => {
      println(name)
    })

    //    （3）匿名函数如果只有一行，则大括号也可以省略
    f(name => println(name))

    //    （4）如果参数只出现一次，则参数省略且后面参数可以用_代替
    f(println(_))

    //     (5) 如果可以推断出，当前传入的println是一个函数体，而不是调用语句，可以直接省略下划线
    f(println)

    println("=========================")

    // 实际示例，定义一个”二元运算“函数，只操作1和2两个数，但是具体运算通过参数传入
    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    // 匿名函数简化
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a + b))
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a - b))

    println(dualFunctionOneAndTwo((a, b) => a + b))
    println(dualFunctionOneAndTwo(_ + _))
    println(dualFunctionOneAndTwo(_ - _))

    println(dualFunctionOneAndTwo((a, b) => b - a))
    println(dualFunctionOneAndTwo(-_ + _))


  }

}
