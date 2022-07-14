package chapter04

/**
 * @author wentao
 * @date 2022-07-14 11:19
 */
object Test02_ForLoop {
  def main(args: Array[String]): Unit = {

    /**
     * to 是方法的调用
     * for ( i <- 1.to(10) )
     * for (i: Int <- 1.to(10)) 隐式定义
     * for (i <- Range(1, 10))
     * 三者等价 连续按两次shift进行搜索
     */
    for (i <- 0 to 9) {
      println(i + ".黄四郎死啦死啦！！！")
    }

    /**
     * until前闭合后开的结构
     * 1 until 3 实际范围是1 2
     */
    for (i <- 1 until 3){
      println(i + ".鹅城太平啦")
    }
    println("=========麻子的分割线=========")

    //集合遍历
    for (i <- Array(12,34,53)){
      println(i)
    }
    for (i <- List(12,34,53)){
      println(i)
    }
    for (i <- Set(12,34,53)){
      println(i)
    }
    println("=========麻子的分割线=========")
    










  }

}
