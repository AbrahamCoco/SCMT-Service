-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: scmt
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.38-MariaDB

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
-- Table structure for table `tasistencia`
--

DROP TABLE IF EXISTS `tasistencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tasistencia` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `truta_id` int(11) unsigned NOT NULL,
  `tusuario_id` int(11) unsigned NOT NULL,
  `asistencia` int(11) NOT NULL DEFAULT '0',
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `hora` (`hora`),
  KEY `truta_id` (`truta_id`),
  KEY `tusuario_id` (`tusuario_id`),
  CONSTRAINT `tasistencia_ibfk_1` FOREIGN KEY (`truta_id`) REFERENCES `truta` (`id`),
  CONSTRAINT `tasistencia_ibfk_2` FOREIGN KEY (`tusuario_id`) REFERENCES `tusuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tasistencia`
--

LOCK TABLES `tasistencia` WRITE;
/*!40000 ALTER TABLE `tasistencia` DISABLE KEYS */;
INSERT INTO `tasistencia` VALUES (1,1,3,1,'2023-05-12','07:00:00',1),(2,3,6,1,'2023-05-12','07:03:00',1),(3,2,7,1,'2023-05-12','07:04:00',1),(4,1,3,1,'2023-06-06','17:17:59',1),(5,1,3,1,'2023-06-06','17:18:38',1),(6,1,16,1,'2023-06-08','17:15:54',1),(7,4,16,1,'2023-06-10','22:42:53',1),(8,4,16,1,'2023-06-10','22:43:07',1),(9,4,16,1,'2023-06-11','14:52:58',1),(10,4,16,1,'2023-06-11','14:53:07',1),(11,4,16,1,'2023-06-26','21:09:15',1),(12,1,3,1,'2023-08-11','16:27:28',1),(13,1,3,1,'2023-08-18','17:56:46',1),(14,1,3,1,'2023-09-08','17:13:09',1),(15,1,3,1,'2023-12-04','14:19:16',1),(16,1,3,1,'2023-12-08','13:17:33',1);
/*!40000 ALTER TABLE `tasistencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tcompania`
--

DROP TABLE IF EXISTS `tcompania`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tcompania` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tcompania`
--

LOCK TABLES `tcompania` WRITE;
/*!40000 ALTER TABLE `tcompania` DISABLE KEYS */;
INSERT INTO `tcompania` VALUES (1,'Autotransportes Luna','Empresa de transporte de personal para AUDI','2761163782',1);
/*!40000 ALTER TABLE `tcompania` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tincidente`
--

DROP TABLE IF EXISTS `tincidente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tincidente` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `truta_id` int(11) unsigned NOT NULL,
  `tusuario_id` int(11) unsigned NOT NULL,
  `nombre` varchar(120) NOT NULL,
  `descripcion` varchar(250) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `truta_id` (`truta_id`),
  KEY `tusuario_id` (`tusuario_id`),
  CONSTRAINT `tincidente_ibfk_1` FOREIGN KEY (`truta_id`) REFERENCES `truta` (`id`),
  CONSTRAINT `tincidente_ibfk_2` FOREIGN KEY (`tusuario_id`) REFERENCES `tusuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tincidente`
--

LOCK TABLES `tincidente` WRITE;
/*!40000 ALTER TABLE `tincidente` DISABLE KEYS */;
INSERT INTO `tincidente` VALUES (1,1,2,'Incidencia Inicial','Esta cerrada la calle principal por el mole','2023-05-09','07:30:00',1),(2,1,2,'Se poncho la llanta','Se poncho la llanta a la ultura de el toro en huamantla','2023-03-14','03:30:00',1),(8,1,17,'Prueba','prueba','2023-05-21','05:30:00',1),(9,3,17,'Prueba','Prueba','2023-05-09','07:30:00',1),(10,3,17,'Prueba','Prueba','2023-05-09','07:30:00',1),(11,1,5,'Prueba','Prueba','2023-05-09','07:30:00',1),(12,2,17,'Falla mecanica','Se apagó el motor a la salida de huamantla ','2023-05-09','07:30:00',1),(13,2,17,'Falla mecanica','Se apagó el motor a la salida de huamantla ','2023-05-09','07:30:00',1),(14,1,5,'Falla mecanica ','Se poncho una llanta','2023-05-09','07:30:00',1),(15,2,17,'Falla mecanica ','Se poncho una llanta ','2023-05-09','07:30:00',1),(16,1,5,'Calle cerrada','Está la calle cerrada por reparaciones ','2023-05-09','07:30:00',1),(17,1,5,'Calle cerrada','Está la calle cerrada por reparaciones ','2023-05-09','07:30:00',1),(18,1,5,'Calle cerrada','Está la calle cerrada por reparaciones ','2023-05-09','07:30:00',1),(19,1,5,'Calle cerrada','Está la calle cerrada por reparaciones ','2023-05-09','07:30:00',1),(20,2,17,'Accidente ','Ocurrió accidente al llegar a humantla ','2023-05-09','07:30:00',1),(21,3,17,'Falla mecanica ','Fallo el motor en el centro de huamantla ','2023-05-09','07:30:00',1),(22,1,5,'Incidencia prueba','Incidencia de presentación ','2023-05-09','07:30:00',1),(23,1,5,'Incidencia Garage','Me quedé en el garage, Carnall','2023-05-09','07:30:00',1),(24,1,5,'Tienda Quemándose ','En La Calle Qué Va Para La Vía Corta Se Estaba Quemando Una Hamburgueseria','2023-11-29','22:23:00',1),(25,1,5,'Accidente','En La Pista Apizaco El Molinito Se Volteo Un Automovil Y El Tráfico Es Lento','2023-11-30','21:02:29',1),(26,1,5,'Ponchadura','A la altura de Santa Ana Chiautempan se pincho la llanta trasera de lado derecho','2023-11-30','21:48:38',1);
/*!40000 ALTER TABLE `tincidente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trol`
--

DROP TABLE IF EXISTS `trol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trol` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(150) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trol`
--

LOCK TABLES `trol` WRITE;
/*!40000 ALTER TABLE `trol` DISABLE KEYS */;
INSERT INTO `trol` VALUES (1,'Administrador',1),(2,'Conductor',1),(3,'Pasajero',1);
/*!40000 ALTER TABLE `trol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `truta`
--

DROP TABLE IF EXISTS `truta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `truta` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `tcompania_id` int(11) unsigned NOT NULL,
  `tusuario_id_conductor` int(11) unsigned DEFAULT NULL,
  `nombre` varchar(120) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  `punto_acceso` varchar(100) NOT NULL,
  `vehiculo` varchar(100) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  `qr` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `vehiculo` (`vehiculo`),
  KEY `tcompania_id` (`tcompania_id`),
  KEY `tusuario_id_conductor` (`tusuario_id_conductor`),
  CONSTRAINT `truta_ibfk_1` FOREIGN KEY (`tcompania_id`) REFERENCES `tcompania` (`id`),
  CONSTRAINT `truta_ibfk_2` FOREIGN KEY (`tusuario_id_conductor`) REFERENCES `tusuario_conductor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truta`
--

LOCK TABLES `truta` WRITE;
/*!40000 ALTER TABLE `truta` DISABLE KEYS */;
INSERT INTO `truta` VALUES (1,1,5,'Humantla Centro','Salida de Huamantla Centro, por Cuapiaxtla y Grajales','Humantla Centro','XA-685-SB',1,NULL),(2,1,17,'Ruta Cuapiaxtla','Ruta principal Cuapiaxtla centro','Cuapiaxtla','XB6045',1,NULL),(3,1,17,'Ruta Huamantla Soriana','Ruta de Huamantla saliendo por Soriana no pasa por el centro','Soriana Huamantla','XD-69-DE',1,NULL),(4,1,5,'456789','3456789','3456789','sdfghjk',1,NULL);
/*!40000 ALTER TABLE `truta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `truta_usuario`
--

DROP TABLE IF EXISTS `truta_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `truta_usuario` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `truta_id` int(11) unsigned NOT NULL,
  `tusuario_id` int(11) unsigned NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `truta_id` (`truta_id`),
  KEY `tusuario_id` (`tusuario_id`),
  CONSTRAINT `truta_usuario_ibfk_1` FOREIGN KEY (`truta_id`) REFERENCES `truta` (`id`),
  CONSTRAINT `truta_usuario_ibfk_2` FOREIGN KEY (`tusuario_id`) REFERENCES `tusuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truta_usuario`
--

LOCK TABLES `truta_usuario` WRITE;
/*!40000 ALTER TABLE `truta_usuario` DISABLE KEYS */;
INSERT INTO `truta_usuario` VALUES (1,1,3,0),(2,1,6,1),(3,3,3,1),(4,1,15,1),(5,1,16,1),(6,3,15,1),(7,3,16,1),(8,2,15,1),(9,4,16,1),(10,1,3,1),(11,1,25,1),(12,1,19,0),(13,2,19,1);
/*!40000 ALTER TABLE `truta_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tusuario`
--

DROP TABLE IF EXISTS `tusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tusuario` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `tcompania_id` int(11) unsigned NOT NULL,
  `trol_id` int(11) unsigned NOT NULL,
  `tusuario_admin_id` int(11) unsigned DEFAULT NULL,
  `tusuario_conductor_id` int(11) unsigned DEFAULT NULL,
  `tusuario_pasajero_id` int(11) unsigned DEFAULT NULL,
  `nombre` varchar(150) NOT NULL,
  `primer_apellido` varchar(100) NOT NULL,
  `segundo_apellido` varchar(100) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `contraseña` varchar(25) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `usuario` (`usuario`),
  KEY `tcompania_id` (`tcompania_id`),
  KEY `trol_id` (`trol_id`),
  KEY `tusuario_admin_id` (`tusuario_admin_id`),
  KEY `tusuario_conductor_id` (`tusuario_conductor_id`),
  KEY `tusuario_pasajero_id` (`tusuario_pasajero_id`),
  CONSTRAINT `tusuario_ibfk_1` FOREIGN KEY (`tcompania_id`) REFERENCES `tcompania` (`id`),
  CONSTRAINT `tusuario_ibfk_2` FOREIGN KEY (`trol_id`) REFERENCES `trol` (`id`),
  CONSTRAINT `tusuario_ibfk_3` FOREIGN KEY (`tusuario_admin_id`) REFERENCES `tusuario_admin` (`id`),
  CONSTRAINT `tusuario_ibfk_4` FOREIGN KEY (`tusuario_conductor_id`) REFERENCES `tusuario_conductor` (`id`),
  CONSTRAINT `tusuario_ibfk_5` FOREIGN KEY (`tusuario_pasajero_id`) REFERENCES `tusuario_pasajero` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tusuario`
--

LOCK TABLES `tusuario` WRITE;
/*!40000 ALTER TABLE `tusuario` DISABLE KEYS */;
INSERT INTO `tusuario` VALUES (1,1,1,1,NULL,NULL,'Josue','Barrales','Galvez','josue','josue',1),(2,1,2,NULL,1,NULL,'Abraham','Cocoletzi','Zempoalteca','abraham','abraham',0),(3,1,3,NULL,NULL,1,'Raul','Lopez','Perez','raul','raul',1),(4,1,1,8,NULL,NULL,'Felipe ','Contreras','Perez','felipe','felipe',0),(5,1,2,NULL,2,NULL,'Francisco','Perez','Lopez','francisco','francisco',1),(6,1,3,NULL,NULL,2,'David','Del toro','Lopez','david','david',1),(7,1,3,NULL,NULL,3,'Dulce Gabriela','Martinez ','Perez','dulce','dulce',0),(8,1,2,NULL,3,NULL,'Perengano','Juarez','Rodriguez','juarezflow','123456',0),(10,1,1,10,NULL,NULL,'Abraham','Cocoletzi','Zempoalteca','abrahamzc','zac950316',1),(11,1,2,NULL,4,NULL,'Abraham','Cocoletzi','Zempoalteca','abrahamconductor','zac950316',1),(12,1,2,NULL,5,NULL,'Ramiro','montiel','carranza','ramiro','ramiro',1),(13,1,1,11,NULL,NULL,'Jose Pedro','Mendoza','Mendoza','pedro','pedro',1),(14,1,2,NULL,6,NULL,'Angel','Valencia','Valencia','angel','angel',1),(15,1,3,NULL,NULL,4,'Alejandro ','Juarez','Nieto','alejandro','alejandro',1),(16,1,3,NULL,NULL,6,'Maria Monica','Perez','Gonzalez','monica','monica',1),(17,1,2,NULL,7,NULL,'Maria Leticia ','Briones','Perez','leticia','leticia',1),(18,1,2,NULL,8,NULL,'Martin','Perez','Valencia','martin','martin',1),(19,1,3,NULL,NULL,7,'Victor','Hernandez','Sanchez','victor','victor',1),(20,1,2,NULL,9,NULL,'Alexis','Gonzales','Perez','alexis','alexis',1),(23,1,1,13,NULL,NULL,'Valeria','Sanchez','Sanchez','valeria','valeria',1),(24,1,2,NULL,11,NULL,'Enrique','Valencia','Merino','enrique','enrique',1),(25,1,3,NULL,NULL,13,'Esau','Meneces ','Altamirano','esau','esau',1);
/*!40000 ALTER TABLE `tusuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tusuario_admin`
--

DROP TABLE IF EXISTS `tusuario_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tusuario_admin` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `fotografia` varchar(80) NOT NULL,
  `descripcion` varchar(250) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tusuario_admin`
--

LOCK TABLES `tusuario_admin` WRITE;
/*!40000 ALTER TABLE `tusuario_admin` DISABLE KEYS */;
INSERT INTO `tusuario_admin` VALUES (1,'https://scmtapis.azurewebsites.net/public/image-2242023-223938.jpg','Super Usuario','2761163782',1),(2,'https://scmtapis.azurewebsites.net/public/image-1542023-213648.jpg','Prueba','2764782039',1),(3,'https://scmtapis.azurewebsites.net/public/image-1542023-22849.jpg','Pruerba ','2764782039',1),(4,'https://scmtapis.azurewebsites.net/public/image-1542023-221017.jpg','Prueba','2764782039',1),(5,'https://scmtapis.azurewebsites.net/public/image-1542023-221110.jpg','Prueba','2761163782',1),(6,'https://scmtapis.azurewebsites.net/public/image-1542023-221158.jpg','aaeeefe','2764782039',1),(7,'https://scmtapis.azurewebsites.net/public/image-1542023-22139.jpg','Prueba','2764782039',1),(8,'https://scmtapis.azurewebsites.net/public/image-1542023-221820.jpg','Administrador del segundo turno','2761163782',1),(9,'https://scmtapis.azurewebsites.net/public/image-1842023-171314.jpg','Probando Servicios','5567633329',1),(10,'https://scmtapis.azurewebsites.net/public/image-1842023-171423.jpg','Probando Servicios','5567633329',1),(11,'https://scmtapis.azurewebsites.net/public/image-2242023-152428.jpg','Administrador de rutas','5896324518',1),(12,'https://scmtapis.azurewebsites.net/public/image-482023-205435.jpg','Admin','2764782039',1),(13,'https://scmtapis.azurewebsites.net/public/image-482023-21049.jpg','Admin valeria','2764782039',1);
/*!40000 ALTER TABLE `tusuario_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tusuario_conductor`
--

DROP TABLE IF EXISTS `tusuario_conductor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tusuario_conductor` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `id_empleado` int(11) NOT NULL,
  `fotografia` varchar(80) NOT NULL,
  `direccion` varchar(250) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `id_licencia` varchar(13) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tusuario_conductor`
--

LOCK TABLES `tusuario_conductor` WRITE;
/*!40000 ALTER TABLE `tusuario_conductor` DISABLE KEYS */;
INSERT INTO `tusuario_conductor` VALUES (1,152,'http://SCMT/fotografias/2','7 Seccion, Contla','2761163782','1532368',1),(2,5859,'https://scmtapis.azurewebsites.net/public/image-1642023-20296.jpg','Marico Escobedo','2761163782','568974',1),(3,2020,'https://scmtapis.azurewebsites.net/public/image-1842023-171950.jpg','Amaxac de guerrero','2764782039','9876567894',1),(4,1234,'https://scmtapis.azurewebsites.net/public/image-2142023-183233.jpg','Contla de Juan Cuamatzi','5567633329','123456789',1),(5,5897,'https://scmtapis.azurewebsites.net/public/image-2142023-193732.jpg','Amaxac de guerrero','2764782039','9876567894',1),(6,6524,'https://scmtapis.azurewebsites.net/public/image-2242023-153153.jpg','De la constitucion','2764782039','9876567894',1),(7,8987,'https://scmtapis.azurewebsites.net/public/image-2242023-222615.jpg','Huamantla Tlaxcala','2764782039','9876567894',1),(8,9857,'https://scmtapis.azurewebsites.net/public/image-482023-204433.jpg','Cuapiaxtla','2764782039','9876567894',1),(9,5869,'https://scmtapis.azurewebsites.net/public/image-482023-204617.jpg','59 Tlahuicole','2764782039','9876567894',1),(10,5896,'https://scmtapis.azurewebsites.net/public/image-482023-205532.jpg','Mariano Escobedo 59 A','2761163782','9876567894',1),(11,58967,'https://scmtapis.azurewebsites.net/public/image-482023-21191.jpg','59 Mariano escobedo','2764782039','2589645',1);
/*!40000 ALTER TABLE `tusuario_conductor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tusuario_pasajero`
--

DROP TABLE IF EXISTS `tusuario_pasajero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tusuario_pasajero` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `id_pasajero` int(11) NOT NULL,
  `fotografia` varchar(80) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `area` varchar(150) NOT NULL,
  `jefe_inmediato` varchar(120) NOT NULL,
  `turno` varchar(100) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tusuario_pasajero`
--

LOCK TABLES `tusuario_pasajero` WRITE;
/*!40000 ALTER TABLE `tusuario_pasajero` DISABLE KEYS */;
INSERT INTO `tusuario_pasajero` VALUES (1,145,'https://scmtapis.azurewebsites.net/public/image-2242023-223919.jpg','2761163782','Produccion','Luis Rodriguez','Central',1),(2,589844,'https://scmtapis.azurewebsites.net/public/image-1642023-204350.jpg','2761163782','Produccion','Guadalupe Contreras','Matutino',1),(3,25689,'https://scmtapis.azurewebsites.net/public/image-1842023-1750.jpg','2764782039','Ventas','Guadalupe Contreras','Central',1),(4,565898,'https://scmtapis.azurewebsites.net/public/image-2242023-153623.jpg','2761163782','Produccion','Guadalupe Contreras','Nocturno',1),(6,565899,'https://scmtapis.azurewebsites.net/public/image-2242023-221520.jpg','2764782039','Produccion','Guadalupe Contreras','Central',1),(7,6895,'https://scmtapis.azurewebsites.net/public/image-162023-154529.jpg','2764782039','Produccion','Leticia Perez','Central',1),(13,25689,'https://scmtapis.azurewebsites.net/public/image-482023-212354.jpg','2764782039','Produccion','Guadalupe Contreras','Matutino',1);
/*!40000 ALTER TABLE `tusuario_pasajero` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-16 16:05:43
