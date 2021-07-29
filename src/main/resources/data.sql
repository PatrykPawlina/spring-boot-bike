DROP TABLE IF EXISTS BIKER CASCADE;
CREATE TABLE BIKER
(
    id         LONG AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(200) NOT NULL,
    last_name  VARCHAR(200) NOT NULL
);

INSERT INTO BIKER(first_name, last_name) VALUES ('Patryk', 'Nowak');

DROP TABLE IF EXISTS BIKE CASCADE;
CREATE TABLE BIKE
(
    id         LONG AUTO_INCREMENT PRIMARY KEY,
    bike_brand VARCHAR(200) NOT NULL,
    bike_model VARCHAR(200) NOT NULL,
    bike_type  VARCHAR(200) NOT NULL,
    age        BIGINT       NOT NULL,
    biker_id   BIGINT       NOT NULL

);

INSERT INTO BIKE(bike_brand, bike_model, bike_type, age, biker_id) VALUES ('Trek', 'Emonda', 'Road', 3, 1);