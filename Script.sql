CREATE DATABASE pruebaIBM;
use pruebaIBM;
 
CREATE TABLE `proveedores` (
  `id_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `fecha_de_alta` DATE,
  `id_cliente` int(11) DEFAULT NULL, 
  PRIMARY KEY (`id_proveedor`)
) ;
 
 
 INSERT INTO `proveedores` (`nombre`, `fecha_de_alta`,`id_cliente`) 
VALUES ('Coca-cola', '2020-12-12', 5);

INSERT INTO `proveedores` (`nombre`, `fecha_de_alta`,`id_cliente`) 
VALUES ('Pepsi', '2020-03-06', 5 );

INSERT INTO `proveedores` (`nombre`, `fecha_de_alta`,`id_cliente`) 
VALUES ('Redbull', '2020-01-12', 6 );

SELECT * from proveedores;
 