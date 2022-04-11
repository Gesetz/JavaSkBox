
public class Loader
{
    public static void main(String[] args)
    {
        int taskNumber = 2;
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

        gosha.feed(10.0);
        persik.feed(1000.0);

        System.out.println("gosha weight: " + gosha.getWeight());
        System.out.println("persik weight: " + persik.getWeight());

        persik.getStatus();
        gosha.getEatedAmount();

        System.out.println("Гоша съел: " + gosha.getEatedAmount());
        System.out.println("Персик съел: " + persik.getEatedAmount());


        if (taskNumber == 1){
            for (int i = 1; i < 100; i++){
                persik.feed(1000.0);
                System.out.println(persik.getStatus());

                if (persik.getStatus() == "Exploded"){
                    break;
                }
            }

            for (int i = 1; i < 10000; i++){
                persik.meow();
                System.out.println(persik.getStatus());

                if (persik.getStatus() == "Dead"){
                    System.out.println(persik.getWeight());
                    break;
                }
            }
        }

        if (taskNumber == 2){
            kitty.feed(150.00);
            System.out.println(kitty.getWeight());
            kitty.pee();
            kitty.pee();
            kitty.pee();
            System.out.println("Kitty съела на " + kitty.getEatedAmount());
            System.out.println(kitty.getWeight());
        }

    }
}