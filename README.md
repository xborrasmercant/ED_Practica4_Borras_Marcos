# Práctica 4
## Xavier Borrás Mercant y Miguel Marcos Nazco



### Versión inicial.
Para iniciar la práctica 4, hemos ido al directorio del proyecto de la práctica 3 y hemos iniciado la consola de *Git* desde ahí.

Una vez abierta la consola de *Git*, ejecutamos el comando `git init` para crear el **repositorio** y a continuación usamos `git add .` para añadir los archivos del proyecto a la *Staging Area* y registrarlos con un `git commit -m`.

Subimos nuestro commit a *GitHub*, con el siguiente comando `git remote add origin https://github.com/xborrasmercant/ED_Practica4_Borras_Marcos.git` y `git push -u origin main`.

Creamos un nuevo tag con el nombre: *v1.0.0* con `git tag v1.0.0 -m "Versión inicial"` y lo subimos a *GitHub* con `git push --tags`



### Rama de Desarrollo y refactorización (v1.1.0, v1.2.0 y 2.0.0).
Una vez tenemos nuestra versión inicial subida a *GitHub* procedemos a crear una nueva rama de **desarrollo** donde modificar, de manera segura, nuestro proyecto. Para ello deberemos ejecutar el siguiente comando: `git branch desarrollo` y nos moveremos dentro de la nueva rama con el comando `git checkout desarrollo`.

Una vez dentro de la nueva rama (*desarrollo*), realizamos la **primera  refactorización**; esta consiste en separar las clases en dos paquetes **distinitos** según las clases que estén relacionadas.De este modo las clases *Persona*, *Adulto*, *Niño* y *Juguete* estarán en un paquete distinto al de las clases *Motor*, *Barco*, *Sonido (interfaz)*, *Mascota*, *Gato* y *Perro*.

Una vez divididas las clases por paquetes las añadimos a la *Staging Area* y realizamos el *commit* y lo subimos a *GitHub* con el comando `git push --set-upstream origin desarrollo`. Creamos un nuevo tag con el nombre *v1.1.0* y le hacemos push para subirlo a *GitHub*.

A continuación, hacemos la **segunda refactorización** la cual consiste en cambiar el nombre de los paquetes, y de sus respectivas *referencias*, a un nombre más **identificativo**. En este caso los hemos llamado *paquete_persona* y *paquete_motor* respectivamente.

Y hacemos lo mismo que con la anterior **refactorización**, añadimos a *Staging Area*, usamos `git commit -m`, lo subimos a *GitHub* y creamos un nuevo tag con el nombre *v1.2.0*, para así indicar su versión.

Una vez comprobado que nuestra última versión es estable la deberemos unir con la rama *master*, para ello primero deberemos cambiarnos a dicha rama con `git checkout master` y desde ahí subir la rama *desarrollo* con `git merge desarrollo`. A continuación estableceremos un nuevo tag para indicar la nueva versión del proyecto (v2.0.0).



### Segunda rama de Desarrollo y refactorización (2.1.0, 2.2.0 y 3.0.0).
Una vez tenemos la **versión** *2.0.0* deberemos crear una nueva rama segura de **desarrollo** igual que la anterior y cambiarnos a esta. Una vez estemos dentro aplicaremos la primera **refactorización**, esta consistirá en **optimizar** los constructores mediante el uso de *setters* dentro de estos.

Una vez tengamos la refactorización terminada, lo añadimos al *Staging Area*, realizamos un *commit*, lo subimos a *GitHub* con `git push --set-upstream origin desarrollo`. Creamos un nuevo tag con el nombre *v2.1.0* y le hacemos push para subirlo a *GitHub*.

A continuación, realizaremos la última refactorización; esta consistirá en aprovechar el **constructor completo** dentro del **constructor vacío** y así minimizar las líneas del código. Una vez hayamos terminado de refactorizar, realizaremos el habitual proceso de añadir los nuevos cambios a la *Staging Area*, realizar el commit, subir a *GitHub* con `git push --set-upstream origin desarrollo`. Creamos un nuevo tag con el nombre *v2.2.0* y le hacemos push para subirlo a *GitHub*.

Finalmente, deberemos unir la rama *desarrollo* con la rama *master*. Para ello deberemos movernos a la rama *master* con el siguiente comando: `git checkout master` y, como con la anterior rama la subiremos la rama *desarrollo* con el comando `git merge desarrollo`. Para terminar deberemos crear un nuevo tag con la versión final (v3.0.0)

Y así termina nuestra Práctica 4.

