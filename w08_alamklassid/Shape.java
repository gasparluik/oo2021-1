
//abstraktne klass kujundi üldmõõtmetega
abstract class Shape{
    //muutujad
    String type = "";

	public void setType(String type) {
        this.type = type;
    }

    //tavalised mitte abstraktiivsed meetodid.
    public void moveTo(int x, int y){
        System.out.println(this.type + "asukoht x-il: "+x+"ja Y-l:" + y);
    }
    //abstraktsed meetodid, mida alamklassid siit extendivad
    abstract public Double Circumference();
    abstract public Double Area();




    
}