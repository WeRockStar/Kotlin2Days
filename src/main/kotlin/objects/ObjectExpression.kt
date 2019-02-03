package objects

//TODO: Handle with interface
//TODO: Handle with class
//TODO: Companion object

//TODO: Modification of some class, without explicitly declaring a new subclass for it
fun doSomething() {
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(adHoc.x + adHoc.y)
}