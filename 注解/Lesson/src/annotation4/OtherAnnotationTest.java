package annotation4;

public class OtherAnnotationTest {
    @OtherAnnotation(age =25, email= {"xxxx@163.com", "yyy@126.com"}, seasonArray = Season.SUMMER)
    public void doSome(){

    }

    // 如果数组中只有一个元素, 大括号可以省略
    @OtherAnnotation(age =25, email="q123@163.com", seasonArray = {Season.AUTUMN, Season.SPRING})
    public void doOther(){

    }
}
