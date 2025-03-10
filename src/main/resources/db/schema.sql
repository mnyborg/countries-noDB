USE worldcountries;

DROP TABLE IF EXISTS countries;

CREATE TABLE countries(
    id   BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);


