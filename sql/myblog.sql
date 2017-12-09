/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : myblog

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-09 13:26:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `article_id` smallint(5) NOT NULL AUTO_INCREMENT COMMENT '日志自增ID号',
  `article_name` varchar(128) NOT NULL COMMENT '文章名称',
  `article_time` datetime NOT NULL COMMENT '发布时间',
  `article_ip` varchar(15) NOT NULL COMMENT '发布IP',
  `article_click` int(10) NOT NULL COMMENT '查看人数',
  `sort_article_id` mediumint(8) NOT NULL COMMENT '所属分类',
  `user_id` mediumint(8) NOT NULL COMMENT '所属用户ID',
  `type_id` tinyint(3) NOT NULL DEFAULT '1' COMMENT '栏目ID',
  `article_type` int(13) NOT NULL DEFAULT '1' COMMENT '文章的模式:0为私有，1为公开，2为仅好友查看',
  `article_content` text NOT NULL COMMENT '文章内容',
  `article_up` tinyint(3) NOT NULL DEFAULT '0' COMMENT '是否置顶:0为否，1为是',
  `article_support` tinyint(3) NOT NULL DEFAULT '0' COMMENT '是否博主推荐:0为否，1为是',
  PRIMARY KEY (`article_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for article_sort
-- ----------------------------
DROP TABLE IF EXISTS `article_sort`;
CREATE TABLE `article_sort` (
  `sort_article_id` mediumint(8) NOT NULL AUTO_INCREMENT COMMENT '文章自增ID',
  `sort_article_name` varchar(60) NOT NULL COMMENT '分类名称',
  PRIMARY KEY (`sort_article_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_sort
-- ----------------------------

-- ----------------------------
-- Table structure for dynamic
-- ----------------------------
DROP TABLE IF EXISTS `dynamic`;
CREATE TABLE `dynamic` (
  `dynamic_id` mediumint(8) NOT NULL AUTO_INCREMENT COMMENT '动态记录ID',
  `user_id` mediumint(8) NOT NULL COMMENT '用户ID',
  `dynamic_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '发布时间',
  `dynamic_ip` varchar(15) NOT NULL COMMENT '说说发布时的IP地址',
  `dynamic_content` varchar(255) NOT NULL COMMENT '说说内容',
  `type_id` tinyint(3) NOT NULL DEFAULT '2' COMMENT '栏目ID,默认为2',
  PRIMARY KEY (`dynamic_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dynamic
-- ----------------------------

-- ----------------------------
-- Table structure for friend
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
  `f_id` smallint(5) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_id` mediumint(8) NOT NULL COMMENT '用户ID',
  `friend_id` mediumint(8) NOT NULL COMMENT '好友ID',
  PRIMARY KEY (`f_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of friend
-- ----------------------------

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `message_id` smallint(5) NOT NULL AUTO_INCREMENT COMMENT '留言表自增ID',
  `user_id` mediumint(8) NOT NULL COMMENT '用户ID',
  `message_user_id` mediumint(8) NOT NULL COMMENT '留言者ID',
  `message_content` text NOT NULL COMMENT '留言内容',
  `message_stay_time` datetime NOT NULL COMMENT '留言时间',
  `message_user_ip` varchar(15) NOT NULL COMMENT '留言用户的IP地址',
  PRIMARY KEY (`message_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for power_list
-- ----------------------------
DROP TABLE IF EXISTS `power_list`;
CREATE TABLE `power_list` (
  `p_id` mediumint(8) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `power_id` mediumint(8) NOT NULL COMMENT '权限ID',
  `power_name` varchar(36) NOT NULL COMMENT '权限名称',
  PRIMARY KEY (`p_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of power_list
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `group_id` mediumint(8) NOT NULL COMMENT '用户组ID',
  `user_name` varchar(32) NOT NULL COMMENT '用户名',
  `user_pwd` varchar(32) NOT NULL COMMENT '用户密码',
  `user_phone` int(12) NOT NULL COMMENT '用户手机号码',
  `user_sex` varchar(6) NOT NULL COMMENT '用户性别',
  `user_qq` int(10) NOT NULL COMMENT '用户QQ号码',
  `user_email` varchar(64) NOT NULL COMMENT '用户EMAIL地址',
  `user_address` varchar(255) NOT NULL COMMENT '用户地址',
  `user_birthday` datetime NOT NULL COMMENT '用户生日',
  `user_description` varchar(255) NOT NULL COMMENT '人生格言',
  `user_image_url` varchar(255) NOT NULL COMMENT '用户头像存储路径',
  `user_register_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '用户注册时间',
  `user_register_ip` varchar(15) NOT NULL COMMENT '用户注册时IP地址',
  `user_weibo` varchar(255) NOT NULL COMMENT '用户微博',
  `user_blood_type` char(3) NOT NULL COMMENT '用户血型',
  `user_lock` tinyint(3) NOT NULL COMMENT '是否锁定，0为不锁定，1为锁定',
  `user_freeze` tinyint(3) NOT NULL COMMENT '是否冻结，0为不冻结，1为冻结',
  `user_power` varchar(255) NOT NULL COMMENT '拥有权限',
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '12', '张三', '123456', '1352363335', '1', '1233333333', '222@qq.com', '贵州', '2017-12-08 16:12:42', '11', '192.168.1.1', '2017-12-08 16:13:07', '2222', '2222222', '2', '1', '1', '1');

-- ----------------------------
-- Table structure for user_comment
-- ----------------------------
DROP TABLE IF EXISTS `user_comment`;
CREATE TABLE `user_comment` (
  `c_id` mediumint(8) NOT NULL AUTO_INCREMENT COMMENT '评论自增ID号',
  `user_id` mediumint(8) NOT NULL COMMENT '收到评论的用户ID',
  `type_id` tinyint(3) NOT NULL COMMENT '评论栏目ID',
  `commit_id` mediumint(8) NOT NULL COMMENT '评论内容的ID',
  `commit_content` varchar(255) NOT NULL COMMENT '评论内容',
  `commit_user_id` mediumint(8) NOT NULL COMMENT '评论者ID',
  `commit_time` datetime NOT NULL COMMENT '评论时间',
  `commit_ip` varchar(15) NOT NULL COMMENT '评论时的IP地址',
  PRIMARY KEY (`c_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_comment
-- ----------------------------
