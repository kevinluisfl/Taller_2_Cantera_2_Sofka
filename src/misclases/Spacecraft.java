
package misclases;

/**
 * Clase principal abstracta  
 *
 * @author Kevin Luis Flórez Lozada
 */
public abstract class Spacecraft {
    /**
     * ATTRIBUTES
     */
    /**
     * nombre
     */
    public String name;
    /**
     * potencia
     */
    public float power;
    /**
     * velocidad
     */
    public float speed;
    /**
     * sistema de propulsión
     */
    public String propulsionSystem;
    /**
     * peso
     */
    public float weight;
    /**
     * altura
     */
    public float height;
    /**
     * anchura
     */
    public float width; 
    /**
     * profundidad
     */
    public float depth;
    /**
     * combustible
     */
    public String fuel;
    /**
     * sistema de energia
     */
    public String energySystem;
    
    /**
     * CONSTRUCTORS
     */
    /**
     * constructor por default
     */
    public Spacecraft(){
    }
    /**
     * constructor con todos los atributos
     * @param name nombre
     * @param power potencia
     * @param speed velocidad
     * @param propulsionSystem sistema de propulsión
     * @param weight peso
     * @param height altura
     * @param width anchura
     * @param depth profundidad
     * @param fuel combustible
     * @param energySystem sistema de energia
     */
    public Spacecraft(String name, float power, float speed, String propulsionSystem, float weight, float height, float width, float depth, String fuel, String energySystem) {
        this.name = name;
        this.power = power;
        this.speed = speed;
        this.propulsionSystem = propulsionSystem;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.fuel = fuel;
        this.energySystem = energySystem;
    }
    
    /**
     * Métodos abstractos de la clase
     */
    /**
     * método abstracto turnOn
     */
    public abstract void turnOn();
    /**
     * método abstracto turnOff
     */
    public abstract void turnOff();
    
    /**
     * método validateOrbit, no necesita implementación, se puede sobreescribir
     */
    public void validateOrbit(){
        System.out.println("No calculada");
    };

}
