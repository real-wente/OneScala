package chapter02

/**
 * @author wentao
 * @date 2022-07-08 11:32
 */
object Test04_String {
  def main(args: Array[String]): Unit = {

//    （ 1）字符串，通过+号连接
    val name : String = "alice"
    val age : Int = 18
    println(age + "岁的" + name + "在优霓空实习")
      //*用于将一个字符串复制多次并拼接
    println(name * 3)

//    （ 2） printf 用法：字符串，通过%传值。\n也生效
    printf("%d岁的%s在优霓空学习\n",age,name)

//    （ 3）字符串模板（插值字符串） ： 通过$获取变量值 推荐1，3
    println(s"${age}岁的${name}在优霓空实习")

    val num:Double = 2.3456
    //val num1:Float = 2.34567f
    //格式化模板字符串
    println(f"The num is ${num}%2.2f")
    println(raw"随便写什么只输出变量")
    //三引号表示字符串，保持多行字符串的原格式输出,多用于sql语句的编写
    val sql =
      s"""
         |select *
         |from
         |student
         |where
         |  name = ${name}
         |and
         |  age > ${age}
         |""".stripMargin
    println(sql)
  }
}
