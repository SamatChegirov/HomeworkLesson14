/*Бир Super класс жана анын бир sub классын түзүңүз.
Super класска 1поле 1метод түзүңүз.
Sub класска 2уникальный поле жана 2метод түзүңүз.
Main класстан sub класстын объектисин түзүп,
баардык маанилерин жана методдорун консольго toString()методун колдонуп чыгарыңыз.*/

public class Main {
    public static void main(String[] args) {

        Color color = new Color("red", "emal'", "chemical ");
        System.out.println(color);

        color.colorPaint();
        color.colorWash();
    }
}