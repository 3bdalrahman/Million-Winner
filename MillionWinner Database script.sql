CREATE DATABASE MillionWinner;
use MillionWinner;
create table user(
id bigint primary key,
username varchar(255),
passwrord longtext,
score int,
levle int
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

