package task1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    todo LMS
//     Создайте класс Animal с одним методом которые есть 3 наследника такие как
//        Shark, с методом attack(), Turtle с методом swim(), Eagle с методом fly().
//                Создайте массив используя Animal и положите туда всех наследников.
//        Используя instanceOf и getClass() вызовите свои методы животных из массива Animal.
//                Для каждого объекта по отдельности создайте массив и разделите животных из
//                Animal massiva и положите в свои массивы.

        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            }
        }
        Shark[] sharks = new Shark[animals.length];
        Turtle[] turtles = new Turtle[animals.length];
        Eagle[] eagles = new Eagle[animals.length];
        int sharkIndex = 0, turtleIndex = 0, eagleIndex = 0;
        for (Animal animal : animals) {
            if (animal.getClass() == Shark.class) {
                sharks[sharkIndex++] = (Shark) animal;
            } else if (animal.getClass() == Turtle.class) {
                turtles[turtleIndex++] = (Turtle) animal;
            } else if (animal.getClass() == Eagle.class) {
                eagles[eagleIndex++] = (Eagle) animal;
            }

            System.out.println(sharkIndex);
            System.out.println(turtleIndex);
            System.out.println(eagleIndex);

        }

    }
}


