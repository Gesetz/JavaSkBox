
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

    }
}