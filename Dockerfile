FROM maven:3.8.4-jdk-11 as build
# cria uma pasta build
WORKDIR /build
# copia tudo para a pasta  build
COPY . .

RUN mvn clean package -DsskipTests

# dependencie java (imagem)
FROM openjdk:11
WORKDIR /app

# copia o arquivo do jar para o WORDIR /app/application.jar
COPY --from=build ./build/target/*jar ./application.jar
# porta da imagem
EXPOSE 8080
# comando para executar o projeto
ENTRYPOINT java -jar application.jar