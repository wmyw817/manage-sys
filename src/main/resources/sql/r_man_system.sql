/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : r_man_system

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-12-25 21:50:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_admin
-- ----------------------------
DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `aduser` varchar(255) DEFAULT NULL,
  `adpwd` varchar(255) DEFAULT NULL,
  `adphone` varchar(255) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_admin
-- ----------------------------

-- ----------------------------
-- Table structure for tb_bill
-- ----------------------------
DROP TABLE IF EXISTS `tb_bill`;
CREATE TABLE `tb_bill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `biticketnum` varchar(255) DEFAULT NULL,
  `tenid` int(11) DEFAULT NULL,
  `bitate` varchar(255) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_bill
-- ----------------------------

-- ----------------------------
-- Table structure for tb_chummage
-- ----------------------------
DROP TABLE IF EXISTS `tb_chummage`;
CREATE TABLE `tb_chummage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roid` int(11) DEFAULT NULL,
  `chrent` double(11,0) DEFAULT NULL,
  `chpaymenttime` varchar(255) DEFAULT NULL,
  `chnextpaymenttime` varchar(255) DEFAULT NULL,
  `chtate` varchar(2) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_chummage
-- ----------------------------

-- ----------------------------
-- Table structure for tb_deposit
-- ----------------------------
DROP TABLE IF EXISTS `tb_deposit`;
CREATE TABLE `tb_deposit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roid` int(11) DEFAULT NULL,
  `biticketnum` varchar(255) DEFAULT NULL,
  `bicashpledges` varchar(255) DEFAULT NULL,
  `bipaymenttime` varchar(255) DEFAULT NULL,
  `bicashpledge` varchar(255) DEFAULT NULL,
  `bitate` varchar(2) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_deposit
-- ----------------------------

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roid` int(11) DEFAULT NULL,
  `ordtotalrentaltime` varchar(255) DEFAULT NULL,
  `ordtotalrent` double(5,0) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_order
-- ----------------------------

-- ----------------------------
-- Table structure for tb_rooms
-- ----------------------------
DROP TABLE IF EXISTS `tb_rooms`;
CREATE TABLE `tb_rooms` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roid` int(11) DEFAULT NULL,
  `rostate` varchar(2) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_rooms
-- ----------------------------

-- ----------------------------
-- Table structure for tb_rooms_check
-- ----------------------------
DROP TABLE IF EXISTS `tb_rooms_check`;
CREATE TABLE `tb_rooms_check` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ronum` varchar(255) DEFAULT NULL,
  `tenid` int(11) DEFAULT NULL,
  `rostate` varchar(255) DEFAULT NULL,
  `rocheckin` varchar(255) DEFAULT NULL,
  `rocheckon` varchar(255) DEFAULT NULL,
  `ropeoplenum` int(11) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_rooms_check
-- ----------------------------

-- ----------------------------
-- Table structure for tb_taxes_pattern
-- ----------------------------
DROP TABLE IF EXISTS `tb_taxes_pattern`;
CREATE TABLE `tb_taxes_pattern` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `taxesptn` int(2) DEFAULT NULL,
  `taxescomment` varchar(255) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_taxes_pattern
-- ----------------------------

-- ----------------------------
-- Table structure for tb_tenants
-- ----------------------------
DROP TABLE IF EXISTS `tb_tenants`;
CREATE TABLE `tb_tenants` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenuser` varchar(255) DEFAULT NULL,
  `tengender` varchar(3) DEFAULT NULL,
  `tenidcard` varchar(255) DEFAULT NULL,
  `tennation` varchar(255) DEFAULT NULL,
  `tenage` varchar(255) DEFAULT NULL,
  `tenphone` varchar(255) DEFAULT NULL,
  `tenpositive` varchar(255) DEFAULT NULL,
  `tenrent` varchar(255) DEFAULT NULL,
  `tenroomnum` varchar(255) DEFAULT NULL,
  `tencomment` varchar(500) DEFAULT NULL,
  `taxesptn` varchar(255) DEFAULT NULL,
  `tenstate` int(2) unsigned zerofill DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_tenants
-- ----------------------------

-- ----------------------------
-- Table structure for tb_tenants_associated
-- ----------------------------
DROP TABLE IF EXISTS `tb_tenants_associated`;
CREATE TABLE `tb_tenants_associated` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenuser` varchar(255) DEFAULT NULL,
  `tengender` varchar(3) DEFAULT NULL,
  `tenidcard` varchar(255) DEFAULT NULL,
  `tennation` varchar(255) DEFAULT NULL,
  `tenage` varchar(255) DEFAULT NULL,
  `tenphone` varchar(255) DEFAULT NULL,
  `tenpositive` varchar(255) DEFAULT NULL,
  `tenroomid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `tencomment` varchar(255) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_tenants_associated
-- ----------------------------

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `pnumber` int(11) NOT NULL,
  `updatetime` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'admin', 'admin', '1380707906', '2019-12-01 16:27:53');

-- ----------------------------
-- Table structure for tb_water_electricity_total
-- ----------------------------
DROP TABLE IF EXISTS `tb_water_electricity_total`;
CREATE TABLE `tb_water_electricity_total` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roid` int(11) DEFAULT NULL,
  `waterconsumption` double(11,0) DEFAULT NULL,
  `electricityconsumption` double(11,0) DEFAULT NULL,
  `waterrate` double(11,0) DEFAULT NULL,
  `electricityrate` double(11,0) DEFAULT NULL,
  `usagedays` double(11,0) DEFAULT NULL,
  `totalcost` double(11,0) DEFAULT NULL,
  `paymenttime` varchar(255) DEFAULT NULL,
  `wetate` varchar(2) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_water_electricity_total
-- ----------------------------

-- ----------------------------
-- Table structure for tb_water_electricity_unit
-- ----------------------------
DROP TABLE IF EXISTS `tb_water_electricity_unit`;
CREATE TABLE `tb_water_electricity_unit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roid` int(11) DEFAULT NULL,
  `waterunit` double(11,0) DEFAULT NULL,
  `electricityunit` double(11,0) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_water_electricity_unit
-- ----------------------------

-- ----------------------------
-- Table structure for tb_water_electricity_use
-- ----------------------------
DROP TABLE IF EXISTS `tb_water_electricity_use`;
CREATE TABLE `tb_water_electricity_use` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roid` int(11) DEFAULT NULL,
  `tenid` int(11) DEFAULT NULL,
  `waternum` double(11,0) DEFAULT NULL,
  `electricitynum` double(11,0) DEFAULT NULL,
  `rocheckin` varchar(255) DEFAULT NULL,
  `meterreading` varchar(255) DEFAULT NULL,
  `updatetime` varchar(255) DEFAULT NULL,
  `aduser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_water_electricity_use
-- ----------------------------
