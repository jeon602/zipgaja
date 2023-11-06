CREATE DATABASE music;

CREATE TABLE musiclist(
                          Name varchar(255),
                          Title varchar(255),
                          ReleaseDate varchar(255),
                          Price varchar(255),
                          Production varchar(255)
);


Select *FROM musiclist;
use music;
INSERT INTO musiclist(name, title, releasedate, price, production) VALUE ('Minsu','XXLove','2019-10-05','23,500','SugarRecord');
