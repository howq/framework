/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : wp_bm

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-11-04 01:46:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wp_commentmeta
-- ----------------------------
DROP TABLE IF EXISTS `wp_commentmeta`;
CREATE TABLE `wp_commentmeta` (
  `meta_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增唯一ID',
  `comment_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '对应评论ID',
  `meta_key` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL COMMENT '键名',
  `meta_value` longtext COLLATE utf8mb4_unicode_520_ci COMMENT '键值',
  PRIMARY KEY (`meta_id`),
  KEY `comment_id` (`comment_id`),
  KEY `meta_key` (`meta_key`(191))
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_comments
-- ----------------------------
DROP TABLE IF EXISTS `wp_comments`;
CREATE TABLE `wp_comments` (
  `comment_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增唯一ID',
  `comment_post_ID` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '对应文章ID',
  `comment_author` tinytext COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '评论者',
  `comment_author_email` varchar(100) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '评论者邮箱',
  `comment_author_url` varchar(200) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '评论者网址',
  `comment_author_IP` varchar(100) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '评论者IP',
  `comment_date` datetime NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '评论时间',
  `comment_date_gmt` datetime NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '评论时间（GMT+0时间）',
  `comment_content` text COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '评论正文',
  `comment_karma` int(11) NOT NULL DEFAULT '0' COMMENT '',
  `comment_approved` varchar(20) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '1' COMMENT '评论是否被批准',
  `comment_agent` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '评论者的USER AGENT',
  `comment_type` varchar(20) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '评论类型(pingback/普通)',
  `comment_parent` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '父评论ID',
  `user_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '评论者用户ID（不一定存在）',
  PRIMARY KEY (`comment_ID`),
  KEY `comment_post_ID` (`comment_post_ID`),
  KEY `comment_approved_date_gmt` (`comment_approved`,`comment_date_gmt`),
  KEY `comment_date_gmt` (`comment_date_gmt`),
  KEY `comment_parent` (`comment_parent`),
  KEY `comment_author_email` (`comment_author_email`(10))
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_links
-- ----------------------------
DROP TABLE IF EXISTS `wp_links`;
CREATE TABLE `wp_links` (
  `link_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增唯一ID',
  `link_url` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '链接URL',
  `link_name` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '链接标题',
  `link_image` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '链接图片',
  `link_target` varchar(25) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '链接打开方式',
  `link_description` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '链接描述',
  `link_visible` varchar(20) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT 'Y' COMMENT '是否可见（Y/N）',
  `link_owner` bigint(20) unsigned NOT NULL DEFAULT '1' COMMENT '添加者用户ID',
  `link_rating` int(11) NOT NULL DEFAULT '0' COMMENT '评分等级',
  `link_updated` datetime NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '',
  `link_rel` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT 'XFN关系',
  `link_notes` mediumtext COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT 'XFN注释',
  `link_rss` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '链接RSS地址',
  PRIMARY KEY (`link_id`),
  KEY `link_visible` (`link_visible`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_options
-- ----------------------------
DROP TABLE IF EXISTS `wp_options`;
CREATE TABLE `wp_options` (
  `option_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增唯一ID',
  `option_name` varchar(191) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '键名',
  `option_value` longtext COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '键值',
  `autoload` varchar(20) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT 'yes' COMMENT '在WordPress载入时自动载入（yes/no）',
  PRIMARY KEY (`option_id`),
  UNIQUE KEY `option_name` (`option_name`)
) ENGINE=MyISAM AUTO_INCREMENT=240 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_postmeta
-- ----------------------------
DROP TABLE IF EXISTS `wp_postmeta`;
CREATE TABLE `wp_postmeta` (
  `meta_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增唯一ID',
  `post_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '对应文章ID',
  `meta_key` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL COMMENT '键名',
  `meta_value` longtext COLLATE utf8mb4_unicode_520_ci COMMENT '键值',
  PRIMARY KEY (`meta_id`),
  KEY `post_id` (`post_id`),
  KEY `meta_key` (`meta_key`(191))
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_posts
-- ----------------------------
DROP TABLE IF EXISTS `wp_posts`;
CREATE TABLE `wp_posts` (
  `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增唯一ID',
  `post_author` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '对应作者ID',
  `post_date` datetime NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '发布时间',
  `post_date_gmt` datetime NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '发布时间（GMT+0时间）',
  `post_content` longtext COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '正文',
  `post_title` text COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '标题',
  `post_excerpt` text COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '摘录',
  `post_status` varchar(20) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT 'publish' COMMENT '文章状态（publish/auto-draft/inherit等）',
  `comment_status` varchar(20) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT 'open' COMMENT '评论状态（open/closed）',
  `ping_status` varchar(20) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT 'open' COMMENT 'PING状态（open/closed）',
  `post_password` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '文章密码',
  `post_name` varchar(200) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '文章缩略名',
  `to_ping` text COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '',
  `pinged` text COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '已经PING过的链接',
  `post_modified` datetime NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '修改时间',
  `post_modified_gmt` datetime NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '修改时间（GMT+0时间）',
  `post_content_filtered` longtext COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '',
  `post_parent` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '父文章，主要用于PAGE',
  `guid` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '',
  `menu_order` int(11) NOT NULL DEFAULT '0' COMMENT '排序ID',
  `post_type` varchar(20) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT 'post' COMMENT '文章类型（post/page等）',
  `post_mime_type` varchar(100) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT 'MIME类型',
  `comment_count` bigint(20) NOT NULL DEFAULT '0' COMMENT '评论总数',
  PRIMARY KEY (`ID`),
  KEY `post_name` (`post_name`(191)),
  KEY `type_status_date` (`post_type`,`post_status`,`post_date`,`ID`),
  KEY `post_parent` (`post_parent`),
  KEY `post_author` (`post_author`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_termmeta
-- ----------------------------
DROP TABLE IF EXISTS `wp_termmeta`;
CREATE TABLE `wp_termmeta` (
  `meta_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增唯一ID',
  `term_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '对应分类ID',
  `meta_key` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL COMMENT '键名',
  `meta_value` longtext COLLATE utf8mb4_unicode_520_ci COMMENT '键值',
  PRIMARY KEY (`meta_id`),
  KEY `term_id` (`term_id`),
  KEY `meta_key` (`meta_key`(191))
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_terms
-- ----------------------------
DROP TABLE IF EXISTS `wp_terms`;
CREATE TABLE `wp_terms` (
  `term_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `name` varchar(200) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '分类名',
  `slug` varchar(200) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '缩略名',
  `term_group` bigint(10) NOT NULL DEFAULT '0' COMMENT '分类组别',
  PRIMARY KEY (`term_id`),
  KEY `slug` (`slug`(191)),
  KEY `name` (`name`(191))
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_term_relationships
-- ----------------------------
DROP TABLE IF EXISTS `wp_term_relationships`;
CREATE TABLE `wp_term_relationships` (
  `object_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '对应文章ID/链接ID',
  `term_taxonomy_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '对应分类方法ID',
  `term_order` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`object_id`,`term_taxonomy_id`),
  KEY `term_taxonomy_id` (`term_taxonomy_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_term_taxonomy
-- ----------------------------
DROP TABLE IF EXISTS `wp_term_taxonomy`;
CREATE TABLE `wp_term_taxonomy` (
  `term_taxonomy_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '分类方法ID',
  `term_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '分类方法(category/post_tag)',
  `taxonomy` varchar(32) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '描述',
  `description` longtext COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '排序',
  `parent` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '所属父分类方法ID',
  `count` bigint(20) NOT NULL DEFAULT '0' COMMENT '文章数统计',
  PRIMARY KEY (`term_taxonomy_id`),
  UNIQUE KEY `term_id_taxonomy` (`term_id`,`taxonomy`),
  KEY `taxonomy` (`taxonomy`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_usermeta
-- ----------------------------
DROP TABLE IF EXISTS `wp_usermeta`;
CREATE TABLE `wp_usermeta` (
  `umeta_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增唯一ID',
  `user_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '对应用户ID',
  `meta_key` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL COMMENT '键名',
  `meta_value` longtext COLLATE utf8mb4_unicode_520_ci COMMENT '键值',
  PRIMARY KEY (`umeta_id`),
  KEY `user_id` (`user_id`),
  KEY `meta_key` (`meta_key`(191))
) ENGINE=MyISAM AUTO_INCREMENT=395 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

-- ----------------------------
-- Table structure for wp_users
-- ----------------------------
DROP TABLE IF EXISTS `wp_users`;
CREATE TABLE `wp_users` (
  `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增唯一ID',
  `user_login` varchar(60) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '登录名',
  `user_pass` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '密码',
  `user_nicename` varchar(50) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '昵称',
  `user_email` varchar(100) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT 'Email',
  `user_url` varchar(100) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '网址',
  `user_registered` datetime NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '注册时间',
  `user_activation_key` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '激活码',
  `user_status` int(11) NOT NULL DEFAULT '0' COMMENT '用户状态',
  `display_name` varchar(250) COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '用户显示名称',
  PRIMARY KEY (`ID`),
  KEY `user_login_key` (`user_login`),
  KEY `user_nicename` (`user_nicename`),
  KEY `user_email` (`user_email`)
) ENGINE=MyISAM AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
