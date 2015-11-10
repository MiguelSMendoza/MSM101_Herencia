# MSM101_Herencia
##Batalla por Arrakis
Implementar un juego de carácter aleatorio que implemente las clases del diagrama.
[Ver Diagrama](http://i.imgur.com/kqfRYX2.png)

###Especificaciones
* Un ser vivo es capaz de demostrar su estado de vida (estaVivo() un valor que determina si está vivo o no)

* Todos los Guerreros de la batalla son seres vivos y por tanto deben implementar una forma de demostrar que están vivos, para ello un Guerrero devolverá el valor de una variable booleana privada (vivo) que cambiará en caso de ser alcanzado en la implementación de estaVivo(). Todos los guerreros tienen un factor que determina si un disparo lo ha alcanzado o no. Este factor es una variable entera (blanco) entre 0 y 10 calculado de forma aleatoria (generaBlanco()) cuando se crea un Guerrero.

* En una batalla luchan dos tipos de guerreros, Fremen y Sardaukar. Cada guerrero sabe en todo momento cuantos de sus compañeros siguen vivos (variable total de tipo estática). Ambos tipos de guerrero tienen la capacidad de recibir un disparo. Esta operación determina si un disparo recibido es igual a la propiedad blanco de cada guerrero y decrementa la variable total en caso de haber recibido un disparo de carácter mortal para informar al resto de sus compañeros de su muerte, es decir, todos los Fremen comparten una misma variable que puede ser modificada por cualquier guerrero y consultada de igual forma.

* En una batalla intervienen dos Naves, una nave Fremen, y otra nave Sardaukar. La tripulación de cada nave consta de diez guerreros de un determinado tipo. El tipo de nave (Fremen o Sardaukar) viene determinado por la variable somos. Una nave tiene la capacidad de generar un disparo hacia la otra nave. La generación de un disparo consiste en el cálculo de un número aleatorio entre 0 y 10. Del mismo modo, una nave deberá recibir los disparos de la otra nave. Un disparo afectará a todos aquellos guerreros cuya variable blanco sea igual al número generado por la nave enemiga. La operación deberá, por tanto, recorrer la lista de la tripulación y comparar el valor de este disparo con la propiedad blanco de cada miembro de la tripulación, decrementando la variable total cuando proceda. Una nave puede saber en cada momento cuantos guerreros quedan en su nave preguntando a cualquier miembro de la tripulación.

* Una Batalla genera las dos naves que intervienen e introduce en cada una el número de guerreros correspondiente. Una vez preparadas, comienza la batalla por turnos determinada por el siguiente algoritmo:

```
Mientras (NaveFremen.cuantosQuedan()>0 Y NaveFremen.cuantosQuedan()>0) Hacer 
  Desde i=0 Hasta i=9
    NaveFremen.recibeDisparo(NaveSardaukar.generaDisparo())
    NaveSardaukar.recibeDsisparo(NaveFremen.generaDisparo()) 
  FinDesde
FinMientras
Si NaveFremen.cuantosQuedan()>0 Entonces
  Imprimir "Ganan los Fremen" 
Sino
  Imprimir "Ganan los Sardaukar" 
FinSi
```
