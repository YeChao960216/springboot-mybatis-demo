/*
Navicat MySQL Data Transfer

Source Server         : localhost_mysql
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2018-10-17 15:22:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mysql_game
-- ----------------------------
DROP TABLE IF EXISTS `mysql_game`;
CREATE TABLE `mysql_game` (
  `id` int(36) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `game_name` varchar(36) DEFAULT NULL COMMENT '游戏名、平台名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mysql_game
-- ----------------------------
