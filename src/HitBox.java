/* Dnas ce jeu on dois savoir si 2 objets se touchent, axe horizontal (ox) et axe vertical (oy)*/
// On a 5 attributs privés : x, y, width, height en double et name en string

public class HitBox{
    private double x ;
    private double y; 
    private double width;
    private double height; 
    private String name; 

    //constructeur (5 paramètres) + constructeur par default selon l'UML:
    public HitBox(double x, double y, double width, double height, String name) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.name = name;
    }
    public HitBox(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
        this.name = "HitBox";
    }

    // Pour ce jeu : d'autre classes auront besoin de connaitre les attributes de HitBox, mais on ne veut pas qu'ils puissent les modifier donc on garde en les private mais on peut créer des getters pour chaque attribut privé.
    // Getters seront nos méthodes d'accès 'public' pour chauqe attribut 'private' de la classe HitBox.
    // UML : getX et getY

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public String getName(){
        return this.name;
    }
    public boolean intersect(HitBox anotherHitBox){
        double leftX, leftWidth, rightX;
        if (this.x <= anotherHitBox.x){
            leftX = this.x;
            leftWidth = this.width;
            rightX = anotherHitBox.x;

        } else {
            leftX = anotherHitBox.x;
            leftWidth = anotherHitBox.width;
            rightX = this.x;
        }
        boolean xOverlap = (leftX +leftWidth > rightX);
        
        double topY, topHeight, bottomY;
        if (this.y <= anotherHitBox.y){
            topY =this.y;
            topHeight = this.height;
            bottomY = anotherHitBox.y;
        } else {
            topY = anotherHitBox.y;
            topHeight = anotherHitBox.height;
            bottomY = this.y;
        }

        boolean yOverlap = (topY + topHeight > bottomY);

        return xOverlap && yOverlap;
    }
}

