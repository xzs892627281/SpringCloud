CREATE TABLE `config_properties` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `key1` varchar(50)   NOT NULL,
  `value1` varchar(500)   DEFAULT NULL,
  `application` varchar(50)   NOT NULL,
  `profile` varchar(50)   NOT NULL,
  `label` varchar(50)   DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3  


insert into `config_properties` (`id`, `key1`, `value1`, `application`, `profile`, `label`) values('1','server.port','8083','config-client','dev','master');
insert into `config_properties` (`id`, `key1`, `value1`, `application`, `profile`, `label`) values('2','foo','bar-jdbc','config-client','dev','master');
