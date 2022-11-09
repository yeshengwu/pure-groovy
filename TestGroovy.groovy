println 'Hello'

// There is a synthetic class 'TestGroovy' generated for script code
//class TestGroovy {
//
//}
// 根据out生成的目录得知， TestGroovy.groovy 编译器会生成一个同名的类：  public class TestGroovy extends Script {}
// 如果这个时候再 定义一个同名的 class TestGroovy 就会抛出上面的编译异常导致无法编译。

// 重要资料：
// https://www.cnblogs.com/wxdlut/p/15589685.html#top  Groovy入门
// https://juejin.cn/post/6954350461818421278#heading-1 5 分钟的 Java 转 Groovy 教程
// https://juejin.cn/post/7092367604211253256#heading-8 gradle 进阶




println("ls -l")

def x = 10
def y = 25

print 'Sum of x + y = ' + (x + y)


// todo 搞一个 入门的 groovy 工程来完成1.0版本的 groovy 语言学习。

// Gradle 系列（1）为什么说 Gradle 是 Android 进阶绕不去的坎
// https://juejin.cn/post/7092367604211253256#heading-8

// 函数定义
def methodName() {

}

String methodName2() {

}

// 省略参数类型
def methodName(param1, param2) {
    // Method Code
}

def methodName(String param1, String param2) {
    // Method Code
}

// 默认参数： Groovy 支持指定函数参数默认值，默认参数必须放在参数列表末尾。例如：
def methodName3(param1, param2 = 1) {
    // Method Code
}

// 返回值： 可以省略 return，默认返回最后一行语句的值。例如：
def methodName4() {
    return "返回值"
}
//  等价于
def methodName5() {
    "返回值"
}


// kt 定义函数：
//fun maxOf(a:Int,b:Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}

