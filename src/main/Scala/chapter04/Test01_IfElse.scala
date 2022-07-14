package chapter04

import scala.io.StdIn

/**
 * @author wentao
 * @date 2022-07-14 09:16
 */
object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    //println("马邦德县长和夫人在愉快的吃火锅")
    val age:Int = StdIn.readInt()

    /**
     * Scala 中 if else 表达式其实是有返回值的，具体返回值取决于满足条件的
代码体的最后一行内容。
     */
//    val result1: Any = if (age <= 6){
//      println("小孩")
//      "小孩"
//    } else if(age < 18){
//      println("成长阶段")
//      "成长期"
//    } else if(age < 35){
//      println("成熟期")
//      "成熟期"
//    } else if( age < 60){
//      println("衰退期")
//      "开始变老"
//    } else{
//      println("老人")
//      "老年人"
//    }
//    println("result1: " + result1)

/**
    val test1:Any = if(age>=0 && age < 16){
      println("发育期葫芦娃")
    } else if(age >= 16){
      println("成熟期葫芦娃")
    } else {
      println("老年期葫芦娃")
    }
    /**因为生效的最后一行是打印出输出，所以返回值是空括号*/
    println(test1)
    println("=========美丽的风景线=========")

    */

    /**
     * Scala 中返回值类型不一致，取它们共同的祖先类型Any
     * 可以将返回值设定为空的同时实际返回值是其他类型，此时返回的结果依旧是空括号
     * 返回值用Any是万金油
     */
    val res: Any = if(age < 18){
      "童年"
    } else if (age >= 18 && age < 30){
      "中年"
    } else {
      100
    }
    println(res)
    println("=========美丽的风景线=========")

    val res2 = if (age >=18){
      "成年"
    } else {
      "未成年"
    }

    /**
     * 实在是太省略了，但是可读性很强
     * java中三元运算符 String res = (age >= 18)?"成年":"未成年"
     * */
    val res3 = if (age >= 18 ) "成年" else "未成年"
    println(res2,res3)
    println("=========美丽的风景线=========")

    // 嵌套分支
    if (age >= 18){
      println("成年")
      if(age >=35){
        if(age >=60){
          println("老年")
        } else {
          println("中年")
        }
      } else {
        println("青年")
      }
    } else {
      println("未成年")
      if (age <= 6){
        println("童年")
      } else {
        println("青少年")
      }
    }








  }
}
