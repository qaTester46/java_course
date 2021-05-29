public class MyFirstProgram {

    public static void main(String[] args) {

        Points p = new Points(3, 4, 5, 6);
        System.out.println("Расстояние между точками с координатами (" + p.x1 + ";" + "" + p.y1 + ") и" +
                " (" + p.x2 + "" + ";" + p.y2 + ")" + " равно: " + distance(p));
    }

    public static double distance(Points points) {
        return Math.sqrt((points.x1 - points.x2) * (points.x1 - points.x2) + (points.y1 - points.y2) * (points.y1 - points.y2));
    }
}