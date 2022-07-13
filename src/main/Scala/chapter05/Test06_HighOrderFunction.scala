package chapter05

/**
 * @author wentao
 * @date 2022-07-13 10:24
 */
object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {

    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }
    def fun(): Int = {
      println("fun调用")
      1
    }

    val result: Int = f(123)
    println(result)

    // 1. 函数作为值进行传递
    /**
     * 因为系统已经是调用的整个函数而不是函数的值，所以此处可以省略下划线
     */
    val f1: Int=>Int = f
    val f2 = f _

    println(f1)
    println(f1(12))
    println(f2)
    println(f2(35))

    //f9是调用的函数返回值
    val f9 = fun
    val f3: ()=>Int = fun
    //f3/4是函数本身
    val f4 = fun _
    println(f3)
    println(f4)

    // 2. 函数作为参数进行传递
    // 定义二元计算函数
    def dualEval(op: (Int, Int)=>Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 12, 35))
    println(dualEval((a, b) => a + b, 12, 35))
    println(dualEval(_ + _, 12, 35))

    // 3. 函数作为函数的返回值返回
    def f5(): Int=>Unit = {
      def f6(a: Int): Unit = {
        println("f6调用 " + a)
      }
      f6    // 将函数直接返回
    }

    //    val f6 = f5()
    //    println(f6)
    //    println(f6(25))
    println("欢迎张博士莅临云从指导")

    /**
     * 我不理解
     * 为什么刘鹏程要诱惑我买一个键盘的木头靠起来
     * 为什么王硕秋给所有人都推荐那个支架，我现在似乎也想买那个支架了
     * 为什么我们每天都要吃没有馅的大饼，有一说一味道真的不好吃，主要是没有味道
     */

    println(f5()(25))

  }
}
