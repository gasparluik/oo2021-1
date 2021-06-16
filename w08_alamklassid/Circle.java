class Circle extends Shape {
    //muutujad
    Double radius;
    Double calc;

    Circle(Double radius, String type){
        setType("Ring"); //super funktsioon, mis tuleneb Shapeist
        this.radius = radius;
    }

    @Override
    public Double Circumference() {
        // ümbermõõt
        calc= 2*  (Math.PI * radius);
        return calc;
    }

    @Override
    public Double Area() {
        // pindala
        calc = Math.PI *(radius*radius);
        return calc;
    }

    @Override
    public void moveTo(int x, int y) {
        super.moveTo(x, y);
        
    }
    
}