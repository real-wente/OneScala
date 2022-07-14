package chapter04

/**
 * @author wentao
 * @date 2022-07-14 15:31
 */
object Test03_Practice_MulTable {
  def main(args: Array[String]): Unit = {


//    for (i <- 1 to 9){
//      for (j <- 1 to i){
//         print(j  + "*" + i + "=" + i*j)
    //     print("   ")
//      }
//      println()
//    }

    //现学现卖
    for (i <- 1 to 9;j <- 1 to i){
      print(j  + "*" + i + "=" + i*j)
      print("   ")
      if (j == i) println()
    }


  }
}
