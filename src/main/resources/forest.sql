CREATE database forest;

USE forest;

CREATE TABLE tree(
    id_tree int AUTO_INCREMENT,
    name VARCHAR(100),
    type_tree VARCHAR(100),
    PRIMARY KEY (id_tree)
);