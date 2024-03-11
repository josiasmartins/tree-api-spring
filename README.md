# Api Tree with spring

## Archicts
![img.png](src%2Fmain%2Fresources%2Fstatic%2Fimg.png)
## How use
#### 1. Clone repo
```bash
git clone https://github.com/josiasmartins/tree-api-spring.git
```

#### 2. install mysql and execute code above
```sql
CREATE database forest;

USE forest;

CREATE TABLE tree(
    id_tree int AUTO_INCREMENT,
    name VARCHAR(100),
    type_tree VARCHAR(100),
    PRIMARY KEY (id_tree)
);

```

## How use with docker

##### 1. Pull image tree_api_spring
```bash
    docker pull josiasmartins/tree_api_spring
```
##### 2. Create container and run
```bash
    docker run -p 8080:8080 josiasmartins/tree_api_spring
```
#### 3. Access api 
```bash
http://localhost:8080/tree
```

## How request for terminal
#### POST
```bash
curl -X 'POST' \
  -H "Content-Type: application/json" \
  -d '{"name": "siinza", "typeTree": "tropical"}' \
  http://localhost:8080/tree

```
#### GET
```bash
curl -X 'GET' -H "Content-Type: application/json" http://localhost:8080/tree/1
```

#### GET ALL
```bash
curl -X 'GET' -H "Content-Type: application/json" http://localhost:8080/tree
```


### swagger
 http://localhost:8080/swagger-ui/index.html

### Cors | How fixed cors

```java
@Configuration
public class CorsConf {

    @Bean
    WebMvcConfigurer corsConfiguration() {
        return new WebMvcConfigurer() {
          @Override
          public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedMethods("GET", "POST", "PUT", "DELETE")
                    .allowedOrigins("*");
          }
        };
    }

}
```
 
