# Cover para programación orientada objetos

## Descripción del Proyecto

Este proyecto es un workshop para practicar conceptos de programación en Java. 


## Requisitos Previos

Antes de comenzar, asegúrate de tener instalado:

- **JDK 17 o superior**: El proyecto está configurado para usar Java 17
- **Git**: Para clonar y gestionar el repositorio
- **Un IDE**: Se recomienda IntelliJ IDEA

## Cómo Trabajar con este Repositorio

### Paso 1: Hacer Fork del Repositorio

El primer paso es crear una copia del repositorio en tu cuenta de GitHub. Esto te permitirá trabajar de manera independiente sin afectar el repositorio original.

1. Ve al repositorio original en GitHub (el enlace te lo proporcionará tu profesor)
2. Haz clic en el botón **"Fork"** en la esquina superior derecha
3. Selecciona tu cuenta personal como destino del fork
4. Espera a que GitHub complete la copia del repositorio

**¿Por qué hacer fork?** El fork crea una copia completa del repositorio bajo tu control, permitiéndote hacer cambios, commits y push sin necesidad de permisos especiales en el repositorio original.

### Paso 2: Clonar tu Fork

Una vez que tengas tu fork, necesitas descargarlo a tu máquina local para trabajar en él.

### Paso 3: Programar y Subir cambios

```bash

# Sube los cambios sincronizados a tu fork
git add .
git commit -m "avances"
git push -u origin main
```

## Metodología de Trabajo

Este proyecto sigue la metodología **Test-Driven Development (TDD)**, lo que significa que los tests ya están escritos y tu trabajo es hacer que pasen implementando el código correcto.


### Orden Sugerido de Implementación

Se recomienda seguir este orden de dificultad creciente:

**Nivel Básico:**
1. `sumarDosNumeros()`
2. `mayorDeTresNumeros()`
3. `contarCaracteres()`
4. `convertirAMayusculas()` y `convertirAMinusculas()`
5. `areaCirculo()`

**Nivel Intermedio:**
6. `sumaElementos()` y `promedioElementos()`
7. `encontrarElementoMayor()` y `encontrarElementoMenor()`
8. `buscarElemento()`
9. `invertirArreglo()` y `invertirCadena()`
10. `tablaMultiplicar()`
11. `contarPalabras()`
12. `buscarSubcadena()` y `reemplazarSubcadena()`

**Nivel Avanzado:**
13. `factorial()`
14. `esPrimo()`
15. `serieFibonacci()`
16. `esPalindromo()`
17. `ordenarArreglo()`
18. `eliminarDuplicados()`
19. `rotarArreglo()`
20. `validarCorreoElectronico()`
21. `convertirABinario()` y `convertirAHexadecimal()`
22. `jugarPiedraPapelTijeraLagartoSpock()` y `pptls2()`
23. `zoodiac()`

## Integración Continua

El proyecto incluye configuración de GitHub Actions para CI/CD. Cada vez que hagas push a tu repositorio:

1. Se ejecutará automáticamente la compilación
2. Se ejecutarán todos los tests
3. Se generará un reporte de resultados

Puedes ver el estado de tus builds en la pestaña "Actions" de tu repositorio en GitHub.



## Estructura del Proyecto

```
Workshop_repaso/
├── .github/
│   └── workflows/
│       └── ci.yml              # Configuración de CI/CD
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Workshop.Workshop.java   # Clase principal con métodos a implementar
│   └── test/
│       └── java/
│           └── WorkshopTest.java  # Tests unitarios con JUnit 5
├── pom.xml                     # Configuración de Maven
└── README.md                   # Este archivo
```

## Requisitos para la Interfaz Gráfica de Usuario (GUI)

Como parte del proyecto, deberás crear una interfaz gráfica que permita al usuario interactuar con los métodos implementados. La GUI debe cumplir con los siguientes requisitos:

### Requisitos Funcionales Obligatorios

1. **Menú de Navegación**
   - La aplicación debe presentar un menú principal con categorías de funcionalidades:
     - Operaciones Matemáticas
     - Manipulación de Arreglos
     - Procesamiento de Cadenas
     - Juegos y Entretenimiento
     - Conversiones Numéricas
   - El usuario debe poder navegar fácilmente entre las diferentes secciones

2. **Entrada de Datos**
   - Campos de texto claramente etiquetados para ingresar parámetros
   - Validación de entrada antes de ejecutar operaciones
   - Mensajes de error descriptivos cuando la entrada sea inválida
   - Soporte para diferentes tipos de datos (números, cadenas, arreglos)

3. **Visualización de Resultados**
   - Área dedicada para mostrar los resultados de las operaciones
   - Formato claro y legible de los resultados
   - Para arreglos: mostrar los elementos de forma estructurada
   - Opción para limpiar resultados anteriores

4. **Funcionalidades Específicas por Categoría**

   **Operaciones Matemáticas:**
   - Calculadora básica (suma de dos números)
   - Calculadora de factorial con límite razonable (n ≤ 20)
   - Verificador de números primos
   - Generador de serie de Fibonacci
   - Calculadora de área de círculo
   - Calculador de signos zodiacales

   **Manipulación de Arreglos:**
   - Entrada de arreglos mediante texto separado por comas
   - Visualización del arreglo original y el resultado
   - Operaciones disponibles: ordenar, invertir, eliminar duplicados, rotar
   - Búsqueda de elementos
   - Cálculo de mayor, menor, suma y promedio

   **Procesamiento de Cadenas:**
   - Campo de texto multilinea para cadenas largas
   - Transformaciones: mayúsculas, minúsculas, invertir
   - Verificación de palíndromos
   - Contador de caracteres y palabras
   - Búsqueda y reemplazo de subcadenas
   - Validador de correos electrónicos con retroalimentación visual

   **Juegos:**
   - Interfaz para Piedra, Papel, Tijera, Lagarto, Spock
   - Botones o imágenes para cada opción
   - Visualización animada del resultado
   - Contador de victorias, derrotas y empates
   - Historial de las últimas 5 jugadas

   **Conversiones:**
   - Conversor decimal a binario
   - Conversor decimal a hexadecimal
   - Visualización lado a lado de diferentes representaciones



## Recursos Adicionales

- [Documentación de JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
- [Guía de Maven](https://maven.apache.org/guides/getting-started/)
- [Java API Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [Java Swing Tutorial](https://docs.oracle.com/javase/tutorial/uiswing/)
- [JavaFX Documentation](https://openjfx.io/)

## Consejos para el Éxito

1. **Lee cuidadosamente los tests antes de implementar**: Los tests son tu especificación más precisa
2. **Implementa los métodos en orden de dificultad**: Comienza con los más simples para ganar confianza
3. **Haz commits frecuentes**: Cada método implementado merece un commit
4. **No copies código de internet**: El propósito es que aprendas. Si te atascas, consulta con el profesor
5. **Ejecuta los tests constantemente**: El feedback inmediato te ayudará a corregir errores rápidamente
6. **Documenta tu código**: Aunque los métodos ya tienen documentación básica, puedes agregar comentarios explicando tu lógica
7. **Para la GUI, haz bocetos en papel primero**: Diseñar la interfaz antes de programar te ahorrará tiempo


---

## Licencia

Este proyecto es material educativo. Siéntete libre de aprender y experimentar.

**¡Buena suerte con el workshop y disfruta programando! 🚀**
