public class MyFirstProgram {

    public static void main(String[] args) {

        Point p1 = new Point(2, 3);
        Point p2 = new Point(1, 2);

        System.out.println("Расстояние между точкой X(" + p1.x +";"+ p1.y +") и точкой Y(" + p2.x +";"+ p2.y + ") равно: " + p1.distance(p2));
    }


}