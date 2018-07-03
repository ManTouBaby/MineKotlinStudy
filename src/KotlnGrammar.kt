import Bean.Person

/**
 * $ Hrw
 * $ Description:Kotlin 基本语法
 * $ Date: 2018/7/3 14:28
 */
fun main(args: Array<String>) {
    var quantity = 5//var表示一个变量，如代码所写会被认为是一个int类型的变量，如果希望是double类型则需要进行声明
//    var quantity: Double = 5.0
    val price: Double = 20.3//val表示常量
    val name: String = "大米"
    println("单价:$price")
    println("数量:$quantity")
    println("产品:$name 总计:${quantity * price}")

    test01(5, 5)
//    test03()
    test04(2L)
    println(test05(""))
}

//如果x的值在[1，y-1]之间的话，返回OK,反之返回False
fun test01(x: Int, y: Int) {
    if (x in 1..y - 1) {
        println("OK")
    } else {
        println("False")
    }
}

//如果x不存在于array中，则输出Out
fun test02(x: Double, y: Array<Double>) {
    if (x in 0..y.lastIndex) {
        println("Out")
    }
}

//遍历打印1到5
fun test03() {
    for (x in 1..5) {
        println(x)
    }
}

fun test04(obj: Any) {
    when (obj) {
        1 -> println("第一项")
        "hello" -> println("这个是字符串hello")
        is Long -> println("这是一个Long类型数据")
        !is String -> println("这不是String类型的数据")
        else -> println("else类似于Java中的default")
    }
}

fun test05(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    if (obj !is String) {
        return obj.hashCode()
    }

    return null
}