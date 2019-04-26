heroku plugins:install java

heroku buildpacks:clear

./mvnw package

heroku deploy:jar target/project-0.0.1-SNAPSHOT.jar --app seisvue
