package cn.xzxy.lewy.clazz

/**
 * 属性说明：
 * 1. 可以直接在类名后定义参数，也可以设置初始值;
 * 2. getter/setter 方法；
 * 3. lateinit 延迟初始化：
 *    kotlin要求非空类型的属性必须要在构造方法中进行初始化，有时不太方便，就可以通过lateinit来延迟初始化；
 * 4. 可见性：四种public/protected/internal/private，区别于java
 *    private:只能在该文件下使用
 *    internal:只能在同一个模块下使用
 *    protected:不能用于顶层
 *    public:到哪都能用
 *
 */
class Club (name: String, private val nation: String = "GER") {

    /**
     * 关于lateinit：
     * 1. 只能用在类体声明的var上，不能用在primary构造方法的属性上;
     * 2. 属性不能拥有自定义的setter1和getter；
     * 3. 属性类型需要非空（不能是String?类似的），且不能是基本数据类型；
     */
    lateinit var address: String // 延迟初始化

    private var name: String? = name
        // 标准的getter/setter方法，初始化时默认有
        get() {
            println("get invoke")
            return field
        }
        set(value) {
            println("set invoke")
            field = value
        }

    // toString方法
    override fun toString(): String {
        return "Club(nation='$nation')"
    }

}

fun main() {
    val club = Club("FCB")

}