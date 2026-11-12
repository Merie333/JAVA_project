public class DynamicThings extends AnimatedThings {
    // Attributs propres à DynamicThings (sa vitesse de déplacement)
    // On les met en "private" ou "protected" (private est la bonne pratique d'encapsulation)
    private double speedX;
    private double speedY;

    // Constructeur complet (avec les vitesses)
    public DynamicThings(int x, int y, int height, int width, double speedX, double speedY) {
        // 1. On initialise d'abord la partie "AnimatedThings" (qui initialise SolidThings -> Things)
        super(x, y, height, width);
        
        // 2. On initialise ensuite les variables spécifiques à DynamicThings
        this.speedX = speedX;
        this.speedY = speedY;
    }

    // Constructeur simple (si on crée un objet dynamique à l'arrêt, vitesse = 0)
    // C'est ce qu'on appelle la "surcharge" de constructeur (même nom, paramètres différents)
    public DynamicThings(int x, int y, int height, int width) {
        super(x, y, height, width);
        this.speedX = 0;
        this.speedY = 0;
    }
}