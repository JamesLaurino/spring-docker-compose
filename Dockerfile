# Utilisez une image Java officielle en tant que base
FROM maven:3.8.5-openjdk-17

# Copiez le fichier JAR dans le conteneur
COPY ./target /app

# Définissez le répertoire de travail
WORKDIR /app

EXPOSE 8080

# Commande pour exécuter l'application lorsque le conteneur démarre
CMD ["java", "-jar", "spring-app.jar"]