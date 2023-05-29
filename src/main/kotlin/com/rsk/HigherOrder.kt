package com.rsk

val action= {println("hello world")}
val calc:(Int,Int)->Int={x,y-> x*y}
fun main(args: Array<String>) {
    doSomething (action)
    println(calc(12,35))
}
fun doSomething(func:()->Unit){
    func()
}