-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: millionwinner
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `id` bigint NOT NULL,
  `question` varchar(255) DEFAULT NULL,
  `option1` varchar(255) DEFAULT NULL,
  `option2` varchar(255) DEFAULT NULL,
  `option3` varchar(255) DEFAULT NULL,
  `option4` varchar(255) DEFAULT NULL,
  `correctOptionIndex` varchar(255) DEFAULT NULL,
  `questionscore` int DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'What is three fifth of 100?','3','5','20','60','60',5,'math'),(2,'If David’s age is 27 years old in 2011. What was his age in 2003?','17 years','37 years','20 years','19 years','19 years',10,'math'),(3,'What is the remainder of 21 divided by 7?','21','None of these','1','7','None of these',15,'math'),(4,' What is 7% equal to?','0.007','0.7','0.07','7','0.07',5,'math'),(5,'Who invented Java Programming?','Guido van Rossum','James Gosling','Dennis Ritchie','Bjarne Stroustrup','James Gosling',10,'java'),(6,'Which statement is true about Java?',' Java is a sequence-dependent programming language','Java is a code dependent programming language','Java is a platform-dependent programming language','Java is a platform-independent programming language','Java is a platform-independent programming language',15,'java'),(7,'Which component is used to compile, debug and execute the java programs?','JRE','JIT','JDK',' JVM','JDK',20,'java'),(8,'Which one of the following is not a Java feature?','Object-oriented','Use of pointers','Portable','Dynamic and Extensible','Use of pointers',15,'java'),(9,'Who developed Python Programming Language?','Wick van Rossum','Rasmus Lerdorf','Guido van Rossum',' Niene Stom','Guido van Rossum',5,'python'),(10,'Which type of Programming does Python support?','object-oriented programming','structured programming','functional programming','all of the mentioned','all of the mentioned',10,'python'),(11,'Is Python case sensitive when dealing with identifiers?','no','yes','machine dependent','none of the mentioned','none of the mentioned',15,'python'),(12,'Which of the following is the correct extension of the Python file?','.python','.pl',' .py',' .p','.py',20,'python');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-16 13:36:02
