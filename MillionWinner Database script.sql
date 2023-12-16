CREATE DATABASE MillionWinner;
use MillionWinner;
create table user(
id bigint primary key AUTOINCREMENT,
username varchar(255) UNIQUE,
password longtext,
score int,
level int
);

create table question(
id bigint primary key,
question varchar(255),
options varchar(255),
correctOptionIndex int,
category varchar(255),
questionLevel int,
qustionScore int
);

