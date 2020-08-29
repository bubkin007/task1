
public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog dog = new Dog("D", 12, 5);
        Cat cat = new Cat("T", 12, 5);
        //System.out.println(jerryMouse.name);
        //System.out.println(cat.name);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Zhiv{   //класс предок
        String name;
        int height;
        int tail;
        public Zhiv(String name, int height, int tail) {
            this.name=name;
            this.height=height;
            this.tail=tail;
        }
    }

    // теперь создаем потомков
    public static class Dog extends Zhiv {
        public Dog(String name, int height, int tail) {
            super(name, height, tail);
        }
    }
    public static class Cat extends Zhiv {
        public Cat(String name, int height, int tail) {
            super(name, height, tail);
        }
    }
}
