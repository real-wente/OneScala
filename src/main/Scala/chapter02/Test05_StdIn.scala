package chapter02

import scala.io.StdIn

/**
 * @author wentao
 * @date 2022-07-08 13:47
 */
object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    //信息的输入
    println("请输入您的大名：")
    val name: String = StdIn.readLine()
    println("请输入您的年龄：")
    val age: Int = StdIn.readInt()

    //控制台打印输出
    println(s"欢迎${age}岁的${name}来到优霓空实习")

  }

}
