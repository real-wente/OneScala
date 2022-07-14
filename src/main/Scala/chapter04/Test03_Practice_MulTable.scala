package chapter04

/**
 * @author wentao
 * @date 2022-07-14 15:31
 */
object Test03_Practice_MulTable {
  def main(args: Array[String]): Unit = {

//    //java写法
//    for (i <- 1 to 9){
//      for (j <- 1 to i){
//        print(j  + "*" + i + "=" + i*j + "   ")
//      }
//      println()
//    }


    //现学现卖
    for (i <- 1 to 9;j <- 1 to i){
      print(j  + "*" + i + "=" + i*j + "   ")

      /**
       * print(s"$j * $i = ${i * j} \t")
       * 字符串模板的写法
       */

      if (j == i) println()
    }
    /**
     * 相比之前的for循环的套娃显得更加的方便
     * 理论上可以嵌套的层数是无穷的
     * 知乎实验的结果是python只能嵌套21层
     * C99的C语言只能嵌套127层
     * 主要是和堆栈的大小有关系
     */





  }
}
