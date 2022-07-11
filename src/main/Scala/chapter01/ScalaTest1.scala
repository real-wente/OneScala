package chapter01

/**
 * @author wentao
 * @date 2022-07-07 16:03
 */

/**
 * Scala也能调用java的类库写Java代码
 * object：关键字，声明一个单例对象/伴生对象
 * */
object ScalaTest1 {
  /**
   * main方法：从外部方法直接调用执行的方法
   * def 方法名称(参数名称: 参数类型):方法返回值类型 = {方法体}
   * unit 返回类型为空
   * */

  /**
   * 文档注释
   *
   * @param args 外部传入的参数
   * ctrl+alt+l 对格式进行规范化快捷键
   */

  def main(args: Array[String]): Unit = {
    //    println("hello,Unicorn");
    //    println("Hello," + " world!");
    var x: Int = 1 + 1
    x = 3;
    println(x)

  }
}
