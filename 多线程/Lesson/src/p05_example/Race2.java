package p05_example;

//
public class Race2 {


    public static void main(String[] args) {
        Wife wife = new Wife(25,null);
        Husband husband = new Husband(23,wife);
        wife.h = husband;
    }
}

class Husband{
    int age;
    Wife w;
    Husband(){}
    Husband(int age,Wife wife){
        this.w = wife;
        this.age = age;
    }
}

class Wife{
    int age;
    Husband h;
    Wife(){};
    Wife(int age,Husband husband){
        this.h = husband;
        this.age = age;
    }
}