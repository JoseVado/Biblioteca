--
-- Base de datos: `library`
--
DROP DATABASE IF EXISTS library
create database library;
use library;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `books`
--

CREATE TABLE `books` (
  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `edit` varchar(255) NOT NULL,
  `lang` varchar(255) NOT NULL,
  `pages` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `ejemplares` varchar(255) NOT NULL,
  `stock` int(11) NOT NULL,
  `available` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lendings`
--

CREATE TABLE `lendings` (
  `id` int(11) NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `book_id` int(11) NOT NULL,
  `date_out` varchar(255) NOT NULL,
  `date_return` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `last_name_p` varchar(30) NOT NULL,
  `last_name_m` varchar(30) NOT NULL,
  `domicilio` varchar(250) DEFAULT NULL,
  `tel` varchar(25) DEFAULT NULL,
  `sanctions` int(11) DEFAULT '0',
  `sanc_money` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

