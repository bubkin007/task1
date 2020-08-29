
public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        int n=0;
        int m=0;
        if (this.weight>anotherCat.weight)
            m++;
        else
            n++;

        if (this.age>anotherCat.age)
            m++;
        else
            n++;

        if (this.strength>anotherCat.strength)
            m++;
        else
            n++;

        if (m>n)
            return(true);
        else
            return(false);
    }

    public static void main(String[] args) {

    }
}
