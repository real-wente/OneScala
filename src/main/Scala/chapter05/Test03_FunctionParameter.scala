package chapter05

/**
 * @author wentao
 * @date 2022-07-11 16:42
 */
object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {

    // 可变参数 String* 实际上是一个集合类型
    def f1(str: String*): Unit = {
      println(str)
    }
    f1("alice")
    f1("aaa","bbb","ccc")

    // 如果参数列表存在多个参数，那么可变参数一般放在后面
    def f2(str1: String,str2: String*): Unit = {
      println("str1: " + str1 + "str2: " + str2)
    }
    //f2("村长")
    //f2("工头","工人404","员外")

    // 参数默认值 一般将默认值的参数放置在参数列表的后面
    def f3(name:String = "骨干"): Unit = {
      println("我们实验室的员工都是Unicorn的" + name)
    }
    f3("小工")
    f3()

    // 带名参数
    def f4(name:String = "不近女色的zzb",age: Int): Unit = {
      println(s"${age}岁的${name}在Unicorn实习")
    }
    f4("刘教授",16)
    f4(age = 20 ,name = "张博士")
    f4(age = 21)




  }
}
