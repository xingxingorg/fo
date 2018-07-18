/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : db_aty

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-07-02 17:21:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_aty_code
-- ----------------------------
DROP TABLE IF EXISTS `t_aty_code`;
CREATE TABLE `t_aty_code` (
  `C_PID` varchar(50) NOT NULL DEFAULT '0' COMMENT '代码类型编号',
  `C_Code` varchar(50) NOT NULL COMMENT '代码',
  `C_Name` varchar(300) NOT NULL COMMENT '代码名称',
  `N_KWH` tinyint(4) NOT NULL DEFAULT '2' COMMENT '可否维护',
  `C_LevelInfo` varchar(300) DEFAULT NULL COMMENT '分级信息',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) NOT NULL DEFAULT '1' COMMENT '显示顺序',
  `C_Dmjp` varchar(300) DEFAULT NULL COMMENT '代码简拼',
  PRIMARY KEY (`C_PID`,`C_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代码表';

-- ----------------------------
-- Records of t_aty_code
-- ----------------------------
INSERT INTO `t_aty_code` VALUES ('-1', '1', '是', '1', null, '1', '1', null);
INSERT INTO `t_aty_code` VALUES ('-1', '2', '否', '1', null, '1', '2', null);
INSERT INTO `t_aty_code` VALUES ('-13', '1', '单值', '1', null, '1', '1', null);
INSERT INTO `t_aty_code` VALUES ('-13', '2', '多值', '1', null, '1', '2', null);
INSERT INTO `t_aty_code` VALUES ('-600', '1', '科技', '1', null, '1', '1', null);
INSERT INTO `t_aty_code` VALUES ('-600', '2', '文学', '1', null, '1', '2', null);
INSERT INTO `t_aty_code` VALUES ('800', '1', '控件相关', '1', null, '1', '1', 'kjxg');
INSERT INTO `t_aty_code` VALUES ('800', '2', '解析相关', '1', null, '1', '2', 'jxxg');
INSERT INTO `t_aty_code` VALUES ('800', '3', '插件相关', '1', null, '1', '3', 'cjxg');
INSERT INTO `t_aty_code` VALUES ('800', '4', '系统相关', '1', null, '1', '4', 'xtxg');
INSERT INTO `t_aty_code` VALUES ('800', '5', '用户手册', '1', null, '1', '5', 'yhsc');
INSERT INTO `t_aty_code` VALUES ('800', '6', '支持任务', '1', null, '1', '6', 'zcrw');
INSERT INTO `t_aty_code` VALUES ('800', '7', 'Artery4', '1', null, '1', '7', 'artery4');
INSERT INTO `t_aty_code` VALUES ('801', '1', '2', '1', null, '1', '1', 'artery20');
INSERT INTO `t_aty_code` VALUES ('801', '2', '2.5', '1', null, '1', '2', 'artery25');
INSERT INTO `t_aty_code` VALUES ('801', '3', '3', '1', null, '1', '3', 'artery30');
INSERT INTO `t_aty_code` VALUES ('801', '4', '4.1', '1', null, '1', '4', 'artery41');
INSERT INTO `t_aty_code` VALUES ('802', '1', '普通', '1', null, '1', '1', 'pt');
INSERT INTO `t_aty_code` VALUES ('802', '2', '重要', '1', null, '1', '2', 'zy');
INSERT INTO `t_aty_code` VALUES ('802', '3', '紧急', '1', null, '1', '3', 'jj');
INSERT INTO `t_aty_code` VALUES ('803', '1', '解决', '1', null, '1', '1', 'jj');
INSERT INTO `t_aty_code` VALUES ('803', '2', '问题需要再描述或处理', '1', null, '1', '2', 'wtxyzmshcl');
INSERT INTO `t_aty_code` VALUES ('803', '3', '问题无法复现', '1', null, '1', '3', 'wtwffx');
INSERT INTO `t_aty_code` VALUES ('803', '4', '非缺陷', '1', null, '1', '4', 'fqx');
INSERT INTO `t_aty_code` VALUES ('803', '5', '重提起：问题再次出现', '1', null, '1', '5', 'ctqwtzccx');
INSERT INTO `t_aty_code` VALUES ('803', '6', '关闭：问题结束', '1', null, '1', '6', 'gbwtjs');
INSERT INTO `t_aty_code` VALUES ('803', '7', '挂起：问题暂不处理', '1', null, '1', '7', 'gqwtzbcl');
INSERT INTO `t_aty_code` VALUES ('804', '1', '错误', '1', null, '1', '1', 'cw');
INSERT INTO `t_aty_code` VALUES ('804', '2', '建议', '1', null, '1', '2', 'jy');
INSERT INTO `t_aty_code` VALUES ('804', '3', '新需求', '1', null, '1', '3', 'xxq');

-- ----------------------------
-- Table structure for t_aty_codetype
-- ----------------------------
DROP TABLE IF EXISTS `t_aty_codetype`;
CREATE TABLE `t_aty_codetype` (
  `C_ID` varchar(50) NOT NULL COMMENT '代码类型编号',
  `C_Name` varchar(300) NOT NULL COMMENT '代码类型名称',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_SFKWH` tinyint(4) NOT NULL DEFAULT '2' COMMENT '是否可维护',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代码类型表';

-- ----------------------------
-- Records of t_aty_codetype
-- ----------------------------
INSERT INTO `t_aty_codetype` VALUES ('-1', '是否', '1', '2');
INSERT INTO `t_aty_codetype` VALUES ('-13', '代码类型', '1', '2');
INSERT INTO `t_aty_codetype` VALUES ('-600', '图书类别', '1', '1');
INSERT INTO `t_aty_codetype` VALUES ('800', '问题分组', '1', '1');
INSERT INTO `t_aty_codetype` VALUES ('801', 'Artery版本', '1', '1');
INSERT INTO `t_aty_codetype` VALUES ('802', '优先级', '1', '1');
INSERT INTO `t_aty_codetype` VALUES ('803', '问题状态', '1', '1');
INSERT INTO `t_aty_codetype` VALUES ('804', '问题类型', '1', '1');

-- ----------------------------
-- Table structure for t_aty_corp
-- ----------------------------
DROP TABLE IF EXISTS `t_aty_corp`;
CREATE TABLE `t_aty_corp` (
  `C_ID` varchar(50) NOT NULL COMMENT '标识',
  `C_Name` varchar(300) NOT NULL COMMENT '单位名称',
  `C_PID` varchar(300) DEFAULT NULL COMMENT '父代码',
  `N_Level` tinyint(4) NOT NULL DEFAULT '4' COMMENT '单位层级',
  `C_GBM` varchar(300) DEFAULT NULL COMMENT '国标码',
  `C_Alias` varchar(300) DEFAULT NULL COMMENT '简称',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) NOT NULL DEFAULT '1' COMMENT '显示顺序',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单位表';

-- ----------------------------
-- Records of t_aty_corp
-- ----------------------------

-- ----------------------------
-- Table structure for t_aty_dept
-- ----------------------------
DROP TABLE IF EXISTS `t_aty_dept`;
CREATE TABLE `t_aty_dept` (
  `C_ID` varchar(50) NOT NULL COMMENT '标识',
  `C_Name` varchar(300) NOT NULL COMMENT '部门名称',
  `C_PID` varchar(300) DEFAULT NULL COMMENT '父代码',
  `C_CORP` varchar(300) DEFAULT NULL COMMENT '所属单位',
  `C_Alias` varchar(300) DEFAULT NULL COMMENT '简称',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) NOT NULL DEFAULT '1' COMMENT '显示顺序',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of t_aty_dept
-- ----------------------------

-- ----------------------------
-- Table structure for t_aty_right
-- ----------------------------
DROP TABLE IF EXISTS `t_aty_right`;
CREATE TABLE `t_aty_right` (
  `C_RightKey` varchar(150) NOT NULL COMMENT '权限字',
  `C_Name` varchar(300) NOT NULL COMMENT '权限名称',
  `C_Descript` varchar(300) DEFAULT NULL COMMENT '描述',
  `N_Order` int(11) DEFAULT NULL COMMENT '显示顺序',
  PRIMARY KEY (`C_RightKey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of t_aty_right
-- ----------------------------
INSERT INTO `t_aty_right` VALUES ('artery', '系统权限', '1', null);
INSERT INTO `t_aty_right` VALUES ('artery.console', '控制台管理', '2', null);

-- ----------------------------
-- Table structure for t_aty_role
-- ----------------------------
DROP TABLE IF EXISTS `t_aty_role`;
CREATE TABLE `t_aty_role` (
  `C_ID` varchar(50) NOT NULL COMMENT 'ID',
  `C_Name` varchar(300) NOT NULL COMMENT '角色名称',
  `C_Descript` varchar(300) DEFAULT NULL COMMENT '描述',
  `N_XTGY` tinyint(4) DEFAULT '2' COMMENT '系统固有',
  `N_Valid` tinyint(4) DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) DEFAULT '1' COMMENT '显示顺序',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of t_aty_role
-- ----------------------------

-- ----------------------------
-- Table structure for t_aty_role_right
-- ----------------------------
DROP TABLE IF EXISTS `t_aty_role_right`;
CREATE TABLE `t_aty_role_right` (
  `C_ID` varchar(32) NOT NULL COMMENT 'ID',
  `C_RoleID` varchar(300) NOT NULL COMMENT '角色ID',
  `C_RightKey` varchar(300) NOT NULL COMMENT '权限字',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色-权限关系表';

-- ----------------------------
-- Records of t_aty_role_right
-- ----------------------------

-- ----------------------------
-- Table structure for t_aty_user
-- ----------------------------
DROP TABLE IF EXISTS `t_aty_user`;
CREATE TABLE `t_aty_user` (
  `C_ID` varchar(50) NOT NULL COMMENT '帐号ID',
  `C_LoginID` varchar(300) NOT NULL COMMENT '登录标识',
  `C_Name` varchar(300) NOT NULL COMMENT '姓名',
  `C_Password` varchar(32) NOT NULL DEFAULT 'D41D8CD98F00B204E9800998ECF8427E' COMMENT '密码',
  `C_Mail` varchar(300) DEFAULT NULL COMMENT '电子邮件',
  `C_IP` varchar(300) DEFAULT NULL COMMENT 'IP',
  `C_XMJP` varchar(300) DEFAULT NULL COMMENT '姓名简拼',
  `C_CORP` varchar(300) DEFAULT NULL COMMENT '所在单位',
  `C_DEPT` varchar(300) DEFAULT NULL COMMENT '所在部门',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) NOT NULL DEFAULT '1' COMMENT '显示顺序',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帐户表';

-- ----------------------------
-- Records of t_aty_user
-- ----------------------------
INSERT INTO `t_aty_user` VALUES ('-1', 'duxing', '超级管理员', 'ce421738b1c5540836bdc8ff707f1572', null, null, 'admin', null, null, '1', '1');

-- ----------------------------
-- Table structure for t_aty_user_right
-- ----------------------------
DROP TABLE IF EXISTS `t_aty_user_right`;
CREATE TABLE `t_aty_user_right` (
  `C_ID` varchar(32) NOT NULL COMMENT 'ID',
  `C_UserID` varchar(300) NOT NULL COMMENT '帐号ID',
  `N_Type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '类型',
  `C_RoleID` varchar(300) DEFAULT NULL COMMENT '角色ID',
  `C_RightKey` varchar(300) DEFAULT NULL COMMENT '权限字',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帐号-权限关系表';

-- ----------------------------
-- Records of t_aty_user_right
-- ----------------------------

-- ----------------------------
-- Table structure for t_code
-- ----------------------------
DROP TABLE IF EXISTS `t_code`;
CREATE TABLE `t_code` (
  `C_PID` varchar(50) NOT NULL DEFAULT '0' COMMENT '代码类型编号',
  `C_Code` varchar(50) NOT NULL COMMENT '代码',
  `C_Name` varchar(300) NOT NULL COMMENT '代码名称',
  `N_KWH` tinyint(4) NOT NULL DEFAULT '2' COMMENT '可否维护',
  `C_LevelInfo` varchar(300) DEFAULT NULL COMMENT '分级信息',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) NOT NULL DEFAULT '1' COMMENT '显示顺序',
  `C_Dmjp` varchar(300) DEFAULT NULL COMMENT '代码简拼',
  PRIMARY KEY (`C_PID`,`C_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代码表';

-- ----------------------------
-- Records of t_code
-- ----------------------------

-- ----------------------------
-- Table structure for t_codetype
-- ----------------------------
DROP TABLE IF EXISTS `t_codetype`;
CREATE TABLE `t_codetype` (
  `C_ID` varchar(50) NOT NULL COMMENT '代码类型编号',
  `C_Name` varchar(300) NOT NULL COMMENT '代码类型名称',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_SFKWH` tinyint(4) NOT NULL DEFAULT '2' COMMENT '是否可维护',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代码类型表';

-- ----------------------------
-- Records of t_codetype
-- ----------------------------

-- ----------------------------
-- Table structure for t_corp
-- ----------------------------
DROP TABLE IF EXISTS `t_corp`;
CREATE TABLE `t_corp` (
  `C_ID` varchar(50) NOT NULL COMMENT '标识',
  `C_Name` varchar(300) NOT NULL COMMENT '单位名称',
  `C_PID` varchar(300) DEFAULT NULL COMMENT '父代码',
  `N_Level` tinyint(4) NOT NULL DEFAULT '4' COMMENT '单位层级',
  `C_GBM` varchar(300) DEFAULT NULL COMMENT '国标码',
  `C_Alias` varchar(300) DEFAULT NULL COMMENT '简称',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) NOT NULL DEFAULT '1' COMMENT '显示顺序',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单位表';

-- ----------------------------
-- Records of t_corp
-- ----------------------------
INSERT INTO `t_corp` VALUES ('-1', '七里河洗菜厂', null, '4', null, null, '1', '1');

-- ----------------------------
-- Table structure for t_dept
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `C_ID` varchar(50) NOT NULL COMMENT '标识',
  `C_Name` varchar(300) NOT NULL COMMENT '部门名称',
  `C_PID` varchar(300) DEFAULT NULL COMMENT '父代码',
  `C_CORP` varchar(300) DEFAULT NULL COMMENT '所属单位',
  `C_Alias` varchar(300) DEFAULT NULL COMMENT '简称',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) NOT NULL DEFAULT '1' COMMENT '显示顺序',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('1', '前院', null, '-1', null, '1', '1');
INSERT INTO `t_dept` VALUES ('2', '后院', null, '-1', null, '1', '1');

-- ----------------------------
-- Table structure for t_position
-- ----------------------------
DROP TABLE IF EXISTS `t_position`;
CREATE TABLE `t_position` (
  `C_ID` varchar(32) NOT NULL COMMENT 'ID',
  `C_Name` varchar(300) NOT NULL COMMENT '名称',
  `N_BasicWage` decimal(6,2) DEFAULT NULL COMMENT '基本工资',
  `N_Radish_Price` decimal(9,2) DEFAULT NULL COMMENT '萝卜单价',
  `N_Carrot_Price` decimal(9,2) DEFAULT NULL COMMENT '胡萝卜单价',
  `N_Loading_Price` decimal(9,2) DEFAULT NULL COMMENT '装车单价',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) NOT NULL DEFAULT '1' COMMENT '显示顺序',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职务表';

-- ----------------------------
-- Records of t_position
-- ----------------------------
INSERT INTO `t_position` VALUES ('1', '女洗菜工', '50.00', '7.00', '6.00', '0.00', '1', '1');
INSERT INTO `t_position` VALUES ('2', '男洗菜工', '80.00', '8.00', '9.00', '4.00', '1', '1');

-- ----------------------------
-- Table structure for t_staff
-- ----------------------------
DROP TABLE IF EXISTS `t_staff`;
CREATE TABLE `t_staff` (
  `C_ID` varchar(32) NOT NULL COMMENT 'ID',
  `C_Name` varchar(300) NOT NULL COMMENT '姓名',
  `C_Telphone` varchar(300) DEFAULT NULL COMMENT '电话',
  `C_Position` varchar(32) DEFAULT NULL COMMENT '职务',
  `N_Sex` tinyint(4) NOT NULL DEFAULT '1' COMMENT '性别',
  `C_CORP` varchar(300) DEFAULT NULL COMMENT '所在单位',
  `C_DEPT` varchar(300) DEFAULT NULL COMMENT '所在部门',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) NOT NULL DEFAULT '1' COMMENT '显示顺序',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职员表';

-- ----------------------------
-- Records of t_staff
-- ----------------------------
INSERT INTO `t_staff` VALUES ('1', '张大姐', null, '1', '1', '-1', '1', '1', '1');
INSERT INTO `t_staff` VALUES ('2', '李婶', null, '1', '1', '-1', '2', '1', '1');
INSERT INTO `t_staff` VALUES ('3', '张大哥', null, '2', '2', '-1', '1', '1', '1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `C_ID` varchar(50) NOT NULL COMMENT '帐号ID',
  `C_LoginID` varchar(300) NOT NULL COMMENT '登录标识',
  `C_Name` varchar(300) NOT NULL COMMENT '姓名',
  `C_Password` varchar(32) NOT NULL DEFAULT 'D41D8CD98F00B204E9800998ECF8427E' COMMENT '密码',
  `C_Mail` varchar(300) DEFAULT NULL COMMENT '电子邮件',
  `C_IP` varchar(300) DEFAULT NULL COMMENT 'IP',
  `C_XMJP` varchar(300) DEFAULT NULL COMMENT '姓名简拼',
  `C_CORP` varchar(300) DEFAULT NULL COMMENT '所在单位',
  `C_DEPT` varchar(300) DEFAULT NULL COMMENT '所在部门',
  `N_Valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `N_Order` smallint(6) NOT NULL DEFAULT '1' COMMENT '显示顺序',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帐户表';

-- ----------------------------
-- Records of t_user
-- ----------------------------

-- ----------------------------
-- Table structure for t_wagerecord
-- ----------------------------
DROP TABLE IF EXISTS `t_wagerecord`;
CREATE TABLE `t_wagerecord` (
  `C_ID` varchar(32) NOT NULL COMMENT '主键',
  `C_Staff` varchar(32) DEFAULT NULL COMMENT '职员id',
  `C_Position` varchar(32) DEFAULT NULL COMMENT '职务id',
  `N_Radish_Quantity` decimal(9,2) DEFAULT NULL COMMENT '萝卜数量',
  `N_Carrot_Quantity` decimal(9,2) DEFAULT NULL COMMENT '胡萝卜数量',
  `N_Loading_Quantity` decimal(9,2) DEFAULT NULL COMMENT '装车数量',
  `N_RealSalary` decimal(9,2) DEFAULT NULL COMMENT '实际工资',
  `N_WorkingHours` decimal(3,1) DEFAULT NULL COMMENT '工时',
  `N_OvertimeWork` decimal(3,1) DEFAULT NULL COMMENT '加班工时',
  `D_InsertDate` date DEFAULT NULL COMMENT '记录日期',
  `DT_CreateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工资记录表';

-- ----------------------------
-- Records of t_wagerecord
-- ----------------------------
