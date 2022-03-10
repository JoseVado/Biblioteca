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
  `id` 					INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `isbn` 				INT(255) NOT NULL,
  `nombre` 				VARCHAR(255) NOT NULL,
  `autor` 				VARCHAR(255) NOT NULL,
  `fecha de ingreso`	VARCHAR(255) NOT NULL,
  `categorias` 		VARCHAR(255) NOT NULL,
  `cantidad` 			VARCHAR(255) NOT NULL,
  `disponible`  		INT(11) NOT NULL,
  `descripcion` 		VARCHAR(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `id` 				INT(11) NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `user_id` 		INT(11) NOT NULL,
  `book_id` 		INT(11) NOT NULL,
  `date_out` 		VARCHAR(255) NOT NULL,
  `date_return` 	VARCHAR(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--
-- Nombre completo, fecha de nacimiento, dirección, CURP, telefono, correo electronico 

CREATE TABLE `usuarios` (
  `id` 						INT(11) NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `curp` 					VARCHAR(18) NOT NULL,
  `nombre_completo` 		VARCHAR(100) NOT NULL,
  `domicilio` 				VARCHAR(250) NOT NULL,
  `tel` 						VARCHAR(25) NOT NULL,
  `correo_electronico` 	VARCHAR(250) NOT NULL,
  `sanciones` 				INT(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--
-- CURP, nombre completo, fecha de nacimiento y fecha de ingreso

CREATE TABLE `empleados` (
  `id` 						INT(11) NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
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
  `id` 							INT(11) NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `cliente` 					VARCHAR(250) NOT NULL,
  `fecha_final` 				DATE NOT NULL,
  `fecha_pago` 				DATE DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;



