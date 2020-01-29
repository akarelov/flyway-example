create sequence hibernate_sequence start 1 increment 1;

create table author (
    id bigint NOT NULL,
    age integer,
    first_name varchar(255),
    last_name varchar(255),
    start_date date,
    PRIMARY KEY (id)
);

create table note
(
    id bigint NOT NULL,
    date date,
    text varchar(2048),
    author_id bigint,
    PRIMARY KEY (id),
    CONSTRAINT note_author_fk
    FOREIGN KEY (author_id) references author
);