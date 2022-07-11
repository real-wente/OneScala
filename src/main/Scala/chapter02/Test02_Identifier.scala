package chapter02

/**
 * @author wentao
 * @date 2022-07-08 11:21
 */
object Test02_Identifier {
  def main(args: Array[String]): Unit = {
    //用反引号`....`包括的任意字符串，即使是 Scala 关键字（ 39 个）也可以
    val `if` = "if"
    println(`if`)


  }
}
