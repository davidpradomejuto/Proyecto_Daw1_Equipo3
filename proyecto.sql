-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-05-2023 a las 16:20:55
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--
CREATE DATABASE IF NOT EXISTS `proyecto` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `proyecto`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `uuid` varchar(36) NOT NULL COMMENT 'Codigo para generar UUID en MySQL:\nUUID()',
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `dni_UNIQUE` (`dni`),
  UNIQUE KEY `telefono_UNIQUE` (`telefono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`uuid`, `dni`, `nombre`, `apellidos`, `telefono`, `direccion`, `localidad`, `fecha_nacimiento`) VALUES
('075d1279-e8c8-3868-a3c4-2f43cefa7b49', '72877085K', 'Bruno', 'Cortes Mesa', 622282154, 'Camino Batuelos 5', 'Guipuzcoa', '1999-03-06'),
('104942e2-2a79-3f88-b29b-d531fbfd6b93', '20630079E', 'Nerea', 'Llamas Angulo', 672125386, 'Carrer Mara 78', 'Burgos', '2003-09-06'),
('16bc4e32-6db8-3001-b546-67c6f78d0313', '85487686K', 'Veronica', 'Carren Malave Hijo', 650381729, 'Travessera Alarcon A', 'Palencia', '1983-04-26'),
('18729732-a351-3e51-8f9f-9e4ec1f97ef5', '69777496G', 'Marco', 'Nevarez Maga', 625115293, 'Camino Adrian 13', 'Ibiza', '2019-06-07'),
('1b+A4791692c-8ac4-3e00-bdfa-3749f128', '54679054G', 'Guillermo', 'Aguado Segundo', 646325471, 'Ronda Villalobos 32', 'Avila', '2001-06-08'),
('1e2d2465-5825-372c-9cd8-05f2611ba3ed', '70700931N', 'Olga', 'Razo Melandez', 690548339, 'Camino Andres', 'Cadiz', '1975-07-28'),
('21152f4b-b280-380c-971a-bc54c2a72765', '02354537G', 'Mateo', 'Griego Armendriz', 698964737, 'Camino Mara Dolores 2', 'Cantabria', '1988-07-09'),
('27648b5e-051f-3d9e-ab66-f05dd4211f74', '19414270Q', 'Eduardo', 'Alvarez', 676202186, 'Carrer Rivas 9', 'Avila', '1987-01-07'),
('30a37f22-45bd-3ea3-b910-c15f2d20b8cb', '88480554Z', 'Nuria', 'Ballesteros Vela', 686327345, 'Travessera Gonzalo', 'Zamora', '1991-12-18'),
('37d8d125-52f6-38c6-a480-0b774d33d578', '00323000B', 'Mireia', 'Villalpando Tercero', 664916455, 'Plaza Lola 32', 'Badajoz', '2004-10-23'),
('39209447-3ffd-31a0-944f-71f2550e7ad5', '85237861E', 'Carlota', 'Esquibel Tercero', 696575148, 'Plaza Aitana 65', 'Zamora', '1987-12-15'),
('39786164-237f-32c9-a2b0-e22e15afbf2f', '37940699Z', 'Gerard', 'Biel Espinosa', 672609277, 'Ronda Marc 65', 'Avila', '1973-09-17'),
('399be0a2-9285-3f8c-bb30-3cab5e43acd4', '02095975P', 'Ian', 'Bravo Botello', 624540969, 'Praza Pereira 3', 'Alava', '1978-11-04'),
('44b61fb5-7364-3dfd-ad25-13453efd9b5c', '90521192T', 'Eval', 'Carbaja Barroso', 661872660, 'Ruela Angel 6', 'Cadiz', '1991-08-14'),
('4b0c1232-b0f4-3cb2-85c5-f62d1b362ad9', '76847615S', 'Vera', 'Henriquez', 609933272, 'Camino Fatima 123', 'Cantabria', '1991-12-09'),
('4bff0752-5af8-35b4-8e3f-3ee6a9542a7', '13963032P', 'Dr. Cristian', 'Mares', 608672952, 'Calle Lidia 56', 'Albacete', '1999-04-21'),
('4c2aab6e-9f42-34a8-8f7e-1649e3906574', '65100914N', 'Antonio Marian', 'Caballero', 650114838, 'Ronda Haro', 'Cantabria', '1974-12-16'),
('4dd25d0b-f870-3cd8-b8a4-1c69df82fed2', '48541329J', 'Marcos', 'Raz Campos', 656618592, 'Plaza Rivero 56', 'Cantabria', '1974-10-01'),
('52814732-0c70-325c-9bc8-7c696c5b3de7', '85081928Y', 'Unai', 'Quintanilla Verduzco', 662030526, 'Calle Rubio 56', 'Girona', '1967-01-24'),
('548bfd47-7931-3fec-ac54-bbaf969311c0', '92064009T', 'Inmaculada', 'Ozuna Tamez', 686366785, 'Travesa Aleix 67', 'Las Palmas', '2001-06-18'),
('5bfc8d60-db56-39b8-8910-ac24b1c0e935', '90213084T', 'Unai', ' Corona', 647102012, 'Praza Marina 111', 'Caceres', '2000-03-04'),
('5bfc8d60-db56-39b8-8910-ac24b1c0e937', '11719886Y', 'Ing. Dario', ' Rojo Tercero', 690324833, 'Travesaña Diego 10', 'Avila', '1971-06-10'),
('641c67b2-df77-392f-9ef2-b0cb29ff9f7f', '57583717C', 'Valeria', 'Estrada Rocha', 659649582, 'Passeig Casillas', 'Zamora', '2001-08-31'),
('694476d2-b213-3d05-8f82-b371b81a99ab', '82035223L', 'Sr. Unai', 'Baca Segundo', 656190332, 'Travessera Isaac 22', 'Las Palmas', '1986-08-19'),
('7b2686e5-01cf-355c-b34b-77ae66ffd904', '83747340Q', 'Juan', ' Tijerina', 624004492, 'Avenida Otero 4', 'Avila', '1994-04-23'),
('81942ad5-70b4-38de-aa41-4a17ac40bcf6', '59233013D', 'Celia', 'Taballez Segundo', 604464547, 'Camino Rubio 8', 'Teruel', '1978-01-15'),
('89e16e10-566f-3905-a700-e941c1f8e90f', '27096489M', 'Francisco Javier', 'Roman', 680416207, 'Calle Garibay 3', 'Burgos', '2000-04-28'),
('8c7d8981-0787-3f87-b8eb-258a171c26f4', '00635628Y', 'Yaiza De Anda Hijo', 'Amparo Bueno', 648476231, 'Ruela Lola 87', 'Palencia', '1986-07-18'),
('94056002-047b-337e-8a05-43a7a5296bc5', '18450520N', 'Alfaro', 'Borrego', 67892, 'Os Castro', 'Caceres', '1983-11-07'),
('95a342b4-e3d8-3761-beba-2b610ac3fc77', '71278618P', 'Hector', 'Saldaza Gomez', 655035742, 'Avinguda Cesar 3', 'Burgos', '1996-11-30'),
('9c496750-76d5-3868-84b1-cf9e0b02a61a', '80336977R', 'Sra. Patricia', 'Velazquez', 633992687, 'Avinguda Pantoja', 'Zamora', '1995-07-18'),
('9d66f444-253a-3288-bf4b-da0346060e37', '31823042N', 'Gonzalo', 'Gaona Hijo', 692360888, 'Camino Gael 4', 'Alava', '2000-07-28'),
('9eae39d8-1286-338c-9ccc-febb7a0960d7', '35764985P', 'Srta. Aina', 'Echevarria Abrego', 666040864, 'Avinguda Barrera 67', 'Badajoz', '1972-05-10'),
('9fe6dc3e-d2ce-3ab3-aae9-e5c4f48df1a1', '90106375B', 'Guillem', ' Quintero', 659616591, 'Ronda Elsa 2', 'Girona', '2004-08-30'),
('aaadb0fa-a96e-35bb-9fcc-20271f867c5e', '67224927K', 'Nora', 'Armijo', 678517678, 'Plaza Luis 367', 'Cadiz', '1976-07-20'),
('afba8c66-0e8d-3043-9206-905ec158b14d', '06132084P', 'Srta. Nil Ogeda', 'De la Fuente Hijo', 640175733, 'Ronda Alvarado 432', 'Barcelona', '1984-08-02'),
('b9e9f368-a32f-3cb5-b860-82cfa3a3e82d', '23154026H', 'Margarita', 'Porras', 629005962, 'Avinguda Juan 64', 'Cantabria', '1993-04-28'),
('cae40185-58c9-369a-be9a-28948453e988', '73752345Q', 'Cristian', 'Centeno', 667100943, 'Avinguda Tijerina 1', 'Las Palmas', '2002-08-24'),
('cc96e4a2-0abc-3daa-87f2-b7495a6ae260', '03811555H', 'Lola', 'De Jenes', 616992514, 'Ronda Aleix 5', 'Passeig Oliver', '2002-04-05'),
('d9db876f-2b2e-34d3-9566-31e0437306fd', '20006581P', 'Yago', 'Nadia Adame', 695678022, 'Plaza Florez 66', 'Asturias', '2004-05-18'),
('da3b368e-d75f-3e19-a0b3-e8454ec11c3e', '57188147G', 'Yolanda', ' Lomeli Carballo', 699024754, 'Camino Menchaca 76', 'Lugo', '1971-01-28'),
('e588c751-3072-363c-bf1e-8f14cbedaed3', '80733746C', 'Daniel', 'Covarrubias Sanabria', 649211810, 'Camino Sofia 222', 'Ibiza', '1997-02-17'),
('e59fdfe5-840a-3cdb-af1a-31d98b2f7863', '60839427B', 'Francisco', 'Alcaraz', 636564000, 'Calle Delapaz 5', 'Burgos', '2003-08-03'),
('e68bcfd2-dd91-3a83-84fa-38b17bf77af5', '95085345X', 'Carla Puig', 'Vega Altamirano', 626654443, 'Passeig Ander 55', 'Salamanca', '2001-01-11'),
('e68bcfd2-dd91-3a83-84fa-38b17bf77af6', '04167463R', 'Daria Carolina', ' Nava Segundo', 609951814, 'Praza Gonzalo 12', 'Cantabria', '1974-11-08'),
('f17ab904-7359-34c6-9896-95c828332658', '23679838G', 'Aitor ', 'Segundo Berraos', 649267024, 'Plaza Ignacio 7', 'A Coruña', '2005-02-05'),
('f3e41661-c132-3338-860e-7bde96b4c484', '58023228R', 'Nerea', 'Prado', 673865782, 'Travessera Espinosa 2', 'Huesca', '1986-05-05'),
('f9a0dc00-ef3d-3c8e-a14f-eb1732ee13bc', '82838589H', 'Nahia', ' Covarrubias Rosas', 668360911, 'Plaza Eva 21', 'Caceres', '2002-05-17'),
('fc207196-8583-3917-b3a6-443ca93e25ef', '75023617D', 'D. Alberto', 'Viera Tercero', 672285801, 'Paseo Gabriel 13', 'Teruel', '1987-11-04'),
('ff2d44ea-7437-3dc0-ae20-ee6d9be37082', '80802978E', 'Luna', 'Mireia Zabala', 696097662, 'Avinguda Diego 77', 'Caceres', '1999-04-02');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas_bancarias`
--

DROP TABLE IF EXISTS `cuentas_bancarias`;
CREATE TABLE IF NOT EXISTS `cuentas_bancarias` (
  `iban` varchar(32) NOT NULL,
  `id_cliente` varchar(36) NOT NULL,
  `tipo_cuenta` varchar(45) NOT NULL,
  `saldo` double DEFAULT NULL,
  `nomina_ultimo_mes` double DEFAULT NULL COMMENT 'El pago que recibio de la nomia del ultimo mes',
  `nomina_media` double DEFAULT NULL COMMENT 'Ha de ser la media de los 12 ultimos meses',
  PRIMARY KEY (`iban`),
  KEY `fk_cuentas_bancarias_clientes1` (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `cuentas_bancarias`
--

INSERT INTO `cuentas_bancarias` (`iban`, `id_cliente`, `tipo_cuenta`, `saldo`, `nomina_ultimo_mes`, `nomina_media`) VALUES
('ES0200111595599590239344', 'e59fdfe5-840a-3cdb-af1a-31d98b2f7863', 'Ahorros', 1912.86, 222.25, 334.386),
('ES0302302987927362099451', 'e588c751-3072-363c-bf1e-8f14cbedaed3', 'Ahorros', 5725.7, 1009.57, 980),
('ES0401332951162192206717', '548bfd47-7931-3fec-ac54-bbaf969311c0', 'Ahorros', 2125.97, 980, 1200),
('ES0600959276628273972408', '5bfc8d60-db56-39b8-8910-ac24b1c0e937', 'Ahorros', 9548.47, 339.4, 700),
('ES0921033396840563506990', '9eae39d8-1286-338c-9ccc-febb7a0960d7', 'Ahorros', 19134.54, 1870.7, 2200.2),
('ES1001551318117086038214', '399be0a2-9285-3f8c-bb30-3cab5e43acd4', 'Personal', 61866.19, 1850.5, 2000),
('ES1130577656117414915251', 'b9e9f368-a32f-3cb5-b860-82cfa3a3e82d', 'Personal', 297613.97, 3258.6, 3200),
('ES1220809917524711754473', '37d8d125-52f6-38c6-a480-0b774d33d578', 'Ahorros', 55.7, 55.7, 55.7),
('ES1710016934156652502155', '7b2686e5-01cf-355c-b34b-77ae66ffd904', 'Ahorros', 8792.15, 1017, 1000),
('ES1714940026286407172485', '94056002-047b-337e-8a05-43a7a5296bc5', 'Ahorros', 2205.96, 770, 800),
('ES1831043321193688784620', 'fc207196-8583-3917-b3a6-443ca93e25ef', 'Personal', 112.24, 1200, 996.43),
('ES2220861851469588689149', 'e68bcfd2-dd91-3a83-84fa-38b17bf77af5', 'Personal', 33467.51, 3950, 2600),
('ES2331403726762961999171', '104942e2-2a79-3f88-b29b-d531fbfd6b93', 'Personal', 47781.14, 1500, 1500),
('ES2520492467789497881377', '641c67b2-df77-392f-9ef2-b0cb29ff9f7f', 'Empresarial', 923435, 245000, 200000),
('ES3020405034477891655883', 'afba8c66-0e8d-3043-9206-905ec158b14d', 'Ahorros', 4747.6, 365, 500),
('ES3401853620396807742947', '44b61fb5-7364-3dfd-ad25-13453efd9b5c', 'Empresarial', 500015.73, 20954.89, 68872.97),
('ES3701681366715524583976', '4b0c1232-b0f4-3cb2-85c5-f62d1b362ad9', 'Ahorros', 23.81, 525.14, 706),
('ES4400974726098512800357', 'aaadb0fa-a96e-35bb-9fcc-20271f867c5e', 'Ahorros', 0, 0, 0),
('ES4402099799289935670258', '89e16e10-566f-3905-a700-e941c1f8e90f', 'Personal', 42341.82, 1780, 2000),
('ES4500043037319066375066', 'f17ab904-7359-34c6-9896-95c828332658', 'Empresarial', 771732.67, 274315.64, 3005000),
('ES5101540451110372336177', '694476d2-b213-3d05-8f82-b371b81a99ab', 'Personal', 18274.6, 3200, 2700),
('ES5202180395834796389622', 'f3e41661-c132-3338-860e-7bde96b4c484', 'Empresarial', 1000000, 570600.1, 600000),
('ES5304884925197529680601', '4bff0752-5af8-35b4-8e3f-3ee6a9542a77', 'Ahorros', 7186.18, 2800.01, 3000),
('ES5312360852976796136917', '27648b5e-051f-3d9e-ab66-f05dd4211f74', 'Personal', 28900.12, 1200, 1105),
('ES5401220331370322420813', '1e2d2465-5825-372c-9cd8-05f2611ba3ed', 'Empresarial', 811878, 25000, 13400),
('ES5501040751340464595783', '52814732-0c70-325c-9bc8-7c696c5b3de7', 'Personal', 40041.34, 1124.8, 1300),
('ES5601148740177915584141', '9c496750-76d5-3868-84b1-cf9e0b02a61a', 'Empresarial', 687153.82, 18, 25000),
('ES5630637645145809278031', 'cc96e4a2-0abc-3daa-87f2-b7495a6ae260', 'Ahorros', 51.858, 980, 980),
('ES5815024923082224260803', '95a342b4-e3d8-3761-beba-2b610ac3fc77', 'Empresarial', 577475.83, 18000, 35000),
('ES5900587591630242128149', 'cae40185-58c9-369a-be9a-28948453e988', 'Personal', 24146.94, 2984, 2000),
('ES5900730382163175033645', 'da3b368e-d75f-3e19-a0b3-e8454ec11c3e', 'Ahorros', 2325.79, 150, 300),
('ES6302026203106361358740', '4836d5d5-8564-3599-8474-4322cb7bc54c', 'Personal', 10051.73, 1000.77, 1336.8),
('ES6631830526966728022514', '39209447-3ffd-31a0-944f-71f2550e7ad5', 'Ahorros', 10.2, 35.64, 40.67),
('ES6701825551713755545241', '39786164-237f-32c9-a2b0-e22e15afbf2f', 'Personal', 322768.85, 1500, 980),
('ES6820748839112848986438', '4c2aab6e-9f42-34a8-8f7e-1649e3906574', 'Empresarial', 881764.07, 90000, 90000),
('ES7130857979532315145902', '18729732-a351-3e51-8f9f-9e4ec1f97ef5', 'Ahorros', 30.97, 240.72, 82),
('ES7220117371954924952094', '9fe6dc3e-d2ce-3ab3-aae9-e5c4f48df1a1', 'Ahorros', 2.29, 110.62, 350.5),
('ES7331215503589505142705', 'ff2d44ea-7437-3dc0-ae20-ee6d9be37082', 'Personal', 35737, 1200, 2200),
('ES7500971121095176874084', '4dd25d0b-f870-3cd8-b8a4-1c69df82fed2', 'Ahorros', 5154.31, 2375.17, 2100),
('ES7500971121095176874085', '8c7d8981-0787-3f87-b8eb-258a171c26f4', 'Ahorros', 1761.41, 1000, 1000),
('ES7901498602996700119149', '1b91692c-8ac4-3e00-bdfa-3749f1286c95', 'Personal', 26409.2, 2000, 2000),
('ES8231129406898501710837', '075d1279-e8c8-3868-a3c4-2f43cefa7b49', 'Empresarial', 770065.01, 15098.7763, 69363),
('ES8620052355135806122814', '21152f4b-b280-380c-971a-bc54c2a72765', 'Empresarial', 802508, 82000, 90000),
('ES8830933816085803854628', '30a37f22-45bd-3ea3-b910-c15f2d20b8cb', 'Empresarial', 809236.23, 100000, 100000),
('ES8920284630252751199867', 'd2330ee9-28bc-334e-9425-e36cf94454a1', 'Ahorros', 1889.68, 678, 800),
('ES8920527612316483781063', 'd9db876f-2b2e-34d3-9566-31e0437306fd', 'Personal', 47000.15, 2000, 2000),
('ES9002270318890805824158', 'f9a0dc00-ef3d-3c8e-a14f-eb1732ee13bc', 'Personal', 15510.17, 980, 1750),
('ES9400191424391295461666', '9d66f444-253a-3288-bf4b-da0346060e37', 'Personal', 31946, 2200.1, 1100),
('ES9621052251244579154224', '81942ad5-70b4-38de-aa41-4a17ac40bcf6', 'Personal', 45067.8, 1500.2, 3200),
('ES9731312596415195962344', '16bc4e32-6db8-3001-b546-67c6f78d0313', 'Personal', 35814.81, 1200, 980);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimientos`
--

DROP TABLE IF EXISTS `movimientos`;
CREATE TABLE IF NOT EXISTS `movimientos` (
  `num_operacion` int(11) NOT NULL AUTO_INCREMENT,
  `emisor` varchar(36) NOT NULL,
  `iban_origen` char(24) NOT NULL,
  `iban_destino` char(24) NOT NULL,
  `cantidad` double(12,2) NOT NULL COMMENT 'La cantidad de capital que se ha movido en la operacion, puede ser negativa o positiva',
  `concepto` varchar(80) DEFAULT NULL COMMENT 'Hecho del movimiento de capital: nomina, pago con tarjeta, retirada en cajero, etc',
  PRIMARY KEY (`num_operacion`),
  KEY `fk_movimientoCliente_clientes1` (`emisor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--

DROP TABLE IF EXISTS `pagos`;
CREATE TABLE IF NOT EXISTS `pagos` (
  `num_pago` int(11) NOT NULL AUTO_INCREMENT,
  `id_preconcedido` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  PRIMARY KEY (`num_pago`),
  KEY `fk_pagosCliente_prestamosConcedidos1_idx` (`id_preconcedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfiles`
--

DROP TABLE IF EXISTS `perfiles`;
CREATE TABLE IF NOT EXISTS `perfiles` (
  `uuid` varchar(36) NOT NULL,
  `credenciales` varchar(36) DEFAULT NULL,
  `estado_civil` varchar(36) NOT NULL COMMENT 'Estado civil: Casado, soltero',
  `situacion_laboral` varchar(36) NOT NULL COMMENT 'Situacion laboral: empleado, desempleado, autónomo, pensionista, rentista, estudiante, ama de casa',
  `morosidad` tinyint(1) NOT NULL,
  `proceso_judicial` tinyint(1) NOT NULL,
  `uuid_Pareja` varchar(36) DEFAULT NULL COMMENT 'dni de la pareja si es que la pareja sea cliente del mismo banco',
  `en_gananciales` tinyint(1) DEFAULT 0 COMMENT 'El matrimonio es ganancial o hay separacion de bienes',
  PRIMARY KEY (`uuid`),
  KEY `fk_perfilesCliente_clientes_idx` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `perfiles`
--

INSERT INTO `perfiles` (`uuid`, `credenciales`, `estado_civil`, `situacion_laboral`, `morosidad`, `proceso_judicial`, `uuid_Pareja`, `en_gananciales`) VALUES
('075d1279-e8c8-3868-a3c4-2f43cefa7b49', NULL, 'soltero', 'autonomo', 1, 1, NULL, 0),
('104942e2-2a79-3f88-b29b-d531fbfd6b93', NULL, 'casado', 'desempleado', 0, 0, '1e2d2465-5825-372c-9cd8-05f2611ba3ed', 0),
('16bc4e32-6db8-3001-b546-67c6f78d0313', NULL, 'soltero', 'empleado', 0, 0, NULL, 0),
('18729732-a351-3e51-8f9f-9e4ec1f97ef5', NULL, 'soltero', 'estudiante', 1, 0, NULL, 0),
('1b+A4791692c-8ac4-3e00-bdfa-3749f128', NULL, 'soltero', 'desempleado', 0, 1, NULL, 0),
('1e2d2465-5825-372c-9cd8-05f2611ba3ed', NULL, 'casado', 'autonomo', 0, 0, '104942e2-2a79-3f88-b29b-d531fbfd6b93', 1),
('21152f4b-b280-380c-971a-bc54c2a72765', NULL, 'soltero', 'autonomo', 1, 1, NULL, 0),
('27648b5e-051f-3d9e-ab66-f05dd4211f74', NULL, 'soltero', 'rentista', 0, 0, NULL, 0),
('30a37f22-45bd-3ea3-b910-c15f2d20b8cb', NULL, 'soltero', 'autonomo', 1, 0, NULL, 0),
('37d8d125-52f6-38c6-a480-0b774d33d578', NULL, 'casado', 'responsable_del_hogar', 0, 0, NULL, 1),
('39209447-3ffd-31a0-944f-71f2550e7ad5', NULL, 'casado', 'empleado', 0, 0, NULL, 0),
('39786164-237f-32c9-a2b0-e22e15afbf2f', NULL, 'soltero', 'empleado', 0, 0, NULL, 0),
('399be0a2-9285-3f8c-bb30-3cab5e43acd4', NULL, 'soltero', 'pensionista', 0, 0, NULL, 0),
('44b61fb5-7364-3dfd-ad25-13453efd9b5c', NULL, 'soltero', 'autonomo', 0, 0, NULL, 0),
('4b0c1232-b0f4-3cb2-85c5-f62d1b362ad9', NULL, 'soltero', 'empleado', 0, 0, NULL, 0),
('4bff0752-5af8-35b4-8e3f-3ee6a9542a7', NULL, 'casado', 'empleado', 1, 0, 'cc96e4a2-0abc-3daa-87f2-b7495a6ae260', 0),
('4c2aab6e-9f42-34a8-8f7e-1649e3906574', NULL, 'casado', 'autonomo', 0, 0, '9c496750-76d5-3868-84b1-cf9e0b02a61a', 1),
('4dd25d0b-f870-3cd8-b8a4-1c69df82fed2', NULL, 'soltero', 'empleado', 0, 0, NULL, 0),
('52814732-0c70-325c-9bc8-7c696c5b3de7', NULL, 'casado', 'rentista', 0, 0, NULL, 0),
('548bfd47-7931-3fec-ac54-bbaf969311c0', NULL, 'soltero', 'rentista', 0, 0, NULL, 0),
('5bfc8d60-db56-39b8-8910-ac24b1c0e935', NULL, 'soltero', 'estudiante', 0, 1, NULL, 0),
('5bfc8d60-db56-39b8-8910-ac24b1c0e937', NULL, 'casado', 'responsable_del_hogar', 1, 1, NULL, 0),
('641c67b2-df77-392f-9ef2-b0cb29ff9f7f', NULL, 'soltero', 'autonomo', 0, 1, NULL, 0),
('694476d2-b213-3d05-8f82-b371b81a99ab', NULL, 'soltero', 'empleado', 0, 1, NULL, 0),
('7b2686e5-01cf-355c-b34b-77ae66ffd904', NULL, 'soltero', 'desempleado', 0, 0, NULL, 0),
('81942ad5-70b4-38de-aa41-4a17ac40bcf6', NULL, 'soltero', 'desempleado', 0, 0, NULL, 0),
('89e16e10-566f-3905-a700-e941c1f8e90f', NULL, 'soltero', 'empleado', 0, 0, NULL, 0),
('8c7d8981-0787-3f87-b8eb-258a171c26f4', NULL, 'soltero', 'desempleado', 0, 0, NULL, 0),
('94056002-047b-337e-8a05-43a7a5296bc5', NULL, 'soltero', 'rentista', 0, 0, NULL, 0),
('95a342b4-e3d8-3761-beba-2b610ac3fc77', NULL, 'soltero', 'autonomo', 1, 1, NULL, 0),
('9c496750-76d5-3868-84b1-cf9e0b02a61a', NULL, 'casado', 'autonomo', 0, 0, '4c2aab6e-9f42-34a8-8f7e-1649e3906574', 1),
('9d66f444-253a-3288-bf4b-da0346060e37', NULL, 'soltero', 'desempleado', 0, 0, NULL, 0),
('9eae39d8-1286-338c-9ccc-febb7a0960d7', NULL, 'soltero', 'desempleado', 0, 0, NULL, 0),
('9fe6dc3e-d2ce-3ab3-aae9-e5c4f48df1a1', NULL, 'soltero', 'autonomo', 0, 0, NULL, 0),
('aaadb0fa-a96e-35bb-9fcc-20271f867c5e', NULL, 'soltero', 'empleado', 0, 0, NULL, 0),
('afba8c66-0e8d-3043-9206-905ec158b14d', NULL, 'casado', 'responsable_del_hogar', 0, 0, NULL, 1),
('b9e9f368-a32f-3cb5-b860-82cfa3a3e82d', NULL, 'soltero', 'empleado', 0, 0, NULL, 0),
('cae40185-58c9-369a-be9a-28948453e988', NULL, 'soltero', 'empleado', 0, 0, NULL, 0),
('cc96e4a2-0abc-3daa-87f2-b7495a6ae260', NULL, 'casado', 'desempleado', 0, 1, '4bff0752-5af8-35b4-8e3f-3ee6a9542a7', 0),
('d9db876f-2b2e-34d3-9566-31e0437306fd', NULL, 'casado', 'pensionista', 1, 0, NULL, 0),
('da3b368e-d75f-3e19-a0b3-e8454ec11c3e', NULL, 'soltero', 'rentista', 0, 1, NULL, 0),
('e588c751-3072-363c-bf1e-8f14cbedaed3', NULL, 'soltero', 'estudiante', 0, 0, NULL, 0),
('e59fdfe5-840a-3cdb-af1a-31d98b2f7863', NULL, 'soltero', 'pensionista', 0, 0, NULL, 0),
('e68bcfd2-dd91-3a83-84fa-38b17bf77af5', NULL, 'casado', 'empleado', 0, 1, 'f9a0dc00-ef3d-3c8e-a14f-eb1732ee13bc', 0),
('e68bcfd2-dd91-3a83-84fa-38b17bf77af6', NULL, 'soltero', 'desempleado', 0, 1, NULL, 0),
('f17ab904-7359-34c6-9896-95c828332658', NULL, 'casado', 'autonomo', 1, 1, NULL, 1),
('f3e41661-c132-3338-860e-7bde96b4c484', NULL, 'soltero', 'autonomo', 0, 0, NULL, 0),
('f9a0dc00-ef3d-3c8e-a14f-eb1732ee13bc', NULL, 'casado', 'pensionista', 0, 0, 'e68bcfd2-dd91-3a83-84fa-38b17bf77af5', 1),
('fc207196-8583-3917-b3a6-443ca93e25ef', NULL, 'soltero', 'empleado', 0, 0, NULL, 0),
('ff2d44ea-7437-3dc0-ae20-ee6d9be37082', NULL, 'soltero', 'empleado', 0, 1, NULL, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos_concedidos`
--

DROP TABLE IF EXISTS `prestamos_concedidos`;
CREATE TABLE IF NOT EXISTS `prestamos_concedidos` (
  `id_preconcedido` int(11) NOT NULL,
  `fecha_confirmacion` date NOT NULL,
  `pago_mensual` double NOT NULL,
  PRIMARY KEY (`id_preconcedido`),
  KEY `fk_prestamoConcedido_prestamosPreconcedido_idx` (`id_preconcedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos_preconcedidos`
--

DROP TABLE IF EXISTS `prestamos_preconcedidos`;
CREATE TABLE IF NOT EXISTS `prestamos_preconcedidos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(36) NOT NULL,
  `fecha_oferta` date NOT NULL,
  `cantidad` int(11) NOT NULL,
  `periodo` int(11) NOT NULL COMMENT 'Periodo en meses',
  `tipo_interes` double NOT NULL,
  `plazo_para_aceptar` int(11) NOT NULL COMMENT 'plazo en dias',
  PRIMARY KEY (`id`),
  KEY `fk_prestamo_Preconcedido_cliente_idx` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cuentas_bancarias`
--
ALTER TABLE `cuentas_bancarias`
  ADD CONSTRAINT `fk_cuentas_bancarias_clientes1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`uuid`);

--
-- Filtros para la tabla `movimientos`
--
ALTER TABLE `movimientos`
  ADD CONSTRAINT `fk_movimientos_clientes1` FOREIGN KEY (`emisor`) REFERENCES `clientes` (`uuid`);

--
-- Filtros para la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD CONSTRAINT `fk_pagosCliente_prestamosConcedidos1` FOREIGN KEY (`id_preconcedido`) REFERENCES `prestamos_preconcedidos` (`id`);

--
-- Filtros para la tabla `perfiles`
--
ALTER TABLE `perfiles`
  ADD CONSTRAINT `fk_perfilesCliente_clientes` FOREIGN KEY (`uuid`) REFERENCES `clientes` (`uuid`);

--
-- Filtros para la tabla `prestamos_concedidos`
--
ALTER TABLE `prestamos_concedidos`
  ADD CONSTRAINT `fk_prestamos_preconcedidos_prestamoPreconcedido2` FOREIGN KEY (`id_preconcedido`) REFERENCES `prestamos_preconcedidos` (`id`);

--
-- Filtros para la tabla `prestamos_preconcedidos`
--
ALTER TABLE `prestamos_preconcedidos`
  ADD CONSTRAINT `fk_prestamos_preconcedidos_clientes1` FOREIGN KEY (`uuid`) REFERENCES `clientes` (`uuid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
