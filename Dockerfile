# Usamos la imagen oficial de Java 21
FROM eclipse-temurin:21-jdk

# Establecemos el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el archivo JAR de nuestra aplicación
COPY target/*.jar app.jar

# Comando que se ejecutará cuando inicie el contenedor
ENTRYPOINT ["java","-jar","app.jar"]