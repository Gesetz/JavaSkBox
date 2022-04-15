
public class Loader
{

    public static void main(String[] args)
    {

        Cat gosha = new Cat();
        Cat persik = new Cat();
        Cat masik = new Cat();
        Cat murzik = new Cat();
        Cat kitty = new Cat();

        System.out.println("gosha weight: " + gosha.getWeight());
        System.out.println("persik weight: " + persik.getWeight());
        System.out.println("masik weight: " + masik.getWeight());
        System.out.println("murzik weight: " + murzik.getWeight());
        System.out.println("kitty weight: " + kitty.getWeight());

        System.out.println("Количество кошек сейчас: " + Cat.getCount());

        gosha.feed(10.0);
        persik.feed(1000.0);

        System.out.println("gosha weight: " + gosha.getWeight());
        System.out.println("persik weight: " + persik.getWeight());


        persik.getStatus();
        gosha.getEatedAmount();

        System.out.println("Гоша съел: " + gosha.getEatedAmount());
        System.out.println("Персик съел: " + persik.getEatedAmount());

        System.out.println("Количество кошек сейчас: " + Cat.getCount());

        System.out.println(Color.ORANGE);

// Первое задание
        if (true){
            while (persik.getStatus() != "Exploded"){
                persik.feed(1000.0);
            }

            while (gosha.getStatus() != "Dead"){
                gosha.meow();
            }
        }
        System.out.println("Количество кошек сейчас: " + Cat.getCount());
// Второе задание
        if (false){
            kitty.feed(150.00);
            System.out.println(kitty.getWeight());
            kitty.pee();
            kitty.pee();
            kitty.pee();
            System.out.println("Kitty съела на " + kitty.getEatedAmount());
            System.out.println(kitty.getWeight());

            System.out.println("Всего в живых кошек: " + Cat.getCount());
        }
    //    5.3	Создайте три объекта класса Cat в методе main(), используя метод getKitten().
        Cat kitty1 = getKittyen();
        Cat kitty2 = getKittyen();
        Cat kitty3 = getKittyen();
        System.out.println("Котенок 1 " + kitty1.getWeight());
        System.out.println("Котенок 2 " + kitty2.getWeight());
        System.out.println("Котенок 3 " + kitty3.getWeight());
    }

    //5.2.	Создайте в главном классе Loader метод генерации котёнка private static Cat getKitten().
    // Он должен возвращать кошку с весом 1100.00 грамм с помощью конструктора, в который передаём вес кошки.
    // Используйте описание из видеоурока.
    private static Cat getKittyen(){
        return new Cat(1100.00);
    }
}