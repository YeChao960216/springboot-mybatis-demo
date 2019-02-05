/*
Navicat MySQL Data Transfer

Source Server         : localhost_mysql
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : mysql_produce

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2019-02-05 11:48:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chemicals
-- ----------------------------
DROP TABLE IF EXISTS `chemicals`;
CREATE TABLE `chemicals` (
  `chemicals_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '肥料、药品施用编号',
  `grow_id` int(36) DEFAULT NULL COMMENT '种植批次编号',
  `use_date` varchar(36) DEFAULT NULL COMMENT '使用日期',
  `formula` varchar(512) DEFAULT NULL COMMENT '配方',
  `dosage` double DEFAULT NULL COMMENT '用量',
  `flag` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`chemicals_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chemicals
-- ----------------------------

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `company_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '中间厂商',
  `license` varchar(256) DEFAULT NULL COMMENT '营业执照',
  `company_name` varchar(128) DEFAULT NULL COMMENT '公司名称',
  `phone` varchar(45) DEFAULT NULL COMMENT '联系电话',
  `address` varchar(256) DEFAULT NULL COMMENT '公司地址',
  `flag` varchar(512) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------

-- ----------------------------
-- Table structure for grow
-- ----------------------------
DROP TABLE IF EXISTS `grow`;
CREATE TABLE `grow` (
  `grow_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '种植批次编号',
  `grower_id` int(36) DEFAULT NULL COMMENT '种植户编号',
  `grower_time` varchar(36) DEFAULT NULL COMMENT '种植时间',
  `harvest_time` varchar(36) DEFAULT NULL COMMENT '收割时间',
  `flag` varchar(256) DEFAULT NULL COMMENT '备注',
  `weight` double(45,0) DEFAULT NULL COMMENT '重量',
  `unit` varchar(45) DEFAULT NULL COMMENT '单位',
  PRIMARY KEY (`grow_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grow
-- ----------------------------

-- ----------------------------
-- Table structure for growers
-- ----------------------------
DROP TABLE IF EXISTS `growers`;
CREATE TABLE `growers` (
  `growers_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '种植户编号',
  `name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `id_card` varchar(45) DEFAULT NULL COMMENT '身份证编号',
  `phone` varchar(45) DEFAULT NULL COMMENT '联系电话',
  `farm` varchar(128) DEFAULT NULL COMMENT '经营地',
  `flag` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`growers_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of growers
-- ----------------------------

-- ----------------------------
-- Table structure for manufacture
-- ----------------------------
DROP TABLE IF EXISTS `manufacture`;
CREATE TABLE `manufacture` (
  `manufacture_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '加工编号',
  `company_id` int(36) DEFAULT NULL COMMENT '加工厂商编号',
  `grow_id` int(36) DEFAULT NULL COMMENT '种植批次编号',
  `manufacture_date` varchar(128) DEFAULT NULL COMMENT '加工日期',
  `validity_date` varchar(128) DEFAULT NULL COMMENT '有效期',
  `site` varchar(256) DEFAULT NULL COMMENT '加工地点',
  `method` varchar(45) DEFAULT NULL COMMENT '加工方式',
  `charge_id` varchar(128) DEFAULT NULL COMMENT '加工负责人身份证编号',
  `flag` varchar(512) DEFAULT NULL COMMENT '备注',
  `charge_name` varchar(45) DEFAULT NULL COMMENT '加工负责人姓名',
  `weight` double DEFAULT NULL COMMENT '加工数量',
  `unit` varchar(45) DEFAULT NULL COMMENT '数量单位',
  PRIMARY KEY (`manufacture_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manufacture
-- ----------------------------

-- ----------------------------
-- Table structure for market
-- ----------------------------
DROP TABLE IF EXISTS `market`;
CREATE TABLE `market` (
  `Origin_id` varchar(45) NOT NULL COMMENT '溯源编号',
  `market_name` varchar(45) DEFAULT NULL COMMENT '超市名称',
  `phone` varchar(45) DEFAULT NULL COMMENT '联系方式',
  `license` varchar(45) DEFAULT NULL COMMENT '营业执照',
  `address` varchar(256) DEFAULT NULL COMMENT '超市地址',
  `scan_time` varchar(45) DEFAULT NULL COMMENT '扫描次数',
  `flag` varchar(512) DEFAULT NULL COMMENT '备注',
  `trans_id` varchar(45) DEFAULT NULL COMMENT '运输编号',
  `grow_id` int(36) DEFAULT NULL COMMENT '种植批次编号',
  PRIMARY KEY (`Origin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market
-- ----------------------------

-- ----------------------------
-- Table structure for privilege
-- ----------------------------
DROP TABLE IF EXISTS `privilege`;
CREATE TABLE `privilege` (
  `privilege_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '权限编号',
  `privilege_name` varchar(45) DEFAULT NULL COMMENT '权限名称',
  `privilege_link` varchar(128) DEFAULT NULL COMMENT '权限链接',
  `flag` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`privilege_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of privilege
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `role_name` varchar(45) DEFAULT NULL COMMENT '角色名称',
  `flag` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `role_privilege`;
CREATE TABLE `role_privilege` (
  `role_privilege_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '角色权限关系编号',
  `role_id` int(36) DEFAULT NULL COMMENT '角色编号',
  `privilege_id` int(36) DEFAULT NULL COMMENT '权限编号',
  PRIMARY KEY (`role_privilege_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_privilege
-- ----------------------------

-- ----------------------------
-- Table structure for trans
-- ----------------------------
DROP TABLE IF EXISTS `trans`;
CREATE TABLE `trans` (
  `trans_id` varchar(45) NOT NULL COMMENT '运输编号',
  `grow_id` int(36) DEFAULT NULL COMMENT '种植批次编号',
  `manufacture_id` int(36) DEFAULT NULL COMMENT '加工编号',
  `car_num` varchar(45) DEFAULT NULL COMMENT '车牌号',
  `charge_name` varchar(45) DEFAULT NULL COMMENT '运输负责人姓名',
  `charge_id` varchar(45) DEFAULT NULL COMMENT '运输负责人身份证编号',
  `tran_date` varchar(45) DEFAULT NULL COMMENT '运输开始时间',
  `temperature` double DEFAULT NULL COMMENT '温度',
  `humidity` double DEFAULT NULL COMMENT '湿度',
  `lat` double DEFAULT NULL COMMENT '纬度',
  `lng` double DEFAULT NULL COMMENT '经度',
  `trans_company` varchar(128) DEFAULT NULL COMMENT '运输公司',
  `flag` varchar(512) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`trans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trans
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `name` varchar(45) NOT NULL COMMENT '姓名',
  `sex` varchar(12) NOT NULL COMMENT '性别',
  `id_card` varchar(45) NOT NULL COMMENT '身份证',
  `phone` varchar(45) NOT NULL COMMENT '联系电话',
  `address` varchar(128) NOT NULL COMMENT '地址',
  `user_name` varchar(45) DEFAULT NULL COMMENT '用户名',
  `password` varchar(45) NOT NULL COMMENT '密码',
  `flag` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_role_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '用户权限关系编号',
  `role_id` int(36) DEFAULT NULL COMMENT '角色编号',
  `user_id` int(36) DEFAULT NULL COMMENT '用户编号',
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
