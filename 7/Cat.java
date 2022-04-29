package HW7;
/**
 * Java. Lesson 1. Homework 7
 * @author Telepov Vladislav
 * @version Date: 29.04.2022 г.
 */

public class Cat {
    private String name;
    private int appetite; // Сколько ест
    private boolean fullness; // Статус сытости
    private int foods;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate p) {
        if (!fullness) { // - Проверка сытости кота
        foods = p.food;
        //System.out.println(foods); - Вывод сколько еды в тарелке перед кормлением следующего кота.
        fullness = p.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return name + ((appetite > foods? (" Не поел, не хватает еды в тарелке: " + appetite) : (" Поел: " + appetite)) + ", Сытость: " + fullness);
    }
}
