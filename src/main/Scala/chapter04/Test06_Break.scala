package chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks.{break, breakable}

/**
 * @author wentao
 * @date 2022-07-14 18:16
 */
object Test06_Break {
  def main(args: Array[String]): Unit = {


    // 抛出异常以后退出循环
    try {
      for (i <- 0 until 5){
        if (i == 3)
          throw new RuntimeException
        println(i)
      }
    } catch {
      case e: Exception =>    // 什么都不做，只是退出循环
    }



    //  // 用Scala中的Breaks类的break方法，异常抛出和捕捉
    //  Breaks.breakable(
    //    for (i <- 0 until 5){
    //      if (i == 3) {
    //        //为了函数编程
    //        Breaks.break()
    //      }
    //      println(i)
    //    }
    //  )

    breakable(
      for (i <- 0 until 5){
        if (i == 3) {
          //为了函数编程
          break()
        }
        println(i)
      }
    )


    breakable(
      for (i <- 0 until 5){
        if (i == 3)
          break()
        println(i)
      }
    )



    println("2022年7月15日今天胜利下班！！！！")

  }


}
