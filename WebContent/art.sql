# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2017-08-14 18:51:56
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES gb2312 */;

#
# Structure for table "bottomcase_"
#

DROP TABLE IF EXISTS `bottomcase_`;
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

#
# Data for table "bottomcase_"
#

INSERT INTO `bottomcase_` VALUES (1,1,1,'111',NULL,NULL,NULL,NULL,NULL,NULL),(2,2,1,'222',NULL,NULL,NULL,NULL,NULL,NULL),(3,2,1,'333',NULL,NULL,NULL,NULL,NULL,NULL),(4,1,2,'111',NULL,NULL,NULL,NULL,NULL,NULL),(5,2,2,'111',NULL,NULL,NULL,NULL,NULL,NULL),(6,2,2,'333',NULL,NULL,NULL,NULL,NULL,NULL);

#
# Structure for table "bottomcasetype_"
#

DROP TABLE IF EXISTS `bottomcasetype_`;
CREATE TABLE `bottomcasetype_` (
  `BCTID` int(11) NOT NULL AUTO_INCREMENT,
  `BCTName` varchar(30) NOT NULL,
  `TID` int(11) NOT NULL,
  PRIMARY KEY (`BCTID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Data for table "bottomcasetype_"
#

INSERT INTO `bottomcasetype_` VALUES (1,'������',1),(2,'�տ���',1),(3,'�տ���',2),(4,'������',2);

#
# Structure for table "color_"
#

DROP TABLE IF EXISTS `color_`;
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

#
# Data for table "color_"
#

INSERT INTO `color_` VALUES (1,1,1,'1111','1122','1111','1111',NULL,NULL,NULL,NULL,NULL),(2,1,1,'2222','222111','2222','222',NULL,NULL,NULL,NULL,NULL),(3,2,1,'333','333','333','333',NULL,NULL,NULL,NULL,NULL);

#
# Structure for table "colortype_"
#

DROP TABLE IF EXISTS `colortype_`;
CREATE TABLE `colortype_` (
  `CBID` int(11) NOT NULL AUTO_INCREMENT,
  `CBName` varchar(30) DEFAULT NULL,
  `TID` int(11) DEFAULT NULL,
  PRIMARY KEY (`CBID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Data for table "colortype_"
#

INSERT INTO `colortype_` VALUES (1,'ůɫ��',1),(2,'ůɫ��',2),(3,'��ɫ��',2),(4,'��ɫ��',1);

#
# Structure for table "jword_"
#

DROP TABLE IF EXISTS `jword_`;
CREATE TABLE `jword_` (
  `JWID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) NOT NULL DEFAULT '0',
  `WID` int(11) NOT NULL DEFAULT '0',
  `CoupleWID` int(11) DEFAULT NULL,
  PRIMARY KEY (`JWID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

#
# Data for table "jword_"
#

INSERT INTO `jword_` VALUES (1,1,1,NULL),(2,1,2,NULL),(3,2,3,2),(4,3,4,3),(5,4,5,4),(6,1,1,NULL),(7,2,1,2);

#
# Structure for table "newcase_"
#

DROP TABLE IF EXISTS `newcase_`;
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "newcase_"
#

INSERT INTO `newcase_` VALUES (1,1,'222','2222','2222',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

#
# Structure for table "outline_"
#

DROP TABLE IF EXISTS `outline_`;
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

#
# Data for table "outline_"
#

INSERT INTO `outline_` VALUES (1,1,1,'1111','2222',NULL,'1231',NULL,NULL,NULL,NULL),(2,1,1,'2222','2221',NULL,'2121',NULL,NULL,NULL,NULL),(3,2,1,'3333','3333',NULL,'3131',NULL,NULL,NULL,NULL),(4,2,2,'4444','4444',NULL,'4141',NULL,NULL,NULL,NULL);

#
# Structure for table "outlinetype_"
#

DROP TABLE IF EXISTS `outlinetype_`;
CREATE TABLE `outlinetype_` (
  `OTID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) DEFAULT NULL,
  `OName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`OTID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Data for table "outlinetype_"
#

INSERT INTO `outlinetype_` VALUES (1,1,'������'),(2,2,'������'),(3,1,'�տ���'),(4,2,'�տ���');

#
# Structure for table "part_"
#

DROP TABLE IF EXISTS `part_`;
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

#
# Data for table "part_"
#

INSERT INTO `part_` VALUES (1,2,1,'�߽ű�',NULL,'www.baidu.picture','','','',''),(2,1,2,'ȼ����',NULL,'www.ifeng.com','','','',''),(3,2,1,'�߽ű�',NULL,'333333333','','','',''),(4,2,1,'�߽ű�',NULL,'44444444444','','','',''),(5,2,1,'�߽ű�',NULL,'55555555','','','',''),(6,2,1,'�߽ű�',NULL,'6666666666','','','','');

#
# Structure for table "parttype_"
#

DROP TABLE IF EXISTS `parttype_`;
CREATE TABLE `parttype_` (
  `PBID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) DEFAULT NULL,
  `PBName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`PBID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Data for table "parttype_"
#

INSERT INTO `parttype_` VALUES (1,1,'����'),(2,2,'����'),(3,1,'����'),(4,2,'����');

#
# Structure for table "shape_"
#

DROP TABLE IF EXISTS `shape_`;
CREATE TABLE `shape_` (
  `ShapeID` int(11) NOT NULL AUTO_INCREMENT,
  `STID` int(11) NOT NULL DEFAULT '0',
  `ShapeDescription` varchar(30) NOT NULL DEFAULT '',
  `ShapeImg` varchar(30) NOT NULL,
  `ShapeFile` varchar(30) DEFAULT NULL,
  `ShapeData` varchar(30) NOT NULL,
  PRIMARY KEY (`ShapeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "shape_"
#


#
# Structure for table "shapetype_"
#

DROP TABLE IF EXISTS `shapetype_`;
CREATE TABLE `shapetype_` (
  `STID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) DEFAULT NULL,
  `STName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`STID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "shapetype_"
#


#
# Structure for table "survey_"
#

DROP TABLE IF EXISTS `survey_`;
CREATE TABLE `survey_` (
  `SID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) DEFAULT NULL,
  `ChooseSurvey` varchar(30) DEFAULT NULL,
  `WordSurvey` varchar(30) DEFAULT NULL,
  `WordResult` varchar(30) DEFAULT NULL,
  `ConnectSurvey` varchar(30) DEFAULT NULL,
  `ConnectResult` varchar(30) DEFAULT NULL,
  `Algorithms` varchar(30) DEFAULT NULL,
  `Ratio` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`SID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

#
# Data for table "survey_"
#

INSERT INTO `survey_` VALUES (1,1,'111','www.baidu.com.111','www.baidu.com.22','www.baidu.com.333','www.baidu.com.444','222','www.baidu.com.555'),(2,1,'999','www.sian.com.222','111','2222','3333','888','444'),(3,2,'999','www.ifeng.com.cn',NULL,NULL,NULL,'888',NULL),(12,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,1,NULL,NULL,NULL,NULL,NULL,NULL,'www.ss.cn'),(15,1,NULL,NULL,NULL,NULL,NULL,NULL,'www.ss.cn'),(16,1,NULL,NULL,NULL,NULL,NULL,NULL,'www.ss.cn'),(17,1,NULL,NULL,NULL,NULL,NULL,NULL,'www.ss.cn');

#
# Structure for table "texture_"
#

DROP TABLE IF EXISTS `texture_`;
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

#
# Data for table "texture_"
#

INSERT INTO `texture_` VALUES (1,1,1,'22222','222','222','','','','');

#
# Structure for table "texturetype_"
#

DROP TABLE IF EXISTS `texturetype_`;
CREATE TABLE `texturetype_` (
  `TTID` int(11) NOT NULL AUTO_INCREMENT,
  `TID` int(11) DEFAULT NULL,
  `TTName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`TTID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Data for table "texturetype_"
#

INSERT INTO `texturetype_` VALUES (1,1,'����'),(2,2,'����'),(3,1,'ĥɰ'),(4,2,'ĥɰ');

#
# Structure for table "type_"
#

DROP TABLE IF EXISTS `type_`;
CREATE TABLE `type_` (
  `TID` int(11) NOT NULL AUTO_INCREMENT,
  `TName` varchar(30) NOT NULL,
  `TAlgorithm` int(11) NOT NULL,
  `TWordType` int(11) DEFAULT NULL,
  `TYuyi` varchar(30) DEFAULT NULL,
  `TAnli` varchar(30) DEFAULT NULL,
  `TBianma` varchar(30) DEFAULT NULL,
  `TZaoxing` varchar(30) DEFAULT NULL,
  `TCanshu` varchar(30) DEFAULT NULL,
  `TShengcheng` varchar(30) DEFAULT NULL,
  `TTiaozheng` varchar(30) DEFAULT NULL,
  `TIcon` varchar(30) NOT NULL,
  PRIMARY KEY (`TID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

#
# Data for table "type_"
#

INSERT INTO `type_` VALUES (1,'�߽ű�',112,1,'�����','222','bianma ','789','112','444','222','999'),(2,'ȼ����',223,2,'�ʻ��','963','741','456','221','444','9579','221'),(3,'��ͧ',112,2,'159','753','852','123','114','441','333','999'),(4,'֯��',334,2,'����',NULL,NULL,NULL,NULL,NULL,NULL,'x999'),(5,'haohao',1,NULL,NULL,'11111111111',NULL,NULL,NULL,NULL,'9579','2222222222');

#
# Structure for table "user_"
#

DROP TABLE IF EXISTS `user_`;
CREATE TABLE `user_` (
  `UID` int(11) NOT NULL AUTO_INCREMENT,
  `UName` varchar(30) DEFAULT NULL,
  `UPassword` varchar(30) DEFAULT NULL,
  `UPrivilege` int(5) DEFAULT NULL,
  `UEmail` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`UID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

#
# Data for table "user_"
#

INSERT INTO `user_` VALUES (1,'111','aY1RoZ2KEhzlgUmde3AWaA==',1,''),(2,'222','vL4zZeasleosA0OiOVg03Q==',1,''),(3,'222','R7zlx09Yn0hn29V+nKn4CA==',0,''),(4,'222','R7zlx09Yn0hn29V+nKn4CA==',1,''),(5,'333','MQ3Lv0zOYvdioqqhSNVWvQ==',0,''),(6,'222','MQ3Lv0zOYvdioqqhSNVWvQ==',0,''),(7,'111','aY1RoZ2KEhzlgUmde3AWaA==',0,''),(9,'�ú�','12356',NULL,'csdn-haohao@163.com'),(11,'haohao','111',0,'www.neteast.163'),(12,'haohao','111',0,'www.neteast.163'),(13,'haohao1','111',0,'www.neteast.163'),(14,'haohao1','111',0,'www.neteast.163'),(15,'haohao1','111',0,'www.neteast.163'),(16,'haohao1','111',0,'www.neteast.163'),(17,'haohao12','111',0,'www.neteast.163'),(18,'haohao12','111',0,'www.neteast.163');

#
# Structure for table "word_"
#

DROP TABLE IF EXISTS `word_`;
CREATE TABLE `word_` (
  `WID` int(11) NOT NULL AUTO_INCREMENT,
  `WWord` varchar(30) NOT NULL,
  `WBasic` varchar(30) NOT NULL,
  `WDetail` varchar(100) NOT NULL DEFAULT '',
  `WSimilar` varchar(300) DEFAULT NULL,
  `WOposite` varchar(30) DEFAULT NULL,
  `WColorWarm` int(11) DEFAULT NULL,
  `WFirstChar` varchar(30) NOT NULL DEFAULT '',
  `WVocaType` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`WID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

#
# Data for table "word_"
#

INSERT INTO `word_` VALUES (1,'����','1.����������û��ɧ�ţ�2.���鰲����ƽ����','1.������̫ƽ��','���� ���� ���� ���� ���� �徲 ���� ���� ���� ƽ�� �ͻ� ���� ƽ�� ƽ�� ���� ��ȫ ���� ���� �� �ľ� ���� �ȶ� ���� ƽ�� ��ƽ ���� ���� ���� ���� ���� ̫ƽ �ž� �侲 ��ƽ ���� ��Ȼ','���� ���� ���� ���� ���� ɧ�� ���� ���� ���� ����',1,'A','����'),(2,'����','1.����������û��ɧ��','1.������̫ƽ��','���� �ȶ�','�ζ� ����',1,'A','����'),(3,'����','1.����������û��ɧ��','1.������̫ƽ��','�徻 ����','���� ����',1,'A','����'),(4,'����','1.����������û��ɧ��','1.������̫ƽ��','���� ����','ĺ��',1,'C','����'),(5,'����','1.����������û��ɧ��','1.������̫ƽ��','�� ����','���� �ҵ�',1,'C','����');
