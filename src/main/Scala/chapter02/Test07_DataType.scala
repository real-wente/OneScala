package chapter02

import chapter01.Student

/**
 * @author wentao
 * @date 2022-07-08 15:15
 */
object Test07_DataType {
  def main(args: Array[String]): Unit = {
    //1.整数类型
    val a1:Byte = 127
    val a2:Byte = -128

//    val a2: Byte = 128 //error

    val a3 = 12 //整数默认类型为Int
    val a4 = 123456789L //长整型

    val b1: Byte = 10
    val b2: Byte = 10 + 20
    //不报错,是编译器暂时不支持

    //val b3:Byte = b1 + 20 编译器真的会报错
    //强制类型转换，都是方法调用
    val b3:Byte = (b1 + 20 ).toByte
    println(b2)

    //2.浮点类型,小数默认是double
    val f1:Float = 1.2345f
    val d1:Double = 34.34234
    val e1 = 34.3434

    //3.字符型
    val c1:Char = 'a'
    println("c1=" + c1)

    //这里涉及自动类型提升，其实编译器可以自定判断是否超出范围
    val c2:Char = 'a'+1
    println(c2)

    // \t:一个制表位,实现对齐的功能
    println("姓名\t年龄")

    // \n:换行符
    // \\表示\
    // \"表示”
    println("我们说:\"黄老爷是个大善人\"")

    //4.布尔类型
    //boolean 类型占 1 个字节
    val isTrue:Boolean = true
    println("谁敢有怨呐"+ isTrue + "小人冲撞了武老爷")

    //5. 空类型x
    //5.1 空值Unit
    def m1(): Unit = {
      println("县长来了，鹅城就太平了")
    }

    val a: Unit = m1()
    println("a: " + a + "!")

    //5.2 空引用Null
    // val n:Int = null //error
    var student: Student = new Student("alice", 20)
    student = null
    println(student)

    //5.3 Nothing
    def m2(n :Int): Int = {
      if(n == 0)
        throw new NullPointerException
      else
        return n
    }

    val b: Int = m2(2)
    println("b: " + b)

  }

}
