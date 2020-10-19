package ru.mirea.Java3;
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "(x,y): ("+this.x+","+this.y+") speed: ("+xSpeed+","+ySpeed+")";
    }

    @Override
    public void moveUp() {
        moveUp();
    }

    @Override
    public void moveDown() {
        moveDown();
    }

    @Override
    public void moveLeft() {
        moveLeft();
    }

    @Override
    public void moveRight() {
        moveRight();
    }
}