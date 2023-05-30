-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: clientes
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clientes`
--
drop database if exists proyecto;
create database proyecto;
use proyecto;

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;

CREATE TABLE `clientes` (
  `uuid` varchar(36) NOT NULL COMMENT 'Codigo para generar UUID en MySQL:\nUUID()',
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `telefono` int DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `dni_UNIQUE` (`dni`),
  UNIQUE KEY `telefono_UNIQUE` (`telefono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentabancaria`
--

DROP TABLE IF EXISTS `cuentas_bancarias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuentas_bancarias` (
  `iban` varchar(32) NOT NULL,
  `id_cliente` varchar(36) NOT NULL,
  `tipo_cuenta` varchar(45) NOT NULL,
  `saldo` double DEFAULT NULL,
  `nomina_ultimo_mes` double DEFAULT NULL COMMENT 'El pago que recibio de la nomia del ultimo mes',
  `nomina_media` double DEFAULT NULL COMMENT 'Ha de ser la media de los 12 ultimos meses',
  PRIMARY KEY (`iban`),
  CONSTRAINT `fk_cuentas_bancarias_clientes1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Dumping data for table `cuentabancaria`
--

LOCK TABLES `cuentas_bancarias` WRITE;
/*!40000 ALTER TABLE `cuentas_bancarias` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuentas_bancarias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientoscliente`
--

DROP TABLE IF EXISTS `movimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimientos` (
  `num_operacion` int auto_increment NOT NULL,
  `emisor` varchar(36) NOT NULL,
  `iban_origen` char(24) NOT NULL,
  `iban_destino` char(24) NOT NULL,
  `cantidad` double(12,2) NOT NULL COMMENT 'La cantidad de capital que se ha movido en la operacion, puede ser negativa o positiva',
  `concepto` varchar(80) DEFAULT NULL COMMENT 'Hecho del movimiento de capital: nomina, pago con tarjeta, retirada en cajero, etc',
  PRIMARY KEY (`num_operacion`),
  KEY `fk_movimientoCliente_clientes1` (`emisor`),
  CONSTRAINT `fk_movimientos_clientes1` FOREIGN KEY (`emisor`) REFERENCES `clientes` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientoscliente`
--

LOCK TABLES `movimientos` WRITE;
/*!40000 ALTER TABLE `movimientos` DISABLE KEYS */;
/*!40000 ALTER TABLE `movimientos` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `perfiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perfiles` (
  `uuid` varchar(36) NOT NULL,
  `credenciales` varchar(36) DEFAULT NULL,
  `estado_civil` varchar(36) NOT NULL COMMENT 'Estado civil: Casado, soltero',
  `situacion_laboral` varchar(36) NOT NULL COMMENT 'Situacion laboral: empleado, desempleado, autónomo, pensionista, rentista, estudiante, ama de casa',
  `morosidad` boolean NOT NULL,
  `proceso_judicial` boolean NOT NULL,
  `uuid_Pareja` varchar(36) DEFAULT NULL COMMENT 'dni de la pareja si es que la pareja sea cliente del mismo banco',
  `en_gananciales` boolean default false COMMENT 'El matrimonio es ganancial o hay separacion de bienes',
  PRIMARY KEY (`uuid`),
  KEY `fk_perfilesCliente_clientes_idx` (`uuid`),
  CONSTRAINT `fk_perfilesCliente_clientes` FOREIGN KEY (`uuid`) REFERENCES `clientes` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfilcliente`
--

LOCK TABLES `perfiles` WRITE;
/*!40000 ALTER TABLE `perfiles` DISABLE KEYS */;
/*!40000 ALTER TABLE `perfiles` ENABLE KEYS */;
UNLOCK TABLES;
--
-- Table structure for table `prestamospreconcedido`
--

DROP TABLE IF EXISTS `prestamos_preconcedidos`;
CREATE TABLE `prestamos_preconcedidos` (
	id int auto_increment,
  `uuid` varchar(36) NOT NULL,
  `fecha_oferta` date NOT NULL,
  `cantidad` int NOT NULL,
  `periodo` int NOT NULL COMMENT 'Periodo en meses',
  `tipo_interes` double NOT NULL,
  `plazo_para_aceptar` int NOT NULL COMMENT 'plazo en dias',
  PRIMARY KEY (`id`),
  KEY `fk_prestamo_Preconcedido_cliente_idx` (`uuid`),
  CONSTRAINT `fk_prestamos_preconcedidos_clientes1` FOREIGN KEY (`uuid`) REFERENCES `clientes` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

DROP TABLE IF EXISTS `prestamos_concedidos`;

CREATE TABLE `prestamos_concedidos` (
id_preconcedido int NOT NULL,
  `fecha_confirmacion` date NOT NULL,
  `pago_mensual` double NOT NULL,
  PRIMARY KEY (`id_preconcedido`),
  KEY `fk_prestamoConcedido_prestamosPreconcedido_idx` (`id_preconcedido`),
  CONSTRAINT `fk_prestamos_preconcedidos_prestamoPreconcedido2` FOREIGN KEY (id_preconcedido) REFERENCES prestamos_preconcedidos(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


DROP TABLE IF EXISTS `pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagos` (
  `num_pago` int auto_increment NOT NULL,
  `id_preconcedido` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  PRIMARY KEY (`num_pago`),
  KEY `fk_pagosCliente_prestamosConcedidos1_idx` (`id_preconcedido`),
  CONSTRAINT `fk_pagosCliente_prestamosConcedidos1` FOREIGN KEY (`id_preconcedido`) REFERENCES prestamos_preconcedidos(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagoscliente`
--

LOCK TABLES `pagos` WRITE;
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `prestamosconcedidos`
--

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-24 13:24:10
