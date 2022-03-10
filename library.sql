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

INSERT INTO `libros` (`isbn`,`nombre`,`autor`,`categorias`,`cantidad`,`disponible`,`descripcion`,`fecha_de_ingreso`) VALUES
	('2313','LIBRO','DON PRUEBAS', 'NINGUNA', 2, 2, 'DESCRIPCION PRUEBA', '2022/03/09'),
	('2313','LIBRO','DON PRUEBAS', 'NINGUNA', 2, 2, 'DESCRIPCION PRUEBA', '2022/03/09')
	;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `id` 				INT NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `usuario` 		INT NOT NULL,
  `libro` 			INT NOT NULL,
  `date_out` 		DATE NOT NULL,
  `date_return` 	DATE NOT NULL
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
  `correo_electronico` 	VARCHAR(250) NOT NULL,
  `sanciones` 				INT DEFAULT '0'
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
-- dias, precio, cliente, fecha_inicio, fecha_pago

CREATE TABLE `multas` (
  `id` 							INT NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `cliente` 					VARCHAR(250) NOT NULL,
  `fecha_final` 				DATE NOT NULL,
  `fecha_pago` 				DATE DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;



