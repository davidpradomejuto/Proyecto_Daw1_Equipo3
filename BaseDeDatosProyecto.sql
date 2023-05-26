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
  `UUID` varchar(36) NOT NULL COMMENT 'Codigo para generar UUID en MySQL:\nUUID()',
  `dni` char(9) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `telefono` int DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  PRIMARY KEY (`UUID`),
  UNIQUE KEY `dni_UNIQUE` (`dni`),
  UNIQUE KEY `telefono_UNIQUE` (`telefono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

insert into clientes values("123456789","72197202H","david","prado","barrio covadonga","torrelavega",2002-11-30);
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

DROP TABLE IF EXISTS `cuentabancarias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuentabancarias` (
  `IBAN` char(24) NOT NULL,
  `clientes` varchar(36) NOT NULL,
  `tipoCuenta` varchar(45) NOT NULL,
  `saldo` double DEFAULT NULL,
  `nominaMes` double DEFAULT NULL COMMENT 'El pago que recibio de la nomia del ultimo mes',
  `mediaNomina` double DEFAULT NULL COMMENT 'Ha de ser la media de los 12 ultimos meses',
  PRIMARY KEY (`IBAN`,`clientes`),
  CONSTRAINT `fk_cuentaBancaria_clientes1` FOREIGN KEY (`clientes`) REFERENCES `clientes` (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;
insert into cuentabancarias values("es 85 4567 1234 56","123456789","cuenta_corriente",3000,2000,1500);

--
-- Dumping data for table `cuentabancaria`
--

LOCK TABLES `cuentabancarias` WRITE;
/*!40000 ALTER TABLE `cuentabancarias` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuentabancarias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientoscliente`
--

DROP TABLE IF EXISTS `movimientoscliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimientoscliente` (
  `numOperacion` int NOT NULL,
  `emisor` varchar(36) NOT NULL,
  `ibanOrigen` char(24) NOT NULL,
  `ibanDestino` char(24) NOT NULL,
  `cantidadOperacion` double NOT NULL COMMENT 'La cantidad de capital que se ha movido en la operacion, puede ser negativa o positiva',
  `conceptoOperacion` varchar(80) DEFAULT NULL COMMENT 'Hecho del movimiento de capital: nomina, pago con tarjeta, retirada en cajero, etc',
  PRIMARY KEY (`numOperacion`),
  KEY `fk_movimientoCliente_clientes1` (`emisor`),
  CONSTRAINT `fk_movimientoCliente_clientes1` FOREIGN KEY (`emisor`) REFERENCES `clientes` (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientoscliente`
--

LOCK TABLES `movimientoscliente` WRITE;
/*!40000 ALTER TABLE `movimientoscliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `movimientoscliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagoscliente`
--

DROP TABLE IF EXISTS `pagoscliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagoscliente` (
  `numPago` int auto_increment NOT NULL,
  `cliente` varchar(36) NOT NULL,
  `fechaPago` date DEFAULT NULL,
  `cantidadPagada` double DEFAULT NULL,
  PRIMARY KEY (`numPago`),
  KEY `fk_pagosCliente_prestamosConcedidos1_idx` (`cliente`),
  CONSTRAINT `fk_pagosCliente_prestamosConcedidos1` FOREIGN KEY (`cliente`) REFERENCES `prestamosconcedidos` (`cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagoscliente`
--

LOCK TABLES `pagoscliente` WRITE;
/*!40000 ALTER TABLE `pagoscliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagoscliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfilcliente`
--

DROP TABLE IF EXISTS `perfilescliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perfilescliente` (
  `clientes` varchar(36) NOT NULL,
  `credenciales` varchar(36) DEFAULT NULL,
  `estadoCivil` enum('casado','soltero') NOT NULL COMMENT 'Estado civil: Casado, soltero',
  `situacionLaboral` enum('empleado','desempleado','autonomo','pensionista','rentista','estudiante','ama de casa') NOT NULL COMMENT 'Situacion laboral: empleado, desempleado, autónomo, pensionista, rentista, estudiante, ama de casa',
  `morosidad` boolean NOT NULL,
  `procesoJudicial` boolean NOT NULL,
  `uuidPareja` varchar(36) DEFAULT NULL COMMENT 'dni de la pareja si es que la pareja sea cliente del mismo banco',
  `enGananciales` boolean default false COMMENT 'El matrimonio es ganancial o hay separacion de bienes',
  PRIMARY KEY (`clientes`),
  UNIQUE KEY `idPareja_UNIQUE` (`uuidPareja`),
  KEY `fk_perfilesCliente_clientes_idx` (`clientes`),
  CONSTRAINT `fk_perfilesCliente_clientes` FOREIGN KEY (`clientes`) REFERENCES `clientes` (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfilcliente`
--

LOCK TABLES `perfilescliente` WRITE;
/*!40000 ALTER TABLE `perfilescliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `perfilescliente` ENABLE KEYS */;
UNLOCK TABLES;
--
-- Table structure for table `prestamospreconcedido`
--

DROP TABLE IF EXISTS `prestamospreconcedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamospreconcedido` (
	id int auto_increment,
  `cliente` varchar(36) NOT NULL,
  `fechaOferta` date NOT NULL,
  `cantidadPrestamo` int NOT NULL,
  `periodoPrestamos` int NOT NULL COMMENT 'Periodo en meses',
  `tipoInteres` double NOT NULL,
  `plazoParaAceptar` int NOT NULL COMMENT 'plazo en dias',
  PRIMARY KEY (`id`),
  KEY `fk_prestamoPreconcedido_clientes1_idx` (`cliente`),
  CONSTRAINT `fk_prestamoPreconcedido_clientes1` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamospreconcedido`
--
--
-- Table structure for table `prestamosconcedidos`
--

DROP TABLE IF EXISTS `prestamosconcedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamosconcedidos` (
  `cliente` varchar(36) NOT NULL,
  `fechaConfirmacion` date NOT NULL,
  `pagoMensual` double NOT NULL,
  datosPrecondedidos int not null,
  PRIMARY KEY (`cliente`,`datosPrecondedidos`),
  CONSTRAINT `fk_prestamosConcedidos_prestamoPreconcedido1` FOREIGN KEY (`cliente`) REFERENCES `prestamospreconcedido` (`cliente`),
  CONSTRAINT `fk_prestamosConcedidos_prestamoPreconcedido2` FOREIGN KEY (`datosPrecondedidos`) REFERENCES `prestamospreconcedido` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

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
