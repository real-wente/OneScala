package chapter03

/**
 * @author wentao
 * @date 2022-07-13 14:08
 */
object Test01_TestOperator {
  def main(args: Array[String]): Unit = {

    //必须有一个为浮点型才能输出浮点型
    val result3:Double = 10.0 / 3
    println(result3)
    println(result3.formatted("%5.2f"))

    // 2. 比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")

    /**
     * java直接相等对比的是引用的地址
     * equals对比的是实际的内容
     * Scala里面的等号和equals是一样的功能
     */
    println(s1 == s2)
    println(s1.equals(s2))

    /**判断引用类型是否相等*/
    println(s1.eq(s2))
    println("===================")

    // 3.逻辑运算
    val n = 1
    //短路执行
    //println((4 > 5) && m(n) > 0)
    // 判断一个字符串是否为空
    def isNotEmpty(str: String): Boolean = {
      return str != null && !("".equals(str.trim))
    }

    println(isNotEmpty(null))

    // 4. 赋值运算符
    //    var b: Byte = 10
    var i: Int = 12
    //    b += 1
    i += 1
    println(i)

    //    i ++

    // 5. 位运算符
    val a: Byte = 60
    println(a << 3)
    println(a >> 2)

    val b: Short = -13
    println(b << 2)
    println(b >> 2)
    println(b >>> 2)

    // 6. 运算符的本质
    /**
     * 认为规定的运算符的方法调用
     */
    val n1: Int = 12
    val n2: Int = 37

    println(n1.+(n2))
    println(n1 + n2 )

    println(1.34.*(25))
    println(1.34 * 25)


    //    println(7.5 toInt toString)













  }

}
