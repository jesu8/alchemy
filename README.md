# 🧪 Alchemy

Bienvenido a **Alchemy**, una calculadora de alquimia en Java que te permite gestionar recetas, ingredientes y tu mochila de materiales.  
Ideal para juegos, prototipos o como ejemplo de arquitectura modular en Java.

> **Nota:** Las recetas incluidas pertenecen al juego **Ni no Kuni** y todos los materiales están exclusivamente en español.

---

## ✨ Características

- Consulta recetas que puedes crear según tus materiales.
- Visualiza qué ingredientes te faltan para completar otras recetas.

---

## 📦 Estructura del Proyecto

```
alchemy/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/com/jesu/alchemy/
│   │   │   ├── Main.java
│   │   │   ├── data/RecetasData.java
│   │   │   ├── model/Ingrediente.java, Receta.java
│   │   │   └── service/AlquimiaService.java, MochilaStorage.java
│   │   └── resources/mochila.json
│   └── test/java/com/jesu/alchemy/AlchemyApplicationTests.java
```

---

## ⚙️ Requisitos

- Java 11 o superior (recomendado Java 17+)
- Maven 3.6+

---

## 🚀 Cómo ejecutar

1. **Clona el repositorio:**
   ```sh
   git clone <URL-del-repo>
   cd alchemy
   ```

2. **Compila el proyecto:**
   ```sh
   ./mvnw clean package
   ```

3. **Ejecuta la aplicación:**
   ```sh
   java -jar target/alquimia.jar
   ```
   O bien, para desarrollo:
   ```sh
   ./mvnw exec:java
   ```

---

## 📝 Uso

Al iniciar, verás un menú con las recetas disponibles según los materiales en tu mochila (`mochila.json`).  
El sistema te indicará qué puedes crear y qué ingredientes te faltan para otras recetas.

---

## 🛠️ Personalización

- Agrega o edita recetas en `RecetasData.java`.
- Modifica los materiales iniciales en `src/main/resources/mochila.json`.

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas!  
Abre un issue o pull request para sugerencias, mejoras o correcciones.

---

## 📄 Licencia

Este proyecto está bajo la licencia MIT.

---

Desarrollado con 💡 por jesu8
