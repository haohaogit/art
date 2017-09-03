-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: art
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bottomcase_`
--

DROP TABLE IF EXISTS `bottomcase_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bottomcase_` (
  `BCID` int(11) NOT NULL AUTO_INCREMENT,
  `BCTID` int(11) NOT NULL DEFAULT '0',
  `TID` int(11) NOT NULL DEFAULT '0',
  `CaseName` varchar(30) NOT NULL,
  `CaseBrand` varchar(30) DEFAULT NULL,
  `CaseImg` varchar(30) DEFAULT NULL,
  `CaseImg1` varchar(30) DEFAULT NULL,
  `CaseImg2` varchar(30) DEFAULT NULL,
  `CaseImg3` varchar(30) DEFAULT NULL,
  `CaseImg4` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`BCID`),
  KEY `STID` (`BCTID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bottomcase_`
--

LOCK TABLES `bottomcase_` WRITE;
/*!40000 ALTER TABLE `bottomcase_` DISABLE KEYS */;
INSERT INTO `bottomcase_` VALUES (1,1,1,'111',NULL,NULL,NULL,NULL,NULL,NULL),(2,2,1,'222',NULL,NULL,NULL,NULL,NULL,NULL),(3,2,1,'333',NULL,NULL,NULL,NULL,NULL,NULL),(4,1,2,'111',NULL,NULL,NULL,NULL,NULL,NULL),(5,2,2,'111',NULL,NULL,NULL,NULL,NULL,NULL),(6,2,2,'333',NULL,NULL,NULL,NULL,NULL,NULL),(7,1,1,'41111','555',NULL,NULL,NULL,NULL,NULL),(10,1,1,'888','8888',NULL,NULL,NULL,NULL,NULL),(11,1,2,'55','555',NULL,NULL,NULL,NULL,NULL),(12,3,2,'2222','2222222222',NULL,NULL,NULL,NULL,NULL),(14,4,2,'11','1111',NULL,NULL,NULL,NULL,NULL),(15,3,2,'888','88',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `bottomcase_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bottomcasetype_`
--

DROP TABLE IF EXISTS `bottomcasetype_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bottomcasetype_` (
  `BCTID` int(11) NOT NULL AUTO_INCREMENT,
  `BCTName` varchar(30) NOT NULL,
  `TID` int(11) NOT NULL,
  PRIMARY KEY (`BCTID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bottomcasetype_`
--

LOCK TABLES `bottomcasetype_` WRITE;
/*!40000 ALTER TABLE `bottomcasetype_` DISABLE KEYS */;
INSERT INTO `bottomcasetype_` VALUES (1,'扩口型',1),(2,'收口型',1),(3,'收口型',2),(4,'扩口型',2);
/*!40000 ALTER TABLE `bottomcasetype_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `color_`
--

