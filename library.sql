-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-05-2022 a las 05:07:49
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

DROP DATABASE IF EXISTS library;
CREATE DATABASE library;
USE library;

--
-- Base de datos: `library`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id` int(11) NOT NULL,
  `curp` varchar(18) NOT NULL,
  `nombre_completo` varchar(100) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `fecha_ingreso` date NOT NULL,
  `trabajo` varchar(100) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `contraseña` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `curp`, `nombre_completo`, `fecha_nacimiento`, `fecha_ingreso`, `trabajo`, `usuario`, `contraseña`) VALUES
(1, 'CURP', 'Admin', '2000-01-01', '2022-03-09', 'Administrador', 'admin', 'admin'),
(2, 'CURP2', 'Empleado', '2000-01-01', '2022-03-09', 'Empleado', 'juanPerez', '12345'),
(3, 'HEMZ0190NS1', 'Zaira Hernandez Martinez', '2001-07-07', '2022-05-13', 'Administrador', 'zai_x', 'zaira1215'),
(4, 'JVR709HGDNM73', 'Jose Eduardo Vado Robles', '2000-09-08', '2022-05-13', 'Administrador', 'vado', 'admin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id` int(11) NOT NULL,
  `isbn` varchar(13) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `autor` varchar(255) NOT NULL,
  `categorias` varchar(255) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `disponible` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `fecha_de_ingreso` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`id`, `isbn`, `nombre`, `autor`, `categorias`, `cantidad`, `disponible`, `descripcion`, `fecha_de_ingreso`) VALUES
(1, '12345678910', 'Ingenieria de software Un enfoque practico', 'Roger S Pressman', 'Informatica, software, redes', 5, 4, 'La séptima edición de Ingeniería del software: un enfoque práctico tiene la intención de funcionar\nnar como guía hacia una disciplina de ingeniería que madura', '2022-03-09'),
(2, '10987654321', 'Fundamentos de matematicas financieras', 'Carlos Ramirez Molinares', 'administracion, contabilidad, finanzas', 2, 2, 'Este texto puede servir de guía con las carreras de pregrado como:\nContaduría publica, administración de empresas, economía, \ningeniería industrial y carreras afines.', '2022-03-09'),
(3, '12345109876', 'INTRODUCCION A LA  INGENIERIA INDUSTRIAL ', 'Felipe Gutarra Meza ', 'Industrial, ingeniería', 6, 4, 'En general la importancia de la ingeniería y \nen especial la industrial, en un país que \nforma parte de un mundo globalizado.', '2022-05-13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `multas`
--

CREATE TABLE `multas` (
  `id` int(11) NOT NULL,
  `fecha_cambio` date NOT NULL,
  `precio_por_dia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `multas`
--

INSERT INTO `multas` (`id`, `fecha_cambio`, `precio_por_dia`) VALUES
(1, '2022-03-09', 2),
(2, '2022-03-11', 3),
(3, '2022-03-15', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `id` int(11) NOT NULL,
  `usuario` int(11) NOT NULL,
  `libro` varchar(13) NOT NULL,
  `date_out` date NOT NULL,
  `date_return` date NOT NULL,
  `days` int(11) NOT NULL,
  `days_cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `prestamos`
--

INSERT INTO `prestamos` (`id`, `usuario`, `libro`, `date_out`, `date_return`, `days`, `days_cost`) VALUES
(1, 1, '12345678910', '2022-03-09', '2022-03-09', 0, 2),
(2, 1, '10987654321', '2022-03-09', '2022-03-11', 2, 3),
(3, 2, '12345678910', '2022-03-09', '2022-03-12', 3, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `curp` varchar(18) NOT NULL,
  `nombre_completo` varchar(100) NOT NULL,
  `domicilio` varchar(250) NOT NULL,
  `tel` varchar(25) NOT NULL,
  `correo_electronico` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `curp`, `nombre_completo`, `domicilio`, `tel`, `correo_electronico`) VALUES
(1, 'HEMZ010707A1', 'Ricardo Diego Penagos Arenas', 'Orizaba 112 colonia progreso y paz', '9213079806', 'ricardo@gmail.com'),
(2, 'VRH7071089A', 'Daniel Sanchez Perez', 'Laureles #12 col campos del monte', '987678965', 'dani@gmail.com'),
(3, 'HEMZ8973992KA', 'Heidi Hernandez Martinez', 'Mixteca #89 col. Progreso y paz', '9218976543', 'heidi@hotmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `multas`
--
ALTER TABLE `multas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `multas`
--
ALTER TABLE `multas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
