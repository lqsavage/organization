DROP TABLE IF EXISTS `hr_server_config`;
CREATE TABLE `hr_server_config` (
  `id` bigint(20) unsigned NOT NULL,
  `url` varchar(64) NOT NULL DEFAULT '' COMMENT '服务路径',
  `name` varchar(255) NOT NULL COMMENT '服务名称',
  `module` varchar(64) NOT NULL DEFAULT '' COMMENT '模块名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='服务管理';

DROP TABLE IF EXISTS `hr_func_register`;
CREATE TABLE `hr_func_register` (
  `id` bigint(20) unsigned NOT NULL,
  `url` varchar(64) NOT NULL DEFAULT '' COMMENT '节点路径',
  `name` varchar(255) NOT NULL COMMENT '节点名称',
  `code` varchar(64) NOT NULL COMMENT '节点编码',
  `description` varchar(255) COMMENT '描述',
  `module` varchar(64) NOT NULL DEFAULT '' COMMENT '所属模块',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='节点注册';

DROP TABLE IF EXISTS `hr_menuitem_reg`;
CREATE TABLE `hr_menuitem_reg` (
  `id` bigint(20) unsigned NOT NULL,
  `funcode` varchar(64) NOT NULL COMMENT '节点编码',
  `name` varchar(255) NOT NULL COMMENT '菜单名称',
  `code` varchar(64) NOT NULL COMMENT '菜单编码',
  `description` varchar(255) COMMENT '描述',
  `module` varchar(64) NOT NULL DEFAULT '' COMMENT '所属模块',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜单注册';