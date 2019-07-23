-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: consejodefacultad
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `modulo`
--

DROP TABLE IF EXISTS `modulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `modulo` (
  `idmodulo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `icono` varchar(20) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`idmodulo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modulo`
--

LOCK TABLES `modulo` WRITE;
/*!40000 ALTER TABLE `modulo` DISABLE KEYS */;
INSERT INTO `modulo` VALUES (1,'USUARIOS','fa-th-list',1),(2,'CONSEJO DE FACULTAD','fa-desktop',1),(3,'SESION ','fa-bookmark-o',1),(4,'MIEMBROS','fa-user',1),(5,'DOCUMENTOS','fa-file-text-o',1),(6,'AGENDA','fa-building',1);
/*!40000 ALTER TABLE `modulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opcion`
--

DROP TABLE IF EXISTS `opcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `opcion` (
  `idopcion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `idsubmodulo` int(11) NOT NULL,
  PRIMARY KEY (`idopcion`),
  KEY `fk_opcion_submodulo_idx` (`idsubmodulo`),
  CONSTRAINT `fk_opcion_submodulo` FOREIGN KEY (`idsubmodulo`) REFERENCES `submodulo` (`idsubmodulo`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opcion`
--

LOCK TABLES `opcion` WRITE;
/*!40000 ALTER TABLE `opcion` DISABLE KEYS */;
INSERT INTO `opcion` VALUES (1,'Nuevo',1,1),(2,'Ver',1,2),(3,'Editar',1,3),(4,'Editar',1,4),(5,'Ver',1,5),(6,'Ver',1,6),(7,'Editar',1,7),(8,'Nuevo',1,8);
/*!40000 ALTER TABLE `opcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `perfil` (
  `idperfil` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idperfil`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil`
--

LOCK TABLES `perfil` WRITE;
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
INSERT INTO `perfil` VALUES (1,'ROLE_ADMINISTRADOR'),(2,'ROLE_DECANO'),(3,'ROLE_SECRETARIO');
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfil_opcion`
--

DROP TABLE IF EXISTS `perfil_opcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `perfil_opcion` (
  `idperfilopcion` int(11) NOT NULL AUTO_INCREMENT,
  `estado` tinyint(4) DEFAULT NULL,
  `idperfil` int(11) NOT NULL,
  `idopcion` int(11) NOT NULL,
  PRIMARY KEY (`idperfilopcion`),
  KEY `fk_perfilopcion_perfil_idx` (`idperfil`),
  KEY `fk_perfilopcion_opcion_idx` (`idopcion`),
  CONSTRAINT `fk_perfilopcion_opcion` FOREIGN KEY (`idopcion`) REFERENCES `opcion` (`idopcion`),
  CONSTRAINT `fk_perfilopcion_perfil` FOREIGN KEY (`idperfil`) REFERENCES `perfil` (`idperfil`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil_opcion`
--

LOCK TABLES `perfil_opcion` WRITE;
/*!40000 ALTER TABLE `perfil_opcion` DISABLE KEYS */;
INSERT INTO `perfil_opcion` VALUES (1,1,1,1),(2,1,1,2),(3,1,2,3),(4,1,2,4),(5,1,2,5),(6,1,2,6),(7,1,3,7),(8,1,3,8);
/*!40000 ALTER TABLE `perfil_opcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `submodulo`
--

DROP TABLE IF EXISTS `submodulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `submodulo` (
  `idsubmodulo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `url` varchar(80) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `idmodulo` int(11) NOT NULL,
  PRIMARY KEY (`idsubmodulo`),
  KEY `fk_submodulo_modulo_idx` (`idmodulo`),
  CONSTRAINT `fk_submodulo_modulo` FOREIGN KEY (`idmodulo`) REFERENCES `modulo` (`idmodulo`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `submodulo`
--

LOCK TABLES `submodulo` WRITE;
/*!40000 ALTER TABLE `submodulo` DISABLE KEYS */;
INSERT INTO `submodulo` VALUES (1,'USUARIOS','usuarios',1,1),(2,'FACULTAD','facultad',1,2),(3,'SESION ORDINARIA','sesionordinaria',1,3),(4,'SESION EXTRAORDINARIA','sesionextraordinaria',1,3),(5,'MIEMBROS','miembros',1,4),(6,'LISTA DOCUMENTOS','listadocumentos',1,5),(7,'ACTA','acta',1,5),(8,'AGENDA','agenda',1,6);
/*!40000 ALTER TABLE `submodulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `foto` varchar(100) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `ultimo_login` datetime DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'JHUDER','administrador','$2a$10$JmZS1cmxjAnx9vYSaWReV.0pLCHyGIBMmKt017yZevLfLKdaHHYku',NULL,1,NULL),(2,'MARCELINO','decano','$2a$10$JAAJAxRmO//EXzOnXWly/ufFwpe.SNzyFxPemiNPklhE0IKs.D9Gi',NULL,1,NULL),(3,'REYNALDO','secretario','$2a$10$./MkaDwzixOKlhXsf6J6TOWC86ziMTsaCC7e.Tv6EFsCcqjD3.o1m',NULL,1,NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_perfil`
--

DROP TABLE IF EXISTS `usuario_perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario_perfil` (
  `idusuarioperfil` int(11) NOT NULL AUTO_INCREMENT,
  `estado` tinyint(4) DEFAULT NULL,
  `idusuario` int(11) NOT NULL,
  `idperfil` int(11) NOT NULL,
  PRIMARY KEY (`idusuarioperfil`),
  KEY `fk_usuarioperfil_usuario_idx` (`idusuario`),
  KEY `fk_usuarioperfil_perfil_idx` (`idperfil`),
  CONSTRAINT `fk_usuarioperfil_perfil` FOREIGN KEY (`idperfil`) REFERENCES `perfil` (`idperfil`),
  CONSTRAINT `fk_usuarioperfil_usuario` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_perfil`
--

LOCK TABLES `usuario_perfil` WRITE;
/*!40000 ALTER TABLE `usuario_perfil` DISABLE KEYS */;
INSERT INTO `usuario_perfil` VALUES (1,1,1,1),(2,1,2,2),(3,1,3,3);
/*!40000 ALTER TABLE `usuario_perfil` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-23 13:38:09