DROP TABLE IF EXISTS `color_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `color_` (
  `CID` int(11) NOT NULL AUTO_INCREMENT,
  `CBID` int(11) NOT NULL DEFAULT '0',
  `TID` int(11) NOT NULL DEFAULT '0',
  `CDescription` varchar(30) NOT NULL,
  `CRGB` varchar(30) NOT NULL,
  `CNum` varchar(30) NOT NULL,
  `CFile` varchar(30) NOT NULL DEFAULT '',
  `CImg` varchar(255) DEFAULT NULL,
  `CImg1` varchar(255) DEFAULT NULL,
  `CImg2` varchar(255) DEFAULT NULL,
  `CImg3` varchar(255) DEFAULT NULL,
  `CImg4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color_`
--

LOCK TABLES `color_` WRITE;
/*!40000 ALTER TABLE `color_` DISABLE KEYS */;
INSERT INTO `color_` VALUES (1,1,1,'1111','1122','1111','1111',NULL,NULL,NULL,NULL,NULL),(2,1,1,'2222','222111','2222','222',NULL,NULL,NULL,NULL,NULL),(3,2,1,'333','333','333','333',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `color_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colortype_`
--

DROP TABLE IF EXISTS `colortype_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `colortype_` (
  `CBID` int(11) NOT NULL AUTO_INCREMENT,
  `CBName` varchar(30) DEFAULT NULL,
  `TID` int(11) DEFAULT NULL,
  PRIMARY KEY (`CBID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colortype_`
--

LOCK TABLES `colortype_` WRITE;
/*!40000 ALTER TABLE `colortype_` DISABLE KEYS */;
INSERT INTO `colortype_` VALUES (1,'暖色调',1),(2,'暖色调',2),(3,'冷色调',2),(4,'冷色调',1);
/*!40000 ALTER TABLE `colortype_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jword_`
--

DROP TABLE IF EXISTS `jword_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jword_` (
  `JWID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) NOT NULL DEFAULT '0',
  `WID` int(11) NOT NULL DEFAULT '0',
  `CoupleWID` int(11) DEFAULT NULL,
  PRIMARY KEY (`JWID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jword_`
--

LOCK TABLES `jword_` WRITE;
/*!40000 ALTER TABLE `jword_` DISABLE KEYS */;
INSERT INTO `jword_` VALUES (1,1,1,NULL),(2,1,2,NULL),(3,2,3,2),(4,3,5,3),(5,5,5,4),(6,1,1,NULL),(7,2,1,2);
/*!40000 ALTER TABLE `jword_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newcase_`
--

DROP TABLE IF EXISTS `newcase_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `newcase_` (
  `NID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) NOT NULL DEFAULT '0',
  `NewCaseName` varchar(30) DEFAULT NULL,
  `NewCaseImg` varchar(30) DEFAULT NULL,
  `NewCaseArg` varchar(30) DEFAULT NULL,
  `NewCaseData` varchar(255) DEFAULT NULL,
  `NewCaseRTotal` varchar(30) DEFAULT NULL,
  `NewCaseROutline` varchar(30) DEFAULT NULL,
  `NewCaseRColor` varchar(30) DEFAULT NULL,
  `NewCaseRColorID` int(11) DEFAULT NULL,
  `NewCaseRTexture` varchar(30) DEFAULT NULL,
  `NewCaseRTextureID` int(11) DEFAULT NULL,
  `NewCaseATotal` varchar(30) DEFAULT NULL,
  `NewCaseAOutline` varchar(30) DEFAULT NULL,
  `NewCaseAColor` varchar(30) DEFAULT NULL,
  `NewCaseAColorID` int(11) DEFAULT NULL,
  `NewCaseATexture` varchar(30) DEFAULT NULL,
  `NewCaseATextureID` int(11) DEFAULT NULL,
  PRIMARY KEY (`NID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newcase_`
--

LOCK TABLES `newcase_` WRITE;
/*!40000 ALTER TABLE `newcase_` DISABLE KEYS */;
INSERT INTO `newcase_` VALUES (1,1,'222','2222','2222',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,2,'5555','5555','555555','555','555','55555555555','5',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,2,'75757','777777777','7',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `newcase_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `outline_`
--

DROP TABLE IF EXISTS `outline_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outline_` (
  `OID` int(11) NOT NULL AUTO_INCREMENT,
  `OTID` int(11) NOT NULL DEFAULT '0',
  `TID` int(11) NOT NULL DEFAULT '0',
  `ODescription` varchar(30) NOT NULL DEFAULT '',
  `OData` varchar(30) NOT NULL DEFAULT '',
  `OFile` varchar(30) DEFAULT NULL,
  `OImg` varchar(30) NOT NULL,
  `OImg1` varchar(30) DEFAULT NULL,
  `OImg2` varchar(30) DEFAULT NULL,
  `OImg3` varchar(30) DEFAULT NULL,
  `OImg4` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`OID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `outline_`
--

LOCK TABLES `outline_` WRITE;
/*!40000 ALTER TABLE `outline_` DISABLE KEYS */;
INSERT INTO `outline_` VALUES (1,1,1,'1111','2222',NULL,'1231',NULL,NULL,NULL,NULL),(2,1,1,'2222','2221',NULL,'2121',NULL,NULL,NULL,NULL),(3,2,1,'3333','3333',NULL,'3131',NULL,NULL,NULL,NULL),(4,2,2,'4444','4444',NULL,'4141',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `outline_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `outlinetype_`
--

DROP TABLE IF EXISTS `outlinetype_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outlinetype_` (
  `OTID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) DEFAULT NULL,
  `OName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`OTID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `outlinetype_`
--

LOCK TABLES `outlinetype_` WRITE;
/*!40000 ALTER TABLE `outlinetype_` DISABLE KEYS */;
INSERT INTO `outlinetype_` VALUES (1,1,'扩口型'),(2,2,'扩口型'),(3,1,'收口型'),(4,2,'收口型');
/*!40000 ALTER TABLE `outlinetype_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `part_`
--

DROP TABLE IF EXISTS `part_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `part_` (
  `PID` int(11) NOT NULL AUTO_INCREMENT,
  `PBID` int(11) DEFAULT NULL,
  `TID` int(11) NOT NULL DEFAULT '0',
  `PDescription` varchar(30) NOT NULL,
  `PFile` varchar(30) DEFAULT NULL,
  `PImg` varchar(30) NOT NULL,
  `PImg1` varchar(30) DEFAULT '',
  `PImg2` varchar(30) DEFAULT '',
  `PImg3` varchar(30) DEFAULT '',
  `PImg4` varchar(30) DEFAULT '',
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `part_`
--

LOCK TABLES `part_` WRITE;
/*!40000 ALTER TABLE `part_` DISABLE KEYS */;
INSERT INTO `part_` VALUES (1,2,1,'高脚杯',NULL,'www.baidu.picture','','','',''),(2,1,2,'燃气灶',NULL,'www.ifeng.com','','','',''),(3,2,1,'高脚杯',NULL,'333333333','','','',''),(4,2,1,'高脚杯',NULL,'44444444444','','','',''),(5,2,1,'高脚杯',NULL,'55555555','','','',''),(6,2,1,'高脚杯',NULL,'6666666666','','','','');
/*!40000 ALTER TABLE `part_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parttype_`
--

DROP TABLE IF EXISTS `parttype_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parttype_` (
  `PBID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) DEFAULT NULL,
  `PBName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`PBID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parttype_`
--

LOCK TABLES `parttype_` WRITE;
/*!40000 ALTER TABLE `parttype_` DISABLE KEYS */;
INSERT INTO `parttype_` VALUES (1,1,'杯柄'),(2,2,'杯柄'),(3,1,'杯肚'),(4,2,'杯肚');
/*!40000 ALTER TABLE `parttype_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shape_`
--

DROP TABLE IF EXISTS `shape_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shape_` (
  `ShapeID` int(11) NOT NULL AUTO_INCREMENT,
  `STID` int(11) NOT NULL DEFAULT '0',
  `ShapeDescription` varchar(30) NOT NULL DEFAULT '',
  `ShapeImg` varchar(30) NOT NULL,
  `ShapeFile` varchar(30) DEFAULT NULL,
  `ShapeData` varchar(30) NOT NULL,
  PRIMARY KEY (`ShapeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shape_`
--

LOCK TABLES `shape_` WRITE;
/*!40000 ALTER TABLE `shape_` DISABLE KEYS */;
/*!40000 ALTER TABLE `shape_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shapetype_`
--

DROP TABLE IF EXISTS `shapetype_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shapetype_` (
  `STID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) DEFAULT NULL,
  `STName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`STID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shapetype_`
--

LOCK TABLES `shapetype_` WRITE;
/*!40000 ALTER TABLE `shapetype_` DISABLE KEYS */;
/*!40000 ALTER TABLE `shapetype_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `survey_`
--

DROP TABLE IF EXISTS `survey_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `survey_` (
  `SID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) DEFAULT NULL,
  `ChooseSurvey` varchar(255) DEFAULT NULL,
  `WordSurvey` varchar(255) DEFAULT NULL,
  `WordResult` varchar(255) DEFAULT NULL,
  `ConnectSurvey` varchar(255) DEFAULT NULL,
  `ConnectResult` varchar(30) DEFAULT NULL,
  `Algorithms` varchar(30) DEFAULT NULL,
  `Ratio` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`SID`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `survey_`
--

LOCK TABLES `survey_` WRITE;
/*!40000 ALTER TABLE `survey_` DISABLE KEYS */;
INSERT INTO `survey_` VALUES (1,2,NULL,'www.baidu.com.22，11111111111111，***************','www.baidu.com.22','www.baidu.com.333','www.baidu.com.444','222','www.baidu.com.555'),(2,3,NULL,'www.sian.c，8///，|5ouyu，++++++++++','////////////////，，','','','',''),(3,4,'999','www.ifeng.com.cn',NULL,NULL,NULL,'888',NULL),(12,9,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,5,NULL,NULL,NULL,NULL,NULL,NULL,'www.ss.cn'),(15,6,NULL,'88888888888888，，','','','','','www.ss.cn'),(16,7,NULL,NULL,NULL,NULL,NULL,NULL,'www.ss.cn'),(17,8,NULL,NULL,NULL,NULL,NULL,NULL,'www.ss.cn'),(18,NULL,NULL,'，，，www.sian.c，8///|，|5ouyu',NULL,NULL,NULL,NULL,NULL),(19,NULL,NULL,'，，，www.sian.c，8///|，|5ouyu',NULL,NULL,NULL,NULL,NULL),(20,NULL,NULL,'，，，www.sian.c，8///|，|5ouyu',NULL,NULL,NULL,NULL,NULL),(21,NULL,NULL,'','','','','',''),(22,NULL,NULL,'','','','','','');
/*!40000 ALTER TABLE `survey_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `texture_`
--

DROP TABLE IF EXISTS `texture_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `texture_` (
  `TextureID` int(11) NOT NULL AUTO_INCREMENT,
  `TTID` int(11) NOT NULL DEFAULT '0',
  `TID` int(11) NOT NULL DEFAULT '0',
  `TDescription` varchar(30) NOT NULL,
  `TFile` varchar(30) NOT NULL DEFAULT '',
  `TImg` varchar(30) NOT NULL,
  `TImg1` varchar(30) DEFAULT '',
  `TImg2` varchar(30) DEFAULT '',
  `TImg3` varchar(30) DEFAULT '',
  `TImg4` varchar(30) DEFAULT '',
  PRIMARY KEY (`TextureID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `texture_`
--

LOCK TABLES `texture_` WRITE;
/*!40000 ALTER TABLE `texture_` DISABLE KEYS */;
INSERT INTO `texture_` VALUES (1,1,1,'22222','222','222','','','','');
/*!40000 ALTER TABLE `texture_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `texturetype_`
--

DROP TABLE IF EXISTS `texturetype_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `texturetype_` (
  `TTID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) DEFAULT NULL,
  `TTName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`TTID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `texturetype_`
--

LOCK TABLES `texturetype_` WRITE;
/*!40000 ALTER TABLE `texturetype_` DISABLE KEYS */;
INSERT INTO `texturetype_` VALUES (1,1,'玻璃'),(2,2,'玻璃'),(3,1,'磨砂'),(4,2,'磨砂');
/*!40000 ALTER TABLE `texturetype_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type_`
--

DROP TABLE IF EXISTS `type_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type_` (
  `TID` int(11) NOT NULL AUTO_INCREMENT,
  `TName` varchar(30) DEFAULT NULL,
  `TAlgorithm` varchar(100) DEFAULT NULL,
  `TWordType` int(11) DEFAULT NULL,
  `TYuyi` varchar(30) DEFAULT NULL,
  `TAnli` varchar(30) DEFAULT NULL,
  `TBianma` varchar(30) DEFAULT NULL,
  `TZaoxing` varchar(30) DEFAULT NULL,
  `TCanshu` varchar(30) DEFAULT NULL,
  `TShengcheng` varchar(30) DEFAULT NULL,
  `TTiaozheng` varchar(30) DEFAULT NULL,
  `TIcon` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`TID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type_`
--

LOCK TABLES `type_` WRITE;
/*!40000 ALTER TABLE `type_` DISABLE KEYS */;
INSERT INTO `type_` VALUES (2,'燃气灶5999','444',2,'词汇库,词汇库888','888888',',85522,,85522,/////////','888888811111111111','','','',''),(3,'游艇','444',2,'159','753','852','123','114','441','333',NULL),(4,'织物','333',2,'乐西',NULL,NULL,NULL,NULL,NULL,NULL,'x999'),(6,'燃气灶','222',2,'词汇库','963,963693','741','456','221','444,44496','9579',''),(9,'qqqqq','444',2,'qqqq','','','','','','',NULL),(11,'333333','111',2,'333','','','','','','',NULL),(12,'6','222',2,'6','','','','','','',NULL),(13,'666',NULL,NULL,'','','','','','','',NULL);
/*!40000 ALTER TABLE `type_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_`
--

DROP TABLE IF EXISTS `user_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_` (
  `UID` int(11) NOT NULL AUTO_INCREMENT,
  `UName` varchar(30) DEFAULT NULL,
  `UPassword` varchar(30) DEFAULT NULL,
  `UPrivilege` int(5) DEFAULT NULL,
  `UEmail` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`UID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_`
--

LOCK TABLES `user_` WRITE;
/*!40000 ALTER TABLE `user_` DISABLE KEYS */;
INSERT INTO `user_` VALUES (1,'111','aY1RoZ2KEhzlgUmde3AWaA==',1,''),(2,'222','vL4zZeasleosA0OiOVg03Q==',1,''),(3,'222','R7zlx09Yn0hn29V+nKn4CA==',0,''),(4,'222','R7zlx09Yn0hn29V+nKn4CA==',1,''),(5,'333','MQ3Lv0zOYvdioqqhSNVWvQ==',0,''),(6,'222','MQ3Lv0zOYvdioqqhSNVWvQ==',0,''),(7,'111','aY1RoZ2KEhzlgUmde3AWaA==',0,''),(9,'好好','12356',NULL,'csdn-haohao@163.com'),(11,'haohao','111',0,'www.neteast.163'),(12,'haohao','111',0,'www.neteast.163'),(13,'haohao1','111',0,'www.neteast.163'),(14,'haohao1','111',0,'www.neteast.163'),(15,'haohao1','111',0,'www.neteast.163'),(16,'haohao1','111',0,'www.neteast.163'),(17,'haohao12','111',0,'www.neteast.163'),(18,'haohao12','111',0,'www.neteast.163');
/*!40000 ALTER TABLE `user_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `word_`
--

DROP TABLE IF EXISTS `word_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `word_` (
  `WID` int(11) NOT NULL AUTO_INCREMENT,
  `WWord` varchar(30) NOT NULL,
  `WBasic` varchar(30) NOT NULL,
  `WDetail` varchar(100) NOT NULL DEFAULT '',
  `WSimilar` varchar(300) DEFAULT NULL,
  `WOposite` varchar(30) DEFAULT NULL,
  `WColorWarm` int(11) DEFAULT NULL,
  `WFirstChar` varchar(30) DEFAULT '',
  `WVocaType` varchar(30) DEFAULT '',
  PRIMARY KEY (`WID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `word_`
--

LOCK TABLES `word_` WRITE;
/*!40000 ALTER TABLE `word_` DISABLE KEYS */;
INSERT INTO `word_` VALUES (1,'安宁','1.秩序正常，没有骚扰；2.心情安定、平静。','1.安定，太平。',NULL,NULL,NULL,NULL,NULL),(2,'安稳','1.秩序正常，没有骚扰','1.安定，太平。',NULL,NULL,NULL,NULL,NULL),(3,'安静','1.秩序正常，没有骚扰','1.安定，太平。',NULL,NULL,NULL,NULL,NULL),(5,'灿烂','1.秩序正常，没有骚扰','1.安定，太平。','璀璨 瑰丽','暗淡 惨淡',1,'C','优雅'),(6,'平均','aaaa','1111',NULL,NULL,NULL,'P',NULL),(7,'平均','aaaa','1111',NULL,NULL,NULL,'P',NULL),(9,'小米','7777','7777',NULL,NULL,NULL,'X',NULL),(10,'学习','44','44',NULL,NULL,NULL,'X',NULL),(11,'方法','22','222',NULL,NULL,NULL,'F',NULL),(12,'哈尼','777','7777',NULL,NULL,NULL,'H',NULL),(13,'急急急','','',NULL,NULL,NULL,'J',NULL),(14,'解决','59','5555',NULL,NULL,NULL,'J',NULL),(15,'克拉克','','',NULL,NULL,NULL,NULL,NULL),(16,'事实上','','',NULL,NULL,NULL,'S',NULL),(17,'看','','',NULL,NULL,NULL,'K',NULL),(18,'88888','','',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `word_` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-03 21:59:05
