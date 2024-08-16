DROP table if exists heroes;

create table heroes (
  id SERIAL PRIMARY KEY,
  name varchar(255),
  hero_classes varchar(255),
  level int,
  experience int,
  attack int,
  defense int,
  hp int
);
