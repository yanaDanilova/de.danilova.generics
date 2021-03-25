
public class FruitMainApp {
    public static void main(String[] args) {

    Box <Apple> box1 = new Box();
    box1.contentsOfBox.add(new Apple(1.0f));
    box1.contentsOfBox.add(new Apple(1.2f));

    Box<Orange> box2 = new Box<>();
    box2.contentsOfBox.add(new Orange(1.8f));
    box2.contentsOfBox.add(new Orange(1.7f));

    System.out.println(box1.getWeightOfBox(box1));
    System.out.println(box2.getWeightOfBox(box2));

    System.out.println(box1.compareBox(box2));

    Box<Apple> box3 = new Box<>();
    box3.contentsOfBox.add(new Apple(1.3f));

    box1.moveToAnotherBox(box3);
    System.out.println(box3.contentsOfBox);
    }
}
