drop table if exists `test`;

CREATE TABLE `test` (
                        `id` BIGINT NOT NULL COMMENT 'id',
                        `name` VARCHAR(50) COMMENT 'name',
                        `password` VARCHAR(50) COMMENT 'password',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='test';

# insert into `demo`(id, name) values (1,'test');
insert into `test`(id, name, password) values (1,'test','pssword');


drop table if exists `ebook`;
create table `ebook`
(
    `id`           bigint not null comment 'id',
    `name`         varchar(50) comment 'name',
    `category1_id` bigint comment 'category1',
    `category2_id` bigint comment 'category2',
    `description`  varchar(200) comment 'description',
    `cover`        varchar(200) comment 'cover',
    `doc_count`    int comment 'docs',
    `view_count`   int comment 'view',
    `vote_count`   int comment 'upvote',
    primary key (`id`)
) engine = innodb
  default charset = utf8mb4 comment ='e-book';


insert into `ebook` (id, name, description)
VALUES (1, 'Spring Boot Beginner Tutorial',
        'Beginner guide to Java development, the preferred framework for enterprise application development');
insert into `ebook` (id, name, description)
VALUES (2, 'Vue Beginner Tutorial',
        'Beginner guide to Vue development, the preferred framework for enterprise application development');
insert into `ebook` (id, name, description)
VALUES (3, 'Python Beginner Tutorial',
        'Beginner guide to Python development, the preferred framework for enterprise application development');
insert into `ebook` (id, name, description)
VALUES (4, 'MySQL Beginner Tutorial',
        'Beginner guide to MySQL development, the preferred framework for enterprise application development');
insert into `ebook` (id, name, description)
VALUES (5, 'Oracle Beginner Tutorial',
        'Beginner guide to Oracle development, the preferred framework for enterprise application development');

drop table if exists `demo`;
create table `demo`(
                       `id` bigint not null comment 'id',
                       `name` varchar(50) comment 'name',
                       primary key (`id`)

) engine=innodb default charset=utf8mb4 comment='test';

insert into `demo` (id, name) values (1, 'test');
