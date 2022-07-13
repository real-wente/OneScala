package chapter05

/**
 * @author wentao
 * @date 2022-07-12 14:58
 */

/*大部分简写都没什么用，可读性比较差 */


object Test04_Simplify {
  def main(args: Array[String]): Unit = {

        def f0(name: String): String = {
          return name
        }
        println(f0("我们亲爱的厂呀，做出来的饼，它又大又圆嘞！"))
        println("==========================")

        // 1.return可以忽略，Scala会使用函数体的最后一行代码作为返回值
        def f1(name: String): String = {
          name
        }
        println(f1("可爱的胖虎"))
        println("==========================")

        // 2.函数体只有一行代码，可以省略花括号
        def f2(name: String): String = name
        println(f3("温柔的胖虎"))
        println("==========================")

        // 3.返回值类型如果能够推断出来，那么可以省略（:和返回值类型一起省略）
        def f3(name: String) = name
        println(f3("atguigu"))
        println("==========================")

        //    （4）如果有return，则不能省略返回值类型，必须指定
        //    def f4(name: String) = {
        //      return name
        //    }
        //
        //    println(f4("atguigu"))

        // 5.如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
        def f5(name: String): Unit = {
          return name
        }
        println(f5("atguigu"))
        println("==========================")

        //6.println(f5("atguigu"))
        def f6(name: String) {
          println(name)
        }
        println(f6("atguigu"))
        println("==========================")


    /**
    // 7.如果函数无参数，但是声明了参数列表，那么调用时，小括号，可以加可以不加
    //没什么用
    def f7(): Unit = {
      println("胖虎大仙，法力无比")
    }

    f7()
    f7

    //8.如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8: Unit = {
      println("脚踢胖虎，拳打小夫")
    }
    f8
    */

    //  //9.如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
    //  def f9(name: String): Unit = {
    //    println(name)
    //  }
    //
    //  // 匿名函数，lambda表达式
    //  (name:String)=>{println(name)}


  }
}
