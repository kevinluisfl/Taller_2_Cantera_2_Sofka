# Cantera 2 Sofka 

## Taller 2 - Abstracciones, interfaces y polimorfismo

### Software

- Use el IDE Netbeans 8.2 para crear el programa
- Previamente instalado el JDK 8, 16.0.1  

### Información taller

1. Realizar una extracción de atributos genéricos abstractos e interfaces, que puedas identificar en el artículo. Crear las interfaces y clases abstractas que creas convenientes según la lectura.

2. Crear al menos dos comportamientos abstractos de una nave.

3. Crear al menos cuatro tipos de naves diferentes con diferentes comportamiento, si es posible hacer una sobrecarga y una sobreescritura de métodos.

4. Crear una clase principal que permita crear las naves de forma tal este bajo una condición booleana o por medio de una regla estipulada dentro de un switch-case o if-else.

5. El programa debe tener una ejecución infinita, hasta que el usuario no diga que quiere terminar el programa, este no deberá culminar.

### desarrollo
```
Cree una clase padre abstracta: Sapacecraft 
Cuatro clases hijas que heredan de la principal: LaunchVehicles, RoboticSpacecraft, MannedSpacecraft, Satellite
Dos interfaces: IUtilities, IOrbit
```

- Se crean los atributos y métodos de cada clase
- Se implementan y sobrecargan los métodos necesarios
- En la main class se crea el código para la creación de naves de forma dinámica

> Hice uso en gran parte de JOptionPane y ArrayList para la construcción de la solución

### Instrucciones

`Clonar proyecto - abrir en IDE `

`Ejecutar el archivo: ShipBuilder.java del package main `

### Icono nave

![](https://images.vexels.com/media/users/3/150030/isolated/lists/21f6aa2ebb5547cb55eab996913e3007-ilustracion-de-nave-espacial.png)

> es.vexels.com

#### Referencias:
`<link>` : <https://mkyong.com/swing/java-swing-joptionpane-showinputdialog-example/>
`<link>` : <https://www.w3schools.com/java/ref_string_equals.asp>
`<link>` : <https://mkyong.com/swing/java-swing-how-to-make-a-confirmation-dialog/>
`<link>` : <https://images.vexels.com/media/users/3/150030/isolated/lists/21f6aa2ebb5547cb55eab996913e3007-ilustracion-de-nave-espacial.png></https://images.vexels.com/media/users/3/150030/isolated/lists/21f6aa2ebb5547cb55eab996913e3007-ilustracion-de-nave-espacial.png>
