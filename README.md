# Commands to create the database

```bash
CREATE DATABASE movie_db;
use movie_db;
CREATE TABLE movies (id bigint(20) auto_increment primary key, title varchar(50), category varchar(50), quantity int);
# I don't watch movies, maybe I'll update this later
INSERT INTO movies (title, category, quantity) VALUES("a", "a", 20);
INSERT INTO movies (title, category, quantity) VALUES("b", "a", 20);
INSERT INTO movies (title, category, quantity) VALUES("c", "b", 20);
INSERT INTO movies (title, category, quantity) VALUES("d", "b", 20);
INSERT INTO movies (title, category, quantity) VALUES("e", "c", 20);
INSERT INTO movies (title, category, quantity) VALUES("f", "c", 20);
SELECT * FROM movies;
```