public class MyFirstProgram {

    public static void main(String[] args) {

        Points p = new Points(3, 4, 5, 6);
        System.out.println("Расстояние между точками с координатами (" + p.x1 + ";" + "" + p.y1 + ") и" +
                " (" + p.x2 + "" + ";" + p.y2 + ")" + " равно: " + p.distance());
    }

}