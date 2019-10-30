/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : zxx_store

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-10-30 17:38:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `store_user`
-- ----------------------------
DROP TABLE IF EXISTS `store_user`;
CREATE TABLE `store_user` (
  `id` varchar(50) NOT NULL COMMENT '用户id 唯一',
  `name` varchar(20) NOT NULL COMMENT '用户名称',
  `sex` int(1) DEFAULT '0' COMMENT '用户性别(0:女 1:男)',
  `password` varchar(20) NOT NULL COMMENT '用户密码',
  `email` varchar(30) NOT NULL COMMENT '用户邮箱',
  `phone` varchar(15) NOT NULL COMMENT '电话号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store_user
-- ----------------------------
