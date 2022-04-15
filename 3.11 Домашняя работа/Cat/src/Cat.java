public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double howMuchEated;

    // подсчет количества кошек
    static int count;

    private static final int AMOUNT_OF_EYES = 4;
    private static final int MIN_WEIGHT = 4;
    private static final int MAX_WEIGHT = 4;

    private boolean isAlive;

    //6.2.	Создайте в классе Cat переменную, в которой хранится окрас. Напишите геттер и сеттер для окраса
    // Добавил переменную цвета
    public String catColor;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count = count + 1;
        isAlive = true;
    }

    //6.2.	Создайте в классе Cat переменную, в которой хранится окрас. Напишите геттер и сеттер для окраса
    public void setColor(String color){
        this.catColor = color;
    }

    public String getCatColor(){
        return catColor;
    }

    // 1.	Сделайте в классе Cat ещё один конструктор, чтобы можно было создать кошку с весом, переданным в конструктор.
    public Cat (double catWeight){
        this();
        this.weight = catWeight;
    }

    public void meow()
    {
        if (weight < minWeight || weight > maxWeight){
            isAlive = false;
            System.out.println("Эта кошка больше не мяучит...");
            return;
        }
        weight = weight - 200;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        if (weight < minWeight || weight > maxWeight){
            isAlive = false;
            System.out.println("Эта кошка больше не поест...");
            return;
        } else {
            weight = weight + amount;
            howMuchEated = howMuchEated + amount;
        }
    }

    public void drink(Double amount)
    {
        if (weight < minWeight || weight > maxWeight){
            isAlive = false;
            System.out.println("Эта кошка больше не пьет...");
            return;
        }
        weight = weight + amount;
    }

    public void pee(){
        if (weight < minWeight || weight > maxWeight){
            isAlive = false;
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
            isAlive = false;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count = count - 1;
            isAlive = false;
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