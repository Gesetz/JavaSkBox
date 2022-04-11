
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double howMuchEated;

    static int count;

    private static final int AMOUNT_OF_EYES = 4;
    private static final int MIN_WEIGHT = 4;
    private static final int MAX_WEIGHT = 4;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

        count = count + 1;

    }

    public void meow()
    {
        if (weight < minWeight && weight > maxWeight){
            System.out.println("Эта кошка больше не мяучит...");
            return;
        }
        weight = weight - 2;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        if (weight < minWeight && weight > maxWeight){
            System.out.println("Эта кошка больше не поест...");
            return;
        } else {
            weight = weight + amount;
            howMuchEated = howMuchEated + amount;
        }
    }

    public void drink(Double amount)
    {
        if (weight < minWeight && weight > maxWeight){
            System.out.println("Эта кошка больше не пьет...");
            return;
        }
        weight = weight + amount;
    }

    public void pee(){
        if (weight < minWeight && weight > maxWeight){
            System.out.println("Эта кошка больше не срет...");
            return;
        }
        double howMuchPee = Math.random() * 10;
        weight = weight - howMuchPee;
        System.out.println("Кошка покакалась на " + howMuchPee);
    }

    public Double getWeight()
    {
        return weight;
    }

    public Double getEatedAmount(){
        return howMuchEated;
    }

    public static int getCount() {
        return count;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            count = count - 1;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count = count - 1;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}