--
-- Base de datos: `library`
--
DROP DATABASE IF EXISTS library;
CREATE DATABASE library;
USE library;
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `libros`
-- 
-- nombre del libro, código isbn, categorías, fecha de ingreso, el autor, una descripción del libro y cantidad

CREATE TABLE `libros` (
  `id` 					INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `isbn` 				VARCHAR(13) NOT NULL,
  `nombre` 				VARCHAR(255) NOT NULL,
  `autor` 				VARCHAR(255) NOT NULL,
  `categorias` 		VARCHAR(255) NOT NULL,
  `cantidad` 			INT NOT NULL,
  `disponible`  		INT NOT NULL,
  `descripcion` 		VARCHAR(255) NOT NULL,
  `fecha_de_ingreso`	DATE NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `id` 				INT NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `usuario` 		INT NOT NULL,
  `libro` 			INT NOT NULL,
  `date_out` 		DATE NOT NULL,
  `date_return` 	DATE NOT NULL,
  `days` 			INT NOT NULL,
  `days_cost` 		INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--
-- Nombre completo, fecha de nacimiento, dirección, CURP, telefono, correo electronico 

CREATE TABLE `usuarios` (
  `id` 						INT NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `curp` 					VARCHAR(18) NOT NULL,
  `nombre_completo` 		VARCHAR(100) NOT NULL,
  `domicilio` 				VARCHAR(250) NOT NULL,
  `tel` 						VARCHAR(25) NOT NULL,
  `correo_electronico` 	VARCHAR(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--
-- CURP, nombre completo, fecha de nacimiento y fecha de ingreso

CREATE TABLE `empleados` (
  `id` 						INT NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `curp` 					VARCHAR(18) NOT NULL,
  `nombre_completo` 		VARCHAR(100) NOT NULL,
  `fecha_nacimiento` 	DATE NOT NULL,
  `fecha_ingreso` 		DATE NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `multas`
--
-- id, fecha de cambio, precio por dia

CREATE TABLE `multas` (
  `id` 						INT NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `fecha_cambio` 				DATE NOT NULL,
  `precio_por_dia` 				INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;


-- --------------------------------------------------------

INSERT INTO `libros` (`isbn`,`nombre`,`autor`,`categorias`,`cantidad`,`disponible`,`descripcion`,`fecha_de_ingreso`) VALUES
	('1111','LIBRO','PRUEBA', 'NINGUNA', 2, 2, 'DESCRIPCION PRUEBA', '2022/03/09'),
	('2222','LIBRO','PRUEBA', 'NINGUNA', 2, 2, 'DESCRIPCION PRUEBA', '2022/03/09')
	;

INSERT INTO `prestamos` (`date_out`,`date_return`,`usuario`,`libro`,`days_cost`,`days`) VALUES
	('2022/03/09','2022/03/09',1,1111,2,0),
	('2022/03/09','2022/03/11',1,2222,3,2),
	('2022/03/09','2022/03/12',2,1111,3,3),
	('2022/03/09','2022/03/15',2,2222,5,6)
	;
	
INSERT INTO `usuarios` (`curp`,`nombre_completo`,`domicilio`,`tel`,`correo_electronico`) VALUES
	('prueba','zaira','domicilio','111111','zaira@gmail.com'),
	('prueba','vado','domicilio','22222','vado@gmail.com')
	;
	
INSERT INTO `multas` (`fecha_cambio`,`precio_por_dia`) VALUES
	('2022/03/09',2),
	('2022/03/11',3),
	('2022/03/15',5);

