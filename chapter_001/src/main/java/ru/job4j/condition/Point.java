package ru.job4j.condition;

public class Point {
    /**
     * Это поле объекта. Оно доступно только кокретному объекту.
     */
    private int x;
    /**
     * И это поле объекта. Оно доступно только кокретному объекту.
     */
    private int y;
    private int z;
    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this(x, y);
        this.z = z;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2) + Math.pow((that.z - this.z), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
