drop table if  exists students cascade;

create table students(
    id serial primary key,
    name character varying(255),
    score int default 0
);